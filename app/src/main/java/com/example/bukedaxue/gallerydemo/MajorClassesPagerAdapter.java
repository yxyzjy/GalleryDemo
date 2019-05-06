package com.example.bukedaxue.gallerydemo;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.bukedaxue.gallerydemo.activity.LeftFlowActivity;

import java.util.ArrayList;
import java.util.List;


public class MajorClassesPagerAdapter extends PagerAdapter {

    ArrayList<GalleryTestBean> picList;
    Context mContext;
    private ClassItemClickListener listener;


    public MajorClassesPagerAdapter(Context context, List<GalleryTestBean> picList, ClassItemClickListener listener) {

        this.mContext = context;
        this.picList = (ArrayList<GalleryTestBean>) picList;
        this.listener = listener;

    }


    @Override
    public int getCount() { // 获得size
        return picList.size();
    }

    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0 == arg1;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((View) object);

    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        GalleryTestBean item = picList.get(position);
        LinearLayout view = (LinearLayout) LayoutInflater.from(mContext).inflate(R.layout.item_major_class_select, null);
        TextView tvMajorClassNum = view.findViewById(R.id.tv_major_class_num);
        TextView tvMajorClassVideoDuration = view.findViewById(R.id.tv_major_class_video_duration);
        TextView tvMajorClassLiveDuration = view.findViewById(R.id.tv_major_class_live_duration);

        tvMajorClassNum.setText(String.valueOf(item.getService_count()));
//        tvMajorClassVideoDuration.setText(item.getVideo_duration() + "小时录播课程内容");
//        tvMajorClassLiveDuration.setText(item.getLive_duration() + "小时直播课程内容");

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*if (listener != null) {
                    listener.onItemClick(position);
                }*/
                Intent intent = new Intent(mContext, LeftFlowActivity.class);
                mContext.startActivity(intent);

            }
        });

        ((ViewPager) container).addView(view);
        return view;
    }

    public interface ClassItemClickListener {
        void onItemClick(int pos);
    }


}