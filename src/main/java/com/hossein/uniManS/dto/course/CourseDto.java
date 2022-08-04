package com.hossein.uniManS.dto.course;

import java.util.Set;


public class CourseDto {
	
	private Long id;
	private String cName;
	private Integer cCode;
	private Integer cCapacity;
	private Set<Long> teacherIds;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Integer getcCode() {
		return cCode;
	}
	public void setcCode(Integer cCode) {
		this.cCode = cCode;
	}
	public Integer getcCapacity() {
		return cCapacity;
	}
	public void setcCapacity(Integer cCapacity) {
		this.cCapacity = cCapacity;
	}
	public Set<Long> getTeacherIds() {
		return teacherIds;
	}
	public void setTeacherIds(Set<Long> teacherIds) {
		this.teacherIds = teacherIds;
	}
	
}
