package ds.test.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "student", schema = "dbo")
public class Student {
	
	@Id
	@Basic(optional = false)
	@NotNull
	//@GeneratedValue(strategy = GenerationType.AUTO, generator = "role_gen")
	@Column(name = "student_id", nullable = false)
	private Integer studentId;

	@Column(name = "student_name")
	private String studentName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setId(Integer id) {
		this.studentId = id;
	}
	
}
