package com.example.sh.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "board")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Board extends BaseEntity {

    @Id
    private int id;

    @Column(length = 20, nullable = false)
    private String nickname;

    @Column(nullable = false)
    private int board_number;

    @Column(length = 30, nullable = false)
    private String board_title;

    @Column(length = 5000, nullable = false)
    private String board_content;

    @Column(length = 100)
    private String board_tag;

    private int board_visitcount;
    private int board_like_number;
}
