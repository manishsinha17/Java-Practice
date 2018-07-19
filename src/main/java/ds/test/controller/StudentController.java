package ds.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ds.test.service.StudentService;



@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<Object> getAllStudents() {
		System.out.println("Calliing the all service");
		return new ResponseEntity<Object>(studentService.findAll(), HttpStatus.OK);
	}


	@RequestMapping(value = "/insert/{name}", method = RequestMethod.GET)
	public ResponseEntity<Object> add(@PathVariable(name = "name", required = true) String name) {
		System.out.println("Calliing the add service");
		studentService.addStudent(name);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
}
