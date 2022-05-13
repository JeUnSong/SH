package com.example.sh.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "board_like")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Board_like {

    @Id
    private int id;

    @Column(nullable = false)
    private int board_number;
}
