package com.uni.portal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "SUBJECTS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject implements Serializable {

	private static final long serialVersionUID = -9192768386210003960L;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;

	@Column
	public String name;

	@Column
	public String teacher;
	
	//@ManyToOne
    //@JoinColumn(name="stud_id" /*,nullable=false*/)
	@ManyToMany(mappedBy = "subjects")
    private Set<Student> student;
}
