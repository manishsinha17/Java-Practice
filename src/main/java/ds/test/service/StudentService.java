package ds.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ds.test.model.Student;

@Service
public interface StudentService {

		List<Student> findAll();
		
		void addStudent(String name);
}
