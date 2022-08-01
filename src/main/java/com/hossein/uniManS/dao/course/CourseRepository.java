package com.hossein.uniManS.dao.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hossein.uniManS.models.course.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
