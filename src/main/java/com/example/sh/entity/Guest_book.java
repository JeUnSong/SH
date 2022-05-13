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
public class Guest_book {

    @Id
    private int id;

    @Column(length = 20, nullable = false)
    private String nickname;

    @Column(nullable = false)
    private int guest_book_number;

    @Column(nullable = false)
    private java.sql.Timestamp guest_book_date;
    private java.sql.Timestamp guest_book_modify_date;

    @Column(length = 200, nullable = false)
    private String guest_book_content;

    @Column(columnDefinition="char(1)")
    private String guest_book_like;
}
