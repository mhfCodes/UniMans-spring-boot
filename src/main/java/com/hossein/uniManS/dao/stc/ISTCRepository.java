package com.hossein.uniManS.dao.stc;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hossein.uniManS.models.stc.STC;

@Repository
public interface ISTCRepository extends JpaRepository<STC, Long> {
	
	Optional<STC> findById(Long id);
	
	Optional<Set<STC>> findByStudentId(Long studentId);
	
	Optional<Set<STC>> findByTeacherId(Long teacherId);
}
