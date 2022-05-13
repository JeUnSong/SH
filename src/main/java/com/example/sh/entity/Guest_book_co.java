package com.example.sh.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "guest_book_co")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Guest_book_co {

    @Id
    private int id;

    @Column(length = 20, nullable = false)
    private String nickname;

    @Column(nullable = false)
    private int guest_book_number;

    @Column(length = 150, nullable = false)
    private String guest_book_comment;

    @Column(nullable = false)
    private java.sql.Timestamp guest_book_comment_date;
    private java.sql.Timestamp guest_book_comment_modify_date;

    @Column(columnDefinition="char(1)")
    private String guest_book_comment_like;

}