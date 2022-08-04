package com.hossein.uniManS.services.impl;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hossein.uniManS.dao.admin.IAdminRepository;
import com.hossein.uniManS.dao.student.IStudentRepository;
import com.hossein.uniManS.dao.teacher.ITeacherRepository;
import com.hossein.uniManS.exceptions.ApplicationException;
import com.hossein.uniManS.models.MainUser;
import com.hossein.uniManS.models.admin.AdminModel;
import com.hossein.uniManS.models.student.Student;
import com.hossein.uniManS.models.teacher.Teacher;

@Service
public class UniManSUserDetailsService implements UserDetailsService {
	
	@Autowired
	private IAdminRepository adminRepo;
	
	@Autowired
	private IStudentRepository studentRepo;
	
	@Autowired
	private ITeacherRepository teacherRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("LOG 1");
		
		MainUser mainUser = null;
		
		Optional<AdminModel> adminUser = this.adminRepo.findByUsername(username);
		System.out.println("LOG 2");
		Optional<Student> studentUser = this.studentRepo.findByUsername(username);
		System.out.println("LOG 3");
		Optional<Teacher> teacherUser = this.teacherRepo.findByUsername(username);
		System.out.println("LOG 4");
		
		if (adminUser.isPresent()) {
			mainUser = adminUser.get();
			System.out.println("LOG 5");
		} else if (studentUser.isPresent()) {
			mainUser = studentUser.get();
			System.out.println("LOG 6");
		} else if (teacherUser.isPresent()) {
			mainUser = teacherUser.get();
			System.out.println("LOG 7");
		} else {
			System.out.println("LOG 8");
			throw new ApplicationException("User Not Found");
		}
		
		System.out.println("LOG 9");
		Set<SimpleGrantedAuthority> authorities = new HashSet<>();
		System.out.println("LOG 10");
		authorities.add(new SimpleGrantedAuthority(mainUser.getRole().getRoleName()));
		System.out.println("LOG 11");
		User user = new User(mainUser.getUsername(), mainUser.getPassword(), authorities);
		System.out.println("LOG 12");
		return user;
	}

}
