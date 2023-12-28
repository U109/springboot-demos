package com.zzz.rabbitmq.simplemode;

import com.rabbitmq.client.*;
import com.zzz.rabbitmq.common.RabbitMqUtils;

/**
 * @author zhangzhongzhen wrote on 2023/12/28
 * @version 1.0
 * @description:
 */
public class Consumer {

    // 队列名称
    public static String QUEUE_NAME = "simple";

    public static void main(String[] args) throws Exception {

        Channel channel = RabbitMqUtils.getChannel();
        /*
         * 消费者消费消息
         * 1.消费的队列名称
         * 2.消费成功之后是否要自动应答(true代表自动应答,false代表手动应答)
         * 3.消费者消费消息的回调(函数式接口)
         * 4.消费者取消消费的回调(函数式接口)
         */
        // 消费消息的回调
        DeliverCallback deliverCallback = (consumerTag, message) -> {
            System.out.println("成功消费消息,内容为:" + new String(message.getBody()));
        };
        // 取消消费的回调
        CancelCallback cancelCallback = (consumerTag) -> {
            System.out.println("消息消费被中断");
        };
        channel.basicConsume(QUEUE_NAME, true, deliverCallback, cancelCallback);
    }
}
