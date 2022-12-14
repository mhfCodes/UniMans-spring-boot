package com.hossein.uniManS.controllers.viewModels.stc;

public class STCViewModel {
	
	private Long id;
	private Long studentId;
	private String teacherFirstName;
	private String teacherLastName;
	private String courseName;
	private Integer courseCode;
	private Integer courseCapacity;
	private String studentFirstName;
	private String studentLastName;
	private Long teacherId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getTeacherFirstName() {
		return teacherFirstName;
	}
	public void setTeacherFirstName(String teacherFirstName) {
		this.teacherFirstName = teacherFirstName;
	}
	public String getTeacherLastName() {
		return teacherLastName;
	}
	public void setTeacherLastName(String teacherLastName) {
		this.teacherLastName = teacherLastName;
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
	public String getStudentFirstName() {
		return studentFirstName;
	}
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}
	public String getStudentLastName() {
		return studentLastName;
	}
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}
	public Long getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}

}
