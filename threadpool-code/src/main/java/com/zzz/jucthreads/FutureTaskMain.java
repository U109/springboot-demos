package com.zzz.jucthreads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author zhangzhongzhen wrote on 2024/3/4
 * @version 1.0
 * @description:
 */
public class FutureTaskMain {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(2000);
                return "result";
            }
        });

        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }

}
