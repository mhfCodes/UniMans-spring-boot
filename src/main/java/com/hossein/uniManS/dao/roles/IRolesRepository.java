package com.hossein.uniManS.dao.roles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hossein.uniManS.models.roles.RoleModel;

@Repository
public interface IRolesRepository extends JpaRepository<RoleModel, Long> {

}
