package com.czy.rabbitmq.receiver.handler;

import com.czy.rabbitmq.receiver.config.RabbitMQConfig;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiverHandler {
    //监听msg队列
    @RabbitListener(queues = {RabbitMQConfig.QUEUE_INFORM_MSG})
    public void receiveMsg(Object msg, Message message, Channel channel) {
        System.out.println("QUEUE_INFORM_MSG: " + msg);
    }

}
