package com.example.bukedaxue.gallerydemo;

import android.content.Context;
import android.util.DisplayMetrics;

import com.example.bukedaxue.gallerydemo.activity.MyApplication;


/**
 */

public class SystemUtil {

    static Context context = MyApplication.getInstance();


    /**
     * 返回系统屏幕的高度（像素单位）
     */
    public static int Height() {
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        int height = dm.heightPixels;
        return height;
    }

    /**
     * 返回系统屏幕的宽度（像素单位）
     */
    public static int Width() {
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        int width = dm.widthPixels;
        return width;
    }
}
