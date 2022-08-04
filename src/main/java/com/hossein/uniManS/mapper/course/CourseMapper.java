package com.hossein.uniManS.mapper.course;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.hossein.uniManS.controllers.viewModels.course.CourseViewModel;
import com.hossein.uniManS.dto.course.CourseDto;
import com.hossein.uniManS.mapper.teacher.TeacherMapper;
import com.hossein.uniManS.models.course.Course;

@Mapper(
		componentModel = "spring",
		uses = TeacherMapper.class
		)
public interface CourseMapper {

	@Mapping(source = "cName", target = "courseName")
	@Mapping(source = "cCode", target = "courseCode")
	@Mapping(source = "cCapacity", target = "courseCapacity")
	Course convertFromDtoToEntity(CourseDto dto);
	
	CourseViewModel convertFromEntityToViewModel(Course entity);
	
	List<CourseViewModel> convertFromEntityToViewModelList(List<Course> entityList);
	
}
