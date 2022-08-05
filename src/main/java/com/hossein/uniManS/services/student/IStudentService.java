package com.hossein.uniManS.services.student;

import java.util.List;
import java.util.Set;

import com.hossein.uniManS.models.course.Course;
import com.hossein.uniManS.models.stc.STC;
import com.hossein.uniManS.models.student.Student;

public interface IStudentService {

	Set<STC> getStudentCourses();
	
	List<Long> saveStudentCourses(Set<STC> entityList);
	
	Student getLoggedInStudent();
	
	Boolean deleteStudentCourse(Long stcId);
}
