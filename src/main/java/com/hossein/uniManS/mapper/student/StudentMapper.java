package com.hossein.uniManS.mapper.student;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.hossein.uniManS.controllers.viewModels.student.StudentViewModel;
import com.hossein.uniManS.models.student.Student;

@Mapper(componentModel = "spring")
public interface StudentMapper {

	@Mapping(source = "id", target = "studentId")
	@Mapping(source = "firstName", target = "studentFirstName")
	@Mapping(source = "lastName", target = "studentLastName")
	StudentViewModel convertFromEntityToViewModel(Student student);
	
	List<StudentViewModel> convertFromEntityToViewModelList(List<Student> students);
}
