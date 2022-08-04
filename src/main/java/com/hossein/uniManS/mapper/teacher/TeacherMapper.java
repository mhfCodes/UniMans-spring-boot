package com.hossein.uniManS.mapper.teacher;

import java.util.Set;

import org.mapstruct.Mapper;

import com.hossein.uniManS.controllers.viewModels.teacher.TeacherViewModel;
import com.hossein.uniManS.models.teacher.Teacher;

@Mapper(componentModel = "spring")
public interface TeacherMapper {

	TeacherViewModel convertFromEntityToViewModel(Teacher entity);
	
	Set<TeacherViewModel> convretFromEntityToViewModelSet(Set<Teacher> entityList);
}
