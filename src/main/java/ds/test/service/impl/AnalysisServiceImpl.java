/**
 * 
 */
package ds.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ds.test.model.AnalysisMaster;
import ds.test.repository.AnalysisMasterRepository;
import ds.test.service.AnalysisService;


/**
 * @author lti
 *
 */
@Service
public class AnalysisServiceImpl implements AnalysisService {

	@Autowired 
	AnalysisMasterRepository oAnalysisMasterRepository;

	@Override
	public void addAnalysisDetails(List<AnalysisMaster> oAnalysisMasterList) {
		// TODO Auto-generated method stub
		for (AnalysisMaster oAnalysisMaster : oAnalysisMasterList) {
			oAnalysisMasterRepository.save(oAnalysisMaster);
		}
	}

	@Override
	public List<AnalysisMaster> getAnalysisDetails() {
		// TODO Auto-generated method stub
		return oAnalysisMasterRepository.getAnalysisDetails();
	}

}
