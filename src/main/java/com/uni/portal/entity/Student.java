package com.uni.portal.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "STUDENTS")
@Data
@NoArgsConstructor
public class Student {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String id;

    @Column
    public String name;

    @Column
    public String dob;

   /* @Column
    public List<String> subjects;
*/
}
