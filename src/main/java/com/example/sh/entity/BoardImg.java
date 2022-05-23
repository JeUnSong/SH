package com.example.sh.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "board_img")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardImg {

    @Id
    private int id;

    @Column(nullable = false)
    private int board_number;

    @Column(nullable = false)
    private String original_file;

    @Column(nullable = false)
    private String save_file;
}
