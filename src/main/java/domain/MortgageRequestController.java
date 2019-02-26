package domain;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MortgageRequestController {

	
	@RequestMapping(value = "/api/mortgage-check", method = RequestMethod.POST)
	
	
	
	public MortgageCheckResult doMortgageCheck() {
	    
	    MortgageCheckResult result = null;
		return result;
	    }
}



