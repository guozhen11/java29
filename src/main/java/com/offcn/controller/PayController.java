package com.offcn.controller;

import java.util.Date;

/**
 * @author guozhen
 * @create 2020-12-20  21:17
 */
public class PayController {
    public static void main(String[] args) {
        long time = new Date().getTime();
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        long time2 = new Date().getTime();
        System.out.println(time2-time);
    }
}
