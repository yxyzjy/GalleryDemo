package com.example.bukedaxue.gallerydemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by chenxiaoping on 2017/3/28.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private Context mContext;

    private String[] mColors = {"http://b-ssl.duitang.com/uploads/item/201706/22/20170622131955_h4eZS.thumb.700_0.jpeg",
            "http://g.hiphotos.baidu.com/zhidao/pic/item/d833c895d143ad4bd74bac3f85025aafa50f06e3.jpg",
            "http://b-ssl.duitang.com/uploads/item/201505/02/20150502133843_uaHR3.jpeg",
            "http://b-ssl.duitang.com/uploads/item/201510/05/20151005144251_LXtsH.jpeg",
            "http://img.52z.com/upload/news/image/20180528/20180528111619_71841.jpg",
            "http://img.52z.com/upload/news/image/20180926/20180926094643_13127.jpg"};

    private onItemClick clickCb;

    public Adapter(Context c) {
        mContext = c;
    }

    public Adapter(Context c, onItemClick cb) {
        mContext = c;
        clickCb = cb;
    }

    public void setOnClickLstn(onItemClick cb) {
        this.clickCb = cb;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.layout_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Glide.with(mContext).load(mColors[position % mColors.length])
                .into(holder.img);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(mContext, "点击了："+position, Toast.LENGTH_SHORT).show();
                if (clickCb != null) {
                    clickCb.clickItem(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        public ViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.img);
        }
    }

    public interface onItemClick {
        void clickItem(int pos);
    }
}
