package com.zzz.threadpool.rejectpolicy;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * @author zhangzhongzhen wrote on 2024/1/14
 * @version 1.0
 * @description:
 */
public class RejectPolicyTests {

    @Test
    public void testRejectPolicy() throws InterruptedException {

        BlockingQueue<Runnable> workerQueue = new ArrayBlockingQueue<>(1);

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 1L, TimeUnit.SECONDS, workerQueue, new CustomiseRejectPolicy());


        for (int i = 0; i < 19; i++) {
            int finalI = i;
            Thread thread = new Thread(() -> {
                try {
                    System.out.println("执行线程 ： " + finalI);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            thread.setName("thread-name : " + 1);
            threadPoolExecutor.execute(thread);
        }
        new CountDownLatch(1).await();

    }

}
