package com.hossein.uniManS.services.teacher;

import java.util.Set;

import com.hossein.uniManS.models.stc.STC;

public interface ITeacherService {
	
	Set<STC> getTeacherCourses();
	
	Boolean deleteStudentFromCourse(Long stcId);

}
