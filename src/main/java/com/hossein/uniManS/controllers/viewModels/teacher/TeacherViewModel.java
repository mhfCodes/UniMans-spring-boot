package com.hossein.uniManS.controllers.viewModels.teacher;

public class TeacherViewModel {
	
	private Long id;
	private String firstName;
	private String lastName;
	private Long teachingCode;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getTeachingCode() {
		return teachingCode;
	}
	public void setTeachingCode(Long teachingCode) {
		this.teachingCode = teachingCode;
	}

}
