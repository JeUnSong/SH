package com.example.sh.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "guest_book")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GuestBook extends BaseEntity {

    @Id
    private int id;

    @Column(length = 20, nullable = false)
    private String nickname;

    @Column(nullable = false)
    private int guest_book_number;

    @Column(length = 200, nullable = false)
    private String guest_book_content;

    private Boolean guest_book_like;
}
