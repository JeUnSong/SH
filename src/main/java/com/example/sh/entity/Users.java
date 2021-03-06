package com.example.sh.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name= "users")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Users extends BaseEntity {

    @Id
    private int id; // BASE64 형식의 문자열
    private int house_id;

    @Column(length = 10, nullable = false)
    private String username;

    @Column(length = 20, nullable = false)
    private String pass;

    @Column(length = 30, nullable = false)  // 이메일 형식의 타입이 있는거 같음
    private String email;

    @Column(length = 20, nullable = false)
    private String nickname;

    @Column(length = 45, nullable = false)
    private String sns_id;

    @Column(length = 45, nullable = false)
    private String sns_type;

    @Column(nullable = false)
    private java.sql.Timestamp sns_connect_date;


}
