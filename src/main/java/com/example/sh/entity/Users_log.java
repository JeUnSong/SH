package com.example.sh.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "users_log")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Users_log {

    @Id
    private int id;

    private java.sql.Timestamp login_date;

    @Column(length = 10)
    private String login_status;

    @Column(length = 10)
    private String Login_type;
}
