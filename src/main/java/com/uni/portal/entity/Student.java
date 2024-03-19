package com.uni.portal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "STUDENTS")
@Data
@NoArgsConstructor
public class Student {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;

	@Column
	public String name;

	@Column
	public String dob;

	/*
	 * @Column public List<String> subjects;
	 */
}
