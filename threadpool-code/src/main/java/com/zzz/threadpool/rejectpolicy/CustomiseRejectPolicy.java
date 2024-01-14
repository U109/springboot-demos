package com.zzz.threadpool.rejectpolicy;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author zhangzhongzhen wrote on 2024/1/14
 * @version 1.0
 * @description:
 */
public class CustomiseRejectPolicy implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor executor) {
        System.out.println("执行拒绝策略");
    }
}
