package com.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Girls")
public class Girl {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "cup_size")
    private String cupSize;

    @Column(name = "age")
    private Integer age;

    public Girl(String cupSize, Integer age) {
        this.cupSize = cupSize;
        this.age = age;
    }
}
