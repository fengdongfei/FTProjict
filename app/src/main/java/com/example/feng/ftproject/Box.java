package com.example.feng.ftproject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/**
 * 泛型类和泛形方法定义
 * 在泛型接口、泛型类和泛型方法的定义过程中，我们常见的如T、E、K、V等形式的参数常用于表示泛型形参，由于接收来自外部使用时候传入的类型实参
 */

public  class Box<T> {

    private T data;

    public Box() {

    }

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    private <T> List<T> cashFutures(List<Future<T>> futures) {

        List<T> values = new ArrayList<T>();

        for (Future<T> future : futures) {
            try {
                values.add(future.get());
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }

        return values;
    }


}