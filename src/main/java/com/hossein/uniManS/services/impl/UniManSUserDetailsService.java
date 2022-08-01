package com.hossein.uniManS.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hossein.uniManS.dao.admin.AdminRepository;
import com.hossein.uniManS.dao.student.StudentRepository;
import com.hossein.uniManS.dao.teacher.TeacherRepository;
import com.hossein.uniManS.exceptions.ApplicationException;
import com.hossein.uniManS.models.MainUser;
import com.hossein.uniManS.models.admin.AdminModel;
import com.hossein.uniManS.models.student.Student;
import com.hossein.uniManS.models.teacher.Teacher;

@Service
public class UniManSUserDetailsService implements UserDetailsService {
	
	@Autowired
	private AdminRepository adminRepo;
	
	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private TeacherRepository teacherRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		MainUser mainUser = null;
		
		Optional<AdminModel> adminUser = this.adminRepo.findByUsername(username);
		Optional<Student> studentUser = this.studentRepo.findByUsername(username);
		Optional<Teacher> teacherUser = this.teacherRepo.findByUsername(username);
	
		if (adminUser.isPresent()) {
			mainUser = adminUser.get();
		} else if (studentUser.isPresent()) {
			mainUser = studentUser.get();
		} else if (teacherUser.isPresent()) {
			mainUser = teacherUser.get();
		} else {
			throw new ApplicationException("User Not Found");
		}
		
		return null;
	}

}
