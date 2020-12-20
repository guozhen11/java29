package com.offcn.controller;

import sun.net.util.IPAddressUtil;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Date;

/**
 * @author guozhen
 * @create 2020-12-20  21:17
 */
public class PayController {
    private static String hostIp;
    private static String username;
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        hostIp = Arrays.toString(localHost.getAddress());
        username = localHost.getHostName();
        System.out.println("当前的主机ip地址为"+ hostIp+"主机的名称为"+username);
    }
}
