package com.example.kafka;

import com.example.kafka.standard.event.HasEventName;

public record MyEvent(String msg) implements HasEventName {
}
