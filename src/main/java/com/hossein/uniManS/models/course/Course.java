package com.hossein.uniManS.models.course;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.hossein.uniManS.models.student.Student;
import com.hossein.uniManS.models.teacher.Teacher;

@Entity
@Table(name = "COURSE")
public class Course {

	@Id
	@SequenceGenerator(
				name = "seq_course",
				sequenceName = "seq_course",
				allocationSize = 1
			)
	@GeneratedValue(
				strategy = GenerationType.SEQUENCE,
				generator = "seq_course"
			)
	private Long id;
	
	@Column(name = "COURSE_NAME")
	private String courseName;
	
	@Column(name = "COURSE_CODE")
	private Integer courseCode;
	
	@Column(name = "COURSE_CAPACITY")
	private Integer courseCapacity;
	
	@ManyToMany(mappedBy = "courses")
	private Set<Student> students;
	
	@ManyToMany(mappedBy = "courses")
	private Set<Teacher> teachers;

	public Course() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Integer getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(Integer courseCode) {
		this.courseCode = courseCode;
	}

	public Integer getCourseCapacity() {
		return courseCapacity;
	}

	public void setCourseCapacity(Integer courseCapacity) {
		this.courseCapacity = courseCapacity;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}
	
}
