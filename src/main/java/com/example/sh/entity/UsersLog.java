package com.example.sh.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name= "users_log")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsersLog {

    @Id
    private int login_id;

    private java.sql.Timestamp login_date;

    @Column(length = 10)
    private String login_status;

    @Column(length = 10)
    private String Login_type;

}
