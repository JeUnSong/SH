package com.example.sh.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "house")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class House {

    @Id
    private int id;

    @Column(nullable = false)
    private int house_id;

    @Column(nullable = false)
    private int house_content_number;

    @Column(length = 30,nullable = false)
    private String house_title;

    @Column(length = 5000,nullable = false)
    private String house_content;

    @Column(nullable = false)
    private java.sql.Timestamp house_content_date;

    @Column(length = 5000,nullable = false)
    private String content_history;

    @Column(nullable = false)
    private java.sql.Timestamp content_history_date;

    private int today;
    private int total;
}
