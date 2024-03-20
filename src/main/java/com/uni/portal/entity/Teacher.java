package com.uni.portal.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TEACHER")
@Data
public class  Teacher {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;

	@Column
	public String name;

	@Column
	public List<String> subjects;

}
