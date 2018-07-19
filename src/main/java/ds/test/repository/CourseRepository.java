package ds.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ds.test.model.Course;


public interface CourseRepository  extends JpaRepository<Course, Integer> {

	@Query("SELECT c FROM Course c where c.courseId = ?1")
	Course findByCourseId(Integer userId);

	List<Course> findAll();

}
