package ds.test.service;

import java.util.List;
import org.springframework.stereotype.Service;
import ds.test.model.Course;

@Service
public interface CourseService {
	List<Course> findAll();	
	void addCourse(String name);	
	Course findCourseByCourseId(Integer courseId);
}

