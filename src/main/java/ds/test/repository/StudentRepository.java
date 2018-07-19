package ds.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import ds.test.model.Student;




@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	/*List<Student> findByStudent(Student student);
	@Query("select * from Student")
	List<Student> findStudents();*/
	List<Student> findAll();
}

	

