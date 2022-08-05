package com.hossein.uniManS.controllers.admin;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hossein.uniManS.controllers.viewModels.student.StudentViewModel;
import com.hossein.uniManS.controllers.viewModels.teacher.TeacherViewModel;
import com.hossein.uniManS.mapper.student.StudentMapper;
import com.hossein.uniManS.mapper.teacher.TeacherMapper;
import com.hossein.uniManS.services.admin.IAdminService;

@RestController
@RequestMapping("/UniManS/admin")
public class AdminController {

	@Autowired
	private IAdminService iAdminSerivce;
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Autowired
	private TeacherMapper teacherMapper;
	
	@GetMapping("/students")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public List<StudentViewModel> getAllStudents() {
		return this.studentMapper.convertFromEntityToViewModelList(this.iAdminSerivce.getAllStudents());
	}
	
	@GetMapping("/teachers")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public Set<TeacherViewModel> getAllTeachers() {
		return this.teacherMapper.convretFromEntityToViewModelSet(this.iAdminSerivce.getAllTeachers());
	}
	
	
}
