package ds.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ds.test.model.Course;
import ds.test.repository.CourseRepository;
import ds.test.service.CourseService;

@Service
public class CourseServiceImpl  implements CourseService {

	@Autowired
	CourseRepository repository;
	
	@Override
	public List<Course> findAll() {
		return repository.findAll();
	}

	@Override
	public void addCourse(String name) {
		Course course = new Course();
		course.setCourseName(name);
		repository.save(course);
	}

	@Override
	public Course findCourseByCourseId(Integer courseId) {
		return repository.findByCourseId(courseId);
	}

}
