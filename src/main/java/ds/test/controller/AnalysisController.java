/**
 * 
 */
package ds.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ds.test.model.AnalysisMaster;
import ds.test.service.impl.AnalysisServiceImpl;

/**
 * @author lti
 *
 */
//@CrossOrigin(origins = "http://localhost:8089")
@RestController
@RequestMapping("/analysis")
public class AnalysisController { 
	
	
	@Autowired
	AnalysisServiceImpl oAnalysisServiceImpl;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void addAnalysisDetails(@RequestBody List<AnalysisMaster> oAnalysisMasterList) {
		oAnalysisServiceImpl.addAnalysisDetails(oAnalysisMasterList);
	}

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<Object> getAnalysisDetails() {
		List<AnalysisMaster> oAnalysisMasterList = oAnalysisServiceImpl.getAnalysisDetails();
		return new ResponseEntity<Object>(oAnalysisMasterList, HttpStatus.OK);
	}
}
