package com.jnshu.carrots.homeservice.util;

public class StringToInt {

    public int[] stringToInt(String[] arrs){
        int[] num = new int[arrs.length];
        for(int i=0;i<arrs.length;i++){
            num[i] = Integer.parseInt(arrs[i]);
        }
        return num;
    }

}
