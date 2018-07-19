/**
 * 
 */
package ds.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ds.test.model.AnalysisMaster;



/**
 * @author lti
 *
 */
public interface AnalysisMasterRepository extends JpaRepository<AnalysisMaster, Long> {

	@Query("SELECT p FROM AnalysisMaster p WHERE p.createDateTime = (select max(createDateTime) from AnalysisMaster)")
	List<AnalysisMaster> getAnalysisDetails();
} 
