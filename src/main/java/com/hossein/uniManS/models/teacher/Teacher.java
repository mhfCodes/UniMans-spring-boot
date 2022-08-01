package com.hossein.uniManS.models.teacher;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.hossein.uniManS.models.MainUser;
import com.hossein.uniManS.models.course.Course;
import com.hossein.uniManS.models.roles.RoleModel;

@Entity
@Table(name = "TEACHER")
public class Teacher extends MainUser {

	@Id
	@SequenceGenerator(
				name = "seq_teacher",
				sequenceName = "seq_teacher",
				allocationSize = 1
			)
	@GeneratedValue(
				strategy = GenerationType.SEQUENCE,
				generator = "seq_teacher"
			)
	private Long id;
	
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@OneToOne
	@JoinColumn(name = "ROLE_ID")
	private RoleModel role;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "TEACHING_CODE")
	private Long teachingCode;
	
	@ManyToMany
	@JoinTable(
				name = "TEACHERS_COURSES",
				joinColumns = @JoinColumn(name = "TEACHER_ID"),
				inverseJoinColumns = @JoinColumn(name = "COURSE_ID")
			)
	private Set<Course> courses;

	public Teacher() {
		super();
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getTeachingCode() {
		return teachingCode;
	}

	public void setTeachingCode(Long teachingCode) {
		this.teachingCode = teachingCode;
	}

	public RoleModel getRole() {
		return role;
	}

	public void setRole(RoleModel role) {
		this.role = role;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
}
