package com.uni.portal.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SUBJECTS")
@Data
@NoArgsConstructor
public class Subject {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String id;

    @Column
    public String name;

    @Column
    public String teacher;
}
