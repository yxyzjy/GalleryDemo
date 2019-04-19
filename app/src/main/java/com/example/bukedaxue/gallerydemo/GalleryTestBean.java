package com.example.bukedaxue.gallerydemo;

import java.util.List;

public class GalleryTestBean {


    /**
     * class_id : 5
     * title : 高效通关班
     * slogan : 1999班型测试
     * cover : http://bukeres.oss-cn-hangzhou.aliyuncs.com/images/2019/01/09/133152/38YNFzMsLLDAvsQk.png
     * background : http://bukeres.oss-cn-hangzhou.aliyuncs.com/images/2019/01/09/132947/zLmVXCfn6Woz1D1n.png
     * price : 1999.00
     * max_users : 1000
     * is_paid : 0
     * product_id : 1
     * students : 906
     * service_count : 22
     * video_duration : 1
     * live_duration : 1
     */

    private String class_id;
    private String title;
    private String slogan;
    private String cover;
    private String background;
    private String price;
    private int max_users;
    private int is_paid;
    private String product_id;
    private String students;
    private int service_count;
    private String video_duration;
    private String live_duration;
    private String buyable;

    public String getBuyable() {
        return buyable;
    }

    public void setBuyable(String buyable) {
        this.buyable = buyable;
    }

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getMax_users() {
        return max_users;
    }

    public void setMax_users(int max_users) {
        this.max_users = max_users;
    }

    public int getIs_paid() {
        return is_paid;
    }

    public void setIs_paid(int is_paid) {
        this.is_paid = is_paid;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getStudents() {
        return students;
    }

    public void setStudents(String students) {
        this.students = students;
    }

    public int getService_count() {
        return service_count;
    }

    public void setService_count(int service_count) {
        this.service_count = service_count;
    }

    public String getVideo_duration() {
        return video_duration;
    }

    public void setVideo_duration(String video_duration) {
        this.video_duration = video_duration;
    }

    public String getLive_duration() {
        return live_duration;
    }

    public void setLive_duration(String live_duration) {
        this.live_duration = live_duration;
    }
}
