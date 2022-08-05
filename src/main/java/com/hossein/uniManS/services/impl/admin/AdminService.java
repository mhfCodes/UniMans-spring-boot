package com.hossein.uniManS.services.impl.admin;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hossein.uniManS.dao.student.IStudentRepository;
import com.hossein.uniManS.dao.teacher.ITeacherRepository;
import com.hossein.uniManS.models.student.Student;
import com.hossein.uniManS.models.teacher.Teacher;
import com.hossein.uniManS.services.admin.IAdminService;

@Service
public class AdminService implements IAdminService {
	
	@Autowired
	private IStudentRepository iStudentRepository;
	
	@Autowired
	private ITeacherRepository iTeacherRepository;

	@Override
	public List<Student> getAllStudents() {
		return this.iStudentRepository.findAll();
	}

	@Override
	public Set<Teacher> getAllTeachers() {
		return this.iTeacherRepository.findAll().stream().collect(Collectors.toSet());
	}

}
