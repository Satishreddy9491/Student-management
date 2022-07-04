package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
@ComponentScan
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentrepository;
	
	@Override
	public void run(String... args) throws Exception {
//		Student student1=new Student("satish","reddy","a@gmail.com");
//		studentrepository.save(student1);
//		
//		Student student2=new Student("Reddy", "Venkata", "b@gmail.com");
//		studentrepository.save(student2);
//		
//		Student student3=new Student("jagan", "Mohan", "c@gmail.com");
//		studentrepository.save(student3);
	}

}
