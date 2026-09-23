package com.example.kafka.boundedContext.member.in;

import com.example.kafka.global.eventPublisher.EventPublisher;
import com.example.kafka.shared.member.dto.MemberDto;
import com.example.kafka.shared.member.event.MemberJoinedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MemberDataInit {

    private final EventPublisher eventPublisher;

    @Bean
    public ApplicationRunner memberDataInitApplicationRunner() {
        return args -> {
            eventPublisher.publish(new MemberJoinedEvent(new MemberDto(1)));
        };
    }
}
