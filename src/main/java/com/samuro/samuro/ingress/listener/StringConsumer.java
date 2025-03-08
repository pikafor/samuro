package com.samuro.samuro.ingress.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class StringConsumer {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(StringConsumer.class);

    @KafkaListener(id = "demoGroup", topics = "topik1")
    public void listen(String message) {
        log.info("Received: " + message);
    }
}
