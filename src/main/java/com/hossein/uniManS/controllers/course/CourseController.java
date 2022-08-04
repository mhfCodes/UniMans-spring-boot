package com.hossein.uniManS.controllers.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hossein.uniManS.controllers.viewModels.course.CourseViewModel;
import com.hossein.uniManS.dto.course.CourseDto;
import com.hossein.uniManS.mapper.course.CourseMapper;
import com.hossein.uniManS.services.course.ICourseService;

@RestController
@RequestMapping("/UniManS/courses")
public class CourseController {
	
	@Autowired
	private ICourseService iCourseService;
	
	@Autowired
	private CourseMapper mapper;
	
	@GetMapping
	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_TEACHER', 'ROLE_STUDENT')")
	public List<CourseViewModel> getAllCourses() {
		return this.mapper.convertFromEntityToViewModelList(this.iCourseService.getAllCourses());
	}
	
	@PostMapping
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public long saveCourse(@RequestBody CourseDto dto) {
		return this.iCourseService.saveCourse(this.mapper.convertFromDtoToEntity(dto), dto.getTeacherIds());
	}

}
