package com.example.feng.ftproject.model;

/**
 * Created by Chexiangjia-MAC on 17/6/21.
 */

public class ShopModel extends BModel {
    public ShopModel(String sName, int sTime) {
        this.sName = sName;
        this.sTime = sTime;
    }

    public ShopModel() {

    }


    public String sName = "sname";
    public int sTime = 100;
}
