package com.zzz.rabbitmq.demos.simplemode;

import com.rabbitmq.client.Channel;
import com.zzz.rabbitmq.demos.common.RabbitMqUtils;

/**
 * @author zhangzhongzhen wrote on 2023/12/28
 * @version 1.0
 * @description:
 */
public class Producer {

    public static String QUEUE_NAME = "simple";

    public static void main(String[] args) throws Exception {

        Channel channel = RabbitMqUtils.getChannel();
        /*
         * 创建一个队列
         * 1.队列名称
         * 2.队列里面的消息是否持久化(默认为false,代表消息存储在内存中)
         * 3.该队列是否只供一个消费者进行消费,是否进行共享(true表示可以多个消费者消费)
         * 4.表示最后一个消费者断开连接以后,该队列是否自动删除(true表示自动删除)
         * 5.其他参数
         */
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        String message = "hello world";

        channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
        System.out.println("消息发送完毕");
    }
}
