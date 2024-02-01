package com.chatApp3.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Builder
@Table(name = "`User`")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class User {

    @Id
    @Column(name = "user_id")
    @Nonnull
    private String userId;

    @Column(name = "user_name")
    @Nonnull
    private String userName;


}
