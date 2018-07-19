package ds.test.service.impl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ds.test.model.Student;
import ds.test.repository.StudentRepository;
import ds.test.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository repository;
	
	@Override
	public List<Student> findAll() {
		return repository.findAll();
	}

	@Override
	public void addStudent(String name) {
		Student student = new Student();
		student.setStudentName(name);
		Random random = new Random();
		int i = random.nextInt();
		System.out.println("i = " + i);
		
		student.setId(i);
		repository.save(student);
	}

	
	
}
