package com.example.feng.ftproject.model;

/**
 * Created by Chexiangjia-MAC on 17/6/21.
 */

public class F<T extends Bs> {
    public T create(Bs t){
        if(t instanceof Bss){
            return (T) new Ass();
        }else{
            return (T) new Bss();
        }

    }
}
