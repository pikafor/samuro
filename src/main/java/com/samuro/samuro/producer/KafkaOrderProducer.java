package com.samuro.samuro.producer;

import com.samuro.samuro.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaOrderProducer {
    private final KafkaTemplate<String, OrderDTO> kafkaTemplate;

    public KafkaOrderProducer(KafkaTemplate<String, OrderDTO> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(OrderDTO order) {
        try {
            kafkaTemplate.send("orders", order);
        } catch (Exception e) {
            log.error("Критическая ошибка при отправке заказа в Kafka: {}", e.getMessage());
            throw new RuntimeException("Не удалось отправить заказ в Kafka", e);
        }
    }
}