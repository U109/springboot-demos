package com.zzz.javacode.inheritance;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: Zzz
 * @date: 2024/1/16 11:20
 * @description:
 */
public class Son extends Father {


    public Son(String name) {
        this();
        System.out.println(name);
    }

    public Son() {
        System.out.println("son");
    }

    public static void main(String[] args) {
        Son son = new Son("zzz");

        Father father = new Father();
        if (father instanceof Son son1){
            System.out.println(son1);
        }
    }




}
