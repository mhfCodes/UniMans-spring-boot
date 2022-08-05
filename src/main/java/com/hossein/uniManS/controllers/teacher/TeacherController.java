package com.hossein.uniManS.controllers.teacher;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hossein.uniManS.controllers.viewModels.stc.STCViewModel;
import com.hossein.uniManS.mapper.stc.STCMapper;
import com.hossein.uniManS.services.teacher.ITeacherService;

@RestController
@RequestMapping("/UniManS/teacher")
public class TeacherController {

	@Autowired
	private ITeacherService iTeacherService;
	
	@Autowired
	private STCMapper stcMapper;
	
	@GetMapping("/courses")
	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_TEACHER')")
	public Set<STCViewModel> getTeacherCourses() {
		return this.stcMapper.convertfromEntityToViewModelList(this.iTeacherService.getTeacherCourses());
	}
	
	@DeleteMapping("/courses/{stcId}")
	@PreAuthorize("hasRole('ROLE_TEACHER')")
	public Boolean deleteStudentFromCourse(@PathVariable Long stcId) {
		return this.iTeacherService.deleteStudentFromCourse(stcId);
	}
	
}
