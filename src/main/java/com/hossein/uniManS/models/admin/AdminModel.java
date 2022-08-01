package com.hossein.uniManS.models.admin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ADMIN")
public class AdminModel {
	
	@Id
	@SequenceGenerator(
				name = "seq_admin",
				sequenceName = "seq_admin",
				allocationSize = 1
			)
	@GeneratedValue(
				strategy = GenerationType.SEQUENCE,
				generator = "seq_admin"
			)
	private Integer id;
	
	@Column(name = "ADMIN_NAME")
	private String adminName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
}
