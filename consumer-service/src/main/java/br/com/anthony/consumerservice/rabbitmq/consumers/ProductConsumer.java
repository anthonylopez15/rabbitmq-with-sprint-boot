package br.com.anthony.consumerservice.rabbitmq.consumers;


import constants.RabbitMQConstants;
import dtos.ProductDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static constants.RabbitMQConstants.QUEUE_PRODUCT_LOG;
import static constants.RabbitMQConstants.RK_PRODUCT_LOG;


@Slf4j
@Component
public class ProductConsumer {

    @RabbitListener(queues = RK_PRODUCT_LOG)
    public void consumer(ProductDTO dto) {
        log.info("Received a message " + dto.toString());
    }
}
