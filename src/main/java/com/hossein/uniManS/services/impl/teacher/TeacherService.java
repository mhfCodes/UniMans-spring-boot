package com.hossein.uniManS.services.impl.teacher;

import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.hossein.uniManS.dao.stc.ISTCRepository;
import com.hossein.uniManS.dao.teacher.ITeacherRepository;
import com.hossein.uniManS.exceptions.ApplicationException;
import com.hossein.uniManS.models.stc.STC;
import com.hossein.uniManS.models.teacher.Teacher;
import com.hossein.uniManS.services.teacher.ITeacherService;

@Service
public class TeacherService implements ITeacherService {
	
	@Autowired
	private ITeacherRepository iTeacherRepository;
	
	@Autowired
	private ISTCRepository iSTCRepository;

	@Override
	public Set<STC> getTeacherCourses() {
		Teacher teacher = this.getLoggedInTeacher();
		Set<STC> stcs = this.iSTCRepository.findByTeacherId(teacher.getId())
						.orElseThrow(() -> new ApplicationException("STC Not Found"));
		return stcs;
	}
	
	@Override
	@Transactional
	public Boolean deleteStudentFromCourse(Long stcId) {
		this.iSTCRepository.deleteById(stcId);
		Optional<STC> stc = this.iSTCRepository.findById(stcId);
		if (stc.isPresent()) return false;
		return true;
	}

	public Teacher getLoggedInTeacher() {
		String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Teacher teacher = this.iTeacherRepository.findByUsername(username)
							.orElseThrow(() -> new ApplicationException("Teacher Not Found"));
		return teacher;
	}

}
