package com.horizon.ChatApplication.ChatRoom;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ChatRoom {

    @Id
    private String chatId;
    private String senderId;
    private String recipientId;
}
