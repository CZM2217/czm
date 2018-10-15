package com.jnshu.carrots.homeservice.util;

import java.util.ArrayList;

public class ArrayToListUtil {

    public ArrayList<Integer> change(int []array) {

        ArrayList<Integer> list = new ArrayList<>();
        if (array != null) {
            for (int i : array) {
                list.add(i);
            }
        }
        return list;

    }

}
