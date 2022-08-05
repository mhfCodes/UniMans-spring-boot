package com.hossein.uniManS.controllers.student;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hossein.uniManS.controllers.viewModels.stc.STCViewModel;
import com.hossein.uniManS.dto.stc.STCDto;
import com.hossein.uniManS.mapper.course.CourseMapper;
import com.hossein.uniManS.mapper.stc.STCMapper;
import com.hossein.uniManS.services.student.IStudentService;

@RestController
@RequestMapping("/UniManS/student")
public class StudentController {

	@Autowired
	private IStudentService iStudentService;
	
	@Autowired
	private CourseMapper courseMapper;
	
	@Autowired
	private STCMapper stcMapper;
	
	@GetMapping("/courses")
	@PreAuthorize("hasAnyRole('ROLE_STUDENT', 'ROLE_ADMIN')")
	public Set<STCViewModel> getStudentCourses() {
		return this.stcMapper.convertfromEntityToViewModelList(this.iStudentService.getStudentCourses());
	}
	
	@PostMapping("/courses")
	@PreAuthorize("hasRole('ROLE_STUDENT')")
	public List<Long> saveStudentCourses(@RequestBody Set<STCDto> dtoList) {
		return this.iStudentService.saveStudentCourses(this.stcMapper.convertFromDtoToEntityList(dtoList));
	}
	
	@DeleteMapping("/courses/{stcId}")
	@PreAuthorize("hasRole('ROLE_STUDENT')")
	public Boolean deleteStudentCourse(@PathVariable Long stcId) {
		return this.iStudentService.deleteStudentCourse(stcId);
	}
	
}
