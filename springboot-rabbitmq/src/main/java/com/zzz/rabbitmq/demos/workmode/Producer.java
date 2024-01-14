package com.zzz.rabbitmq.demos.workmode;

import com.rabbitmq.client.Channel;
import com.zzz.rabbitmq.demos.common.RabbitMqUtils;

import java.util.Scanner;

/**
 * @author zhangzhongzhen wrote on 2023/12/29
 * @version 1.0
 * @description:
 */
public class Producer {

    public static String QUEUE_NAME = "work";

    public static void main(String[] args) throws Exception {
        // 创建channel
        Channel channel = RabbitMqUtils.getChannel();
        // 声明队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        // 发送消息
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String message = scanner.next();
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            System.out.println("消息发送完毕：" + message);
        }
    }
}
