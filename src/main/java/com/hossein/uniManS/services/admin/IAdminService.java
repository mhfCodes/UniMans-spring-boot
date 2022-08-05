package com.hossein.uniManS.services.admin;

import java.util.List;
import java.util.Set;

import com.hossein.uniManS.models.student.Student;
import com.hossein.uniManS.models.teacher.Teacher;

public interface IAdminService {
	
	List<Student> getAllStudents();

	Set<Teacher> getAllTeachers();
}
