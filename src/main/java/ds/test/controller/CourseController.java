package ds.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ds.test.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	CourseService courseService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<Object> getAllCourses() {
		System.out.println("Calliing the all service");
		return new ResponseEntity<Object>(courseService.findAll(), HttpStatus.OK);
	}


	@RequestMapping(value = "/insert/{name}", method = RequestMethod.GET)
	public ResponseEntity<Object> add(@PathVariable(name = "name", required = true) String name) {
		System.out.println("Calliing the add service");
		courseService.addCourse(name);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/take/{id}", method = RequestMethod.GET)
	public ResponseEntity<Object> courseById(@PathVariable(name = "id", required = true) Integer id) {
		System.out.println("Calliing the course by id service");
		return new ResponseEntity<Object>(courseService.findCourseByCourseId(id), HttpStatus.OK);
	}

}