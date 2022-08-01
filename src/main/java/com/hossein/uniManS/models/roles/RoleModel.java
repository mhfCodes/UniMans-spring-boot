package com.hossein.uniManS.models.roles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ROLE")
public class RoleModel {

	@Id
	@SequenceGenerator(
				name = "seq_role",
				sequenceName = "seq_role",
				allocationSize = 1
			)
	@GeneratedValue(
				strategy = GenerationType.SEQUENCE,
				generator = "seq_role"
			)
	private Integer id;
	
	@Column(name = "ROLE_NAME")
	private String roleName;

	public RoleModel() {
		super();
	}

	public RoleModel(String roleName) {
		super();
		this.roleName = roleName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
}
