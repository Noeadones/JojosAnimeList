package com.practice.anime.anime.Utils;


import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Factory<T, V> {

    T ob1;
    V ob2;

    public Factory() {
    }

    public Factory(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    public T getOb1() {
        return ob1;
    }

    public void setOb1(T ob1) {
        this.ob1 = ob1;
    }

    public List<T> copyListEntiy (Class<T> ob1, List<V> ob2)  {

        List<T> list = new ArrayList<T>();

        ob2.forEach( ob -> {
            try {
                T DTO = ob1.newInstance();

                BeanUtils.copyProperties(ob, DTO);
                list.add(DTO);

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
        
        return list;
    }
}
