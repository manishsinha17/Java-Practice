/**
 * 
 */
package ds.test.service;

import java.util.List;

import ds.test.model.AnalysisMaster;

/**
 * @author lti
 *
 */
public interface AnalysisService {
	void addAnalysisDetails(List<AnalysisMaster> oAnalysisMaster);
	List<AnalysisMaster> getAnalysisDetails();
}
 