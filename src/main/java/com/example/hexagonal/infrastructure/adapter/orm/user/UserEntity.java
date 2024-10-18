package com.example.hexagonal.infrastructure.adapter.orm.user;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter

@NoArgsConstructor
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private long pharmacy_id;

    public UserEntity(long id, String name, String email, String password, long pharmacy_id) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.pharmacy_id = pharmacy_id;
    }
}
