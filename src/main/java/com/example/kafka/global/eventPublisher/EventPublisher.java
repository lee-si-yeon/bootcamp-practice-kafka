package com.example.kafka.global.eventPublisher;

import com.example.kafka.standard.event.HasEventName;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventPublisher {

    private final KafkaTemplate<String, HasEventName> kafkaTemplate;

    public void publish(HasEventName event) {
        kafkaTemplate.send(event.getEventName(), event);
    }
}
