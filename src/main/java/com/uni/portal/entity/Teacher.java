package com.uni.portal.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "TEACHER")
@Data
public class Teacher {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column
    public String name;

    @Column
    public List<String> subjects;

}
