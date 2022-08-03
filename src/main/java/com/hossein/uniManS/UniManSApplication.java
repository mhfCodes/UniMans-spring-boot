package com.hossein.uniManS;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.hossein.uniManS.dao.admin.AdminRepository;
import com.hossein.uniManS.dao.roles.RolesRepository;
import com.hossein.uniManS.dao.student.StudentRepository;
import com.hossein.uniManS.dao.teacher.TeacherRepository;
import com.hossein.uniManS.models.admin.AdminModel;
import com.hossein.uniManS.models.roles.RoleModel;
import com.hossein.uniManS.models.student.Student;
import com.hossein.uniManS.models.teacher.Teacher;

@SpringBootApplication
public class UniManSApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniManSApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(AdminRepository adminRepo, RolesRepository roleRepo
							, StudentRepository studentRepo, TeacherRepository teacherRepo) {
		
		return args -> {
			
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			
			RoleModel adminRole = new RoleModel("ROLE_ADMIN");
			RoleModel studentRole = new RoleModel("ROLE_STUDENT");
			RoleModel teacherRole = new RoleModel("ROLE_TEACHER");
			
			roleRepo.saveAll(List.of(adminRole, studentRole, teacherRole));
			
			AdminModel admin = new AdminModel("admin", passwordEncoder.encode("abcd"), adminRole);
			Teacher teacher = new Teacher("teacher", passwordEncoder.encode("abcd"), teacherRole);
			Student student = new Student("student", passwordEncoder.encode("abcd"), studentRole);
			
			adminRepo.save(admin);
			teacherRepo.save(teacher);
			studentRepo.save(student);
			
		};
	}

}
