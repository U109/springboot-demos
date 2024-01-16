package com.zzz.rabbitmq;

import com.zzz.rabbitmq.pos.mq.Receiver;
import com.zzz.rabbitmq.pos.service.SenderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhangzhongzhen wrote on 2024/1/16
 * @version 1.0
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitMqController.class)
public class SenderServiceTest {
    @Autowired
    private SenderService senderService;

    @Autowired
    private Receiver receiver;

    @Test
    public void testCache() {
        String broadString = "同学们集合啦！";
        // 测试广播模式
        senderService.broadcast(broadString);
        // 测试Direct模式
        senderService.direct("定点消息");
    }
}
