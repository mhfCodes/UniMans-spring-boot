package com.hossein.uniManS.dto.teacher;

public class TeacherDto {

	private Long id;
	private String fName;
	private String lName;
	private Long tCode;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Long gettCode() {
		return tCode;
	}
	public void settCode(Long tCode) {
		this.tCode = tCode;
	}
	
}
