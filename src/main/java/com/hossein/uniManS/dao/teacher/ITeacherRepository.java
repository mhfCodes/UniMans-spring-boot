package com.hossein.uniManS.dao.teacher;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hossein.uniManS.models.teacher.Teacher;

@Repository
public interface ITeacherRepository extends JpaRepository<Teacher, Long> {

	Optional<Teacher> findByUsername(String username);
	
	Optional<Teacher> findById(Long id);
}
