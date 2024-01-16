package com.zzz.rabbitmq;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * @author zhangzhongzhen wrote on 2023/12/28
 * @version 1.0
 * @description:
 */
@SpringBootApplication
@ComponentScan("com.zzz.rabbitmq.pos")
public class RabbitMqController {

    public static void main(String[] args) {
        SpringApplication.run(RabbitMqController.class, args);
    }


}
