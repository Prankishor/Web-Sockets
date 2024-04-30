package com.horizon.ChatApplication.Chat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class ChatMessage {

    @Id
    private String chatId;
    private String senderId;
    private String recipientId;
    private String content;
    private Date timestamp;
}
