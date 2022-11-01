package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {23,4,3,0,5,10,13,14,17};
        System.out.println(Arrays.toString(a));
        arr.task1(a);
        System.out.println(Arrays.toString(a));
        System.out.println("----------------------");
        int[] b = {0,0,1,1,1,0,0,1,0,0};
        System.out.println(Arrays.toString(b));
        arr.task2(b);
        System.out.println("----------------------");
        int[] c = {1,2,3,3,4,4,5,2,6,8,6,10,12,10};
        System.out.println(Arrays.toString(c));
        arr.task3(c);
        System.out.println("----------------------");
        int[][] m = {
                {9,2,7},
                {4,6,8},
                {5,10,3}
        };
        for(int i=0; i<m.length; i++)
            System.out.println(Arrays.toString(m[i]));
        arr.task4(m);
    }
}
