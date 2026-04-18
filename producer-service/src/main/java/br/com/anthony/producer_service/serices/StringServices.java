package br.com.anthony.producer_service.serices;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import static br.com.anthony.producer_service.config.RabbitMQConfig.EXG_NAME_MARKETPLACE;
import static br.com.anthony.producer_service.config.RabbitMQConfig.QUEUE_PRODUCT_LOG;

@Slf4j
@Service
@RequiredArgsConstructor
public class StringServices {

    private final RabbitTemplate rabbitTemplate;

    public void produce(String message) {
        log.info("Received message " + message);
        rabbitTemplate.convertAndSend(EXG_NAME_MARKETPLACE, QUEUE_PRODUCT_LOG, message);
    }

}
