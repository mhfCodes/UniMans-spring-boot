package com.hossein.uniManS.controllers.viewModels.course;

import java.util.Set;

import com.hossein.uniManS.controllers.viewModels.teacher.TeacherViewModel;

public class CourseViewModel {
	
	private Long id;
	private String courseName;
	private Integer courseCode;
	private Integer courseCapacity;
	private Set<TeacherViewModel> teachers;
	
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
	public Set<TeacherViewModel> getTeachers() {
		return teachers;
	}
	public void setTeachers(Set<TeacherViewModel> teachers) {
		this.teachers = teachers;
	}

}
