package com.hossein.uniManS.mapper.stc;

import java.util.List;
import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.hossein.uniManS.controllers.viewModels.stc.STCViewModel;
import com.hossein.uniManS.dto.stc.STCDto;
import com.hossein.uniManS.models.stc.STC;

@Mapper(componentModel = "spring")
public interface STCMapper {
	
	@Mapping(source = "studentId", target = "student.id")
	@Mapping(source = "teacherId", target = "teacher.id")
	@Mapping(source = "courseId", target = "course.id")
	STC convertFromDtoToEntity(STCDto dto);
	
	Set<STC> convertFromDtoToEntityList(Set<STCDto> dtoList);

	@Mapping(source = "student.id", target = "studentId")
	@Mapping(source = "student.firstName", target = "studentFirstName")
	@Mapping(source = "student.lastName", target = "studentLastName")
	@Mapping(source = "teacher.id", target = "teacherId")
	@Mapping(source = "teacher.firstName", target = "teacherFirstName")
	@Mapping(source = "teacher.lastName", target = "teacherLastName")
	@Mapping(source = "course.courseName", target = "courseName")
	@Mapping(source = "course.courseCode", target = "courseCode")
	@Mapping(source = "course.courseCapacity", target = "courseCapacity")
	STCViewModel convertFromEntityToViewModel(STC entity);
	
	Set<STCViewModel> convertfromEntityToViewModelList(Set<STC> entityList);
	
}
