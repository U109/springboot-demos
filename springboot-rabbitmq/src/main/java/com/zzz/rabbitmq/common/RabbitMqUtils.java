package com.zzz.rabbitmq.common;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * @author zhangzhongzhen wrote on 2023/12/29
 * @version 1.0
 * @description:
 */
public class RabbitMqUtils {

    // 获得RabbitMQ连接的channel
    public static Channel getChannel() throws Exception {
        // 创建一个连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("117.72.38.212");
        factory.setUsername("zzz");
        factory.setPassword("123456");
        // 创建一个connection
        Connection connection = factory.newConnection();
        // 创建一个channel
        return connection.createChannel();
    }

}
