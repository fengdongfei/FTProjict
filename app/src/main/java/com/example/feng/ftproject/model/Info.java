package com.example.feng.ftproject.model;

/**
 * Created by Chexiangjia-MAC on 17/6/21.
 */

class Info<T extends BModel> {
    // 指定上限，只能是数字类型
    private T var;

    // 此类型由外部决定
    public T getVar() {
        return this.var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    public String toString() {
        return this.var.toString();
    }
};