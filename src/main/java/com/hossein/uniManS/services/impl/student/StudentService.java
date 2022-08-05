package com.hossein.uniManS.services.impl.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.hossein.uniManS.dao.stc.ISTCRepository;
import com.hossein.uniManS.dao.student.IStudentRepository;
import com.hossein.uniManS.exceptions.ApplicationException;
import com.hossein.uniManS.models.stc.STC;
import com.hossein.uniManS.models.student.Student;
import com.hossein.uniManS.services.student.IStudentService;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private IStudentRepository iStudentRepository;
	
	@Autowired
	private ISTCRepository iSTCRepository;
	
	@Override
	public Set<STC> getStudentCourses() {
		Student student = this.getLoggedInStudent();
		Set<STC> stcs = this.iSTCRepository.findByStudentId(student.getId())
							.orElseThrow(() -> new ApplicationException("Student Not Found"));
		return stcs;
	}

	@Override
	@Transactional
	public List<Long> saveStudentCourses(Set<STC> entityList) {
		List<Long> savedIds = new ArrayList<>();
		Student student = this.getLoggedInStudent();
		entityList.forEach(stc -> {
			stc.setStudent(student);
			Long savedId = iSTCRepository.save(stc).getId();
			savedIds.add(savedId);
		});
		return savedIds;
	}
	
	public Student getLoggedInStudent() {
		String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Student student = this.iStudentRepository.findByUsername(username)
				.orElseThrow(() -> new ApplicationException("User Not Found"));
		return student;
	}

	@Override
	@Transactional
	public Boolean deleteStudentCourse(Long stcId) {
		this.iSTCRepository.deleteById(stcId);
		Optional<STC> stc = this.iSTCRepository.findById(stcId);
		if (stc.isPresent()) return false;
		return true;
	}

}
