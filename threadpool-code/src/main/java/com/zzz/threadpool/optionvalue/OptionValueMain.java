package com.zzz.threadpool.optionvalue;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhangzhongzhen wrote on 2024/2/24
 * @version 1.0
 * @description:
 */
public class OptionValueMain {
    private static volatile Integer  n = -1;
    public static void main(String[] args) throws InterruptedException {


        CountDownLatch cdl = new CountDownLatch(10);

        long startTime = System.currentTimeMillis();


        for (int i = 0; i < 100000; i++) {

            int finalI = i;

                synchronized (cdl){
                    if (finalI > n){
                        System.out.println("finalI : " + finalI + " n : " + n);
                        n = finalI;
                    }
                }



        }

        System.out.println("cost time : " + (System.currentTimeMillis() - startTime));

        Thread.sleep(1000);



        System.out.println(n);
    }


}
