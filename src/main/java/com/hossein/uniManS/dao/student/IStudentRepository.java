package com.hossein.uniManS.dao.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hossein.uniManS.models.student.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {

	Optional<Student> findByUsername(String username);
}
