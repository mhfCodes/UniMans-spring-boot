package com.hossein.uniManS.services.course;

import java.util.List;
import java.util.Set;

import com.hossein.uniManS.models.course.Course;

public interface ICourseService {
	
	List<Course> getAllCourses();
	
	long saveCourse(Course entity, Set<Long> teacherIds);

}
