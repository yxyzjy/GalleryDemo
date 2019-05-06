package com.example.bukedaxue.gallerydemo.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.bukedaxue.gallerydemo.GalleryTestBean;
import com.example.bukedaxue.gallerydemo.MajorClassesPagerAdapter;
import com.example.bukedaxue.gallerydemo.R;
import com.example.bukedaxue.gallerydemo.ScaleAlphaPageTransformer;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MajorClassesPagerAdapter.ClassItemClickListener {

    private ViewPager viewPager;
    private LinearLayout llPoint;
    private ArrayList<GalleryTestBean> lists = new ArrayList<>();
    private ImageView[] imageViews;//定义一个ImageVIew数组，来存放生成的小圆点
    private ImageView imageView;
    private int selectClassPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.vp_grallery);
        llPoint = findViewById(R.id.ll_point);

        for (int i = 0; i < 5; i++) {
            GalleryTestBean testBean = new GalleryTestBean();
            testBean.setService_count(i);
            testBean.setVideo_duration("20"+i);
            testBean.setLive_duration("10"+i);
            lists.add(testBean);
        }

        MajorClassesPagerAdapter classesPagerAdapter = new MajorClassesPagerAdapter(this, lists, this);
        viewPager.setAdapter(classesPagerAdapter);
        viewPager.setOffscreenPageLimit(2);//预加载2个
        viewPager.setPageMargin(2);//设置viewpage之间的间距
        viewPager.setPageTransformer(true, new ScaleAlphaPageTransformer());
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                //判断当前是在那个page，就把对应下标的ImageView原点设置为选中状态的图片
                for (int i = 0; i < imageViews.length; i++) {
                    imageViews[position].setBackgroundResource(R.drawable.gray_round_acacac);
                    if (position != i) {
                        imageViews[i].setBackgroundResource(R.drawable.gray_round_dbdbdb);
                    }
                }
                selectClassPos = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        initClassesPointe(lists.size());
    }


    private void initClassesPointe(int size) {
        llPoint.removeAllViews();
        //有多少个界面就new多长的数组
        imageViews = new ImageView[size];
        for (int i = 0; i < imageViews.length; i++) {
            //new新的ImageView控件
            imageView = new ImageView(this);
            //设置控件的宽高
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(20, 20);
            layoutParams.setMargins(10, 0, 10, 0);
            imageView.setLayoutParams(layoutParams);
            imageViews[i] = imageView;
            //初始化第一个page页面的图片的原点为选中状态
            if (i == 0) {
                //表示当前图片
                imageViews[i].setBackgroundResource(R.drawable.gray_round_acacac);
            } else {
                imageViews[i].setBackgroundResource(R.drawable.gray_round_dbdbdb);
            }
            //把new出来的ImageView控件添加到线性布局中
            llPoint.addView(imageViews[i]);
        }
    }

    @Override
    public void onItemClick(int pos) {

    }
}
