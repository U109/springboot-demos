package com.zzz.rabbitmq.demos.cyclepush;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.zzz.rabbitmq.demos.common.RabbitMqUtils;

/**
 * @author zhangzhongzhen wrote on 2024/1/14
 * @version 1.0
 * @description:
 */
public class Producer {


    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMqUtils.getChannel();

        channel.exchangeDeclare("binlogs", BuiltinExchangeType.FANOUT);

        for (int i = 0; i <= 100; i++) {
            byte[] data = new byte[1024];
            channel.basicPublish("binlogs", "", null, data);
            System.out.println("发送数据成功！当前发送大小 ： " + i + "M");
            Thread.sleep(500);
        }

    }
}
