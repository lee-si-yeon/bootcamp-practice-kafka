package com.example.kafka.shared.member.event;

import com.example.kafka.shared.member.dto.MemberDto;
import com.example.kafka.standard.event.HasEventName;

public record MemberJoinedEvent(
        MemberDto member
) implements HasEventName {}
