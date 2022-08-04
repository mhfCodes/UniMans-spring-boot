package com.hossein.uniManS.models.admin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.hossein.uniManS.models.MainUser;
import com.hossein.uniManS.models.roles.RoleModel;

@Entity
@Table(name = "ADMIN_TABLE")
public class AdminModel extends MainUser {
	
	@Id
	@SequenceGenerator(
				name = "seq_my_admin",
				sequenceName = "seq_my_admin",
				allocationSize = 1
			)
	@GeneratedValue(
				strategy = GenerationType.SEQUENCE,
				generator = "seq_my_admin"
			)
	private Long id;
	
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@OneToOne()
	@JoinColumn(name = "ROLE_ID")
	private RoleModel role;

	public AdminModel() {
		super();
	}

	public AdminModel(String username, String password, RoleModel role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RoleModel getRole() {
		return role;
	}

	public void setRole(RoleModel role) {
		this.role = role;
	}

}
