package ds.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

@Service
@Entity
@Table(name = "course", schema = "dbo")
public class Course {

	@Id
	@Column(name = "course_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "course_sequence")
	@SequenceGenerator(name = "course_sequence", sequenceName = "course_sequence")
	private int courseId;

	@Column(name = "course_name", nullable = false)
	private String courseName;

	/**
	 * @return the itemType
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @param itemType
	 *            the itemType to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
