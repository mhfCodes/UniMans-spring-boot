package com.hossein.uniManS.dao.admin;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hossein.uniManS.models.admin.AdminModel;

@Repository
public interface AdminRepository extends JpaRepository<AdminModel, Integer> {

	Optional<AdminModel> findByUsername(String username);
	
}

