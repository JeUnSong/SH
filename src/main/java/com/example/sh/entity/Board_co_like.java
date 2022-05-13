package com.example.sh.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "board_co_like")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Board_co_like {

    @Id
    private int id;

    @Column(nullable = false)
    private int board_comment_number;
}
