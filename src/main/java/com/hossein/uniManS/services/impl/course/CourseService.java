package com.hossein.uniManS.services.impl.course;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hossein.uniManS.dao.course.ICourseRepository;
import com.hossein.uniManS.dao.teacher.ITeacherRepository;
import com.hossein.uniManS.models.course.Course;
import com.hossein.uniManS.models.teacher.Teacher;
import com.hossein.uniManS.services.course.ICourseService;

@Service
public class CourseService implements ICourseService {
	
	@Autowired
	private ICourseRepository iCourseRepository;
	
	@Autowired
	private ITeacherRepository iTeacherRepository;

	@Override
	public List<Course> getAllCourses() {
		return this.iCourseRepository.findAll();
	}

	@Override
	@Transactional
	public long saveCourse(Course entity, Set<Long> teacherIds) {
		
		Course savedEntity = this.iCourseRepository.save(entity);
		
		if (teacherIds != null) {
			teacherIds.stream().forEach(id -> {
				Optional<Teacher> teacher = this.iTeacherRepository.findById(id);
				if (teacher.isPresent()) {
					Teacher mainTeacher = teacher.get();
					Set<Course> courses = mainTeacher.getCourses();
					courses.add(savedEntity);
					mainTeacher.setCourses(courses);
					this.iTeacherRepository.save(mainTeacher);
				}
			});
		}
		
		return savedEntity.getId();
	}

}
