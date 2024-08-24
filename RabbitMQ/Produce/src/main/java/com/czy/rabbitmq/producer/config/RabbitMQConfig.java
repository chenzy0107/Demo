package com.czy.rabbitmq.producer.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String EXCHANGE_TOPIC_INFORM = "exchange_topic_inform";
    public static final String QUEUE_INFORM_MSG = "queue_inform_msg";
    public static final String ROUTING_KEY_MSG = "inform.#.msg.#";

    /**
     * 声明交换机
     */
    @Bean(EXCHANGE_TOPIC_INFORM)
    public Exchange exchangeTopicInform() {
        return ExchangeBuilder.topicExchange(EXCHANGE_TOPIC_INFORM)
                .durable(true)
                .build();
    }

    /**
     * 声明队列
     */
    @Bean(QUEUE_INFORM_MSG)
    public Queue queueInformMsg() {
        return new Queue(QUEUE_INFORM_MSG);
    }

    //队列绑定交换机，指定routingKey
    @Bean
    public Binding bindingQueueInformMsg(@Qualifier(QUEUE_INFORM_MSG) Queue queue,
                           @Qualifier(EXCHANGE_TOPIC_INFORM) Exchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY_MSG).noargs();
    }

}
