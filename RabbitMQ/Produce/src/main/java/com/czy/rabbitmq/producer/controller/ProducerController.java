package com.czy.rabbitmq.producer.controller;

import com.czy.error.response.Result;
import com.czy.rabbitmq.producer.config.RabbitMQConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/producer")
public class ProducerController {

    private final RabbitTemplate rabbitTemplate;

    @PostMapping("/produce")
    public Result<?> produce() {
        String s = "Msg: ";
        for (int i = 0; i < 1000; i++) {
            rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE_TOPIC_INFORM, "inform.msg", s + i);
        }
        return Result.success();
    }
}
