package com.example.socketpractice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class JoinRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long myUserId;

    private Long toUserId;

    private String toUserNick;

    private String toUserImg;

    private Long roomId;

    private String lastMsg;

    private Boolean readMessage;

    private ZonedDateTime lastMsgTime;
}
