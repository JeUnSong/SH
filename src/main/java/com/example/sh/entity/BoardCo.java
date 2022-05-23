package com.example.sh.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "board_co")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardCo extends BaseEntity {

    @Id
    private int id;

    @Column(length = 20, nullable = false)
    private String nickname;

    @Column(nullable = false)
    private int board_number;

    @Column(nullable = false)
    private int board_comment_number;

    @Column(length = 150, nullable = false)
    private String board_comment;

    private int board_comment_like_number;
}
