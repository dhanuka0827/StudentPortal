package com.uni.portal.entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "STUDENTS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {

	private static final long serialVersionUID = 4492831588166218765L;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;

	@Column
	public String name;

	@Column
	public String dob;

	//@OneToMany(mappedBy="student", cascade = CascadeType.PERSIST)
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "student_subject",
			joinColumns = {@JoinColumn(name = "student_id")},
			inverseJoinColumns = {@JoinColumn(name = "subject_id")})
    private Set<Subject> subjects;
	/*
	 * @Column public List<String> subjects;
	 */
}
