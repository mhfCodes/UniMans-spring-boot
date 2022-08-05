package com.hossein.uniManS;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.hossein.uniManS.dao.admin.IAdminRepository;
import com.hossein.uniManS.dao.roles.IRolesRepository;
import com.hossein.uniManS.dao.student.IStudentRepository;
import com.hossein.uniManS.dao.teacher.ITeacherRepository;
import com.hossein.uniManS.models.admin.AdminModel;
import com.hossein.uniManS.models.roles.RoleModel;
import com.hossein.uniManS.models.student.Student;
import com.hossein.uniManS.models.teacher.Teacher;

@SpringBootApplication
public class UniManSApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniManSApplication.class, args);
	}
	
//	@Bean
//	CommandLineRunner runner(IAdminRepository adminRepo, IRolesRepository roleRepo
//							, IStudentRepository studentRepo, ITeacherRepository teacherRepo) {
//		
//		return args -> {
//			
//			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//			
//			RoleModel adminRole = new RoleModel("ROLE_ADMIN");
//			RoleModel studentRole = new RoleModel("ROLE_STUDENT");
//			RoleModel teacherRole = new RoleModel("ROLE_TEACHER");
//			
//			roleRepo.saveAll(List.of(adminRole, studentRole, teacherRole));
//			
//			AdminModel admin = new AdminModel("admin", passwordEncoder.encode("abcd"), adminRole);
//			Teacher teacher1 = new Teacher("teacher1", passwordEncoder.encode("abcd"), teacherRole, "John", "Doe", 123456L);
//			Teacher teacher2 = new Teacher("teacher2", passwordEncoder.encode("abcd"), teacherRole, "Jane", "Doe", 234567L);
//			Teacher teacher3 = new Teacher("teacher3", passwordEncoder.encode("abcd"), teacherRole, "Alex", "Smith", 345678L);
//
//			Student student1 = new Student("student1", passwordEncoder.encode("abcd"), studentRole, "David", "Williams", 741L);
//			Student student2 = new Student("student2", passwordEncoder.encode("abcd"), studentRole, "Liam", "Nesson", 852L);
//			Student student3 = new Student("student3", passwordEncoder.encode("abcd"), studentRole, "Morgan", "Freeman", 963L);
//			
//			adminRepo.save(admin);
//			teacherRepo.saveAll(List.of(teacher1, teacher2, teacher3));
//			studentRepo.saveAll(List.of(student1, student2, student3));
//			
//		};
//	}

}
