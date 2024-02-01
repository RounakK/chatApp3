package com.chatApp3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Message")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Message {

    @ManyToOne
    @Id
    @JoinColumn(name = "fromUser")
    private User fromUser;

    @ManyToOne
    @Id
    @JoinColumn(name = "toUser")
    private User toUser;

    @Column(name = "message_text")
    private String messageText;

    @Column(name = "message_timestamp")
    private Date messageTimestamp;

}
