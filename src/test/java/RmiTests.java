import static org.junit.Assert.assertEquals;

import java.util.List;

import org.assertj.core.internal.Classes;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import config.RmiClientConfig;
import domain.MortgageRate;
import services.MortgageRateService;

/**
 * 
 */

/**
 * @author User
 *
 */
@ContextConfiguration(classes = RmiClientConfig.class)
@RunWith(SpringRunner.class)
public class RmiTests {
	private Logger logger = LoggerFactory.getLogger(RmiTests.class);
	
	@Autowired
	private MortgageRateService mortgageRateService;
	
	@Test
	public void testRmiAllRates() {
		List<MortgageRate> mortgageRates = mortgageRateService.findAll();
		assertEquals(4, mortgageRates.size());
		listMortgageRates(mortgageRates);
	}
	
	@Test
	public void testRmi10Years() {
		List<MortgageRate> mortgageRates = (List<MortgageRate>) mortgageRateService.findByMaturityPeriod(10);
		assertEquals(1, mortgageRates.size());
		listMortgageRates(mortgageRates);
	}

	private void listMortgageRates(List<MortgageRate> mortgageRates) {
		mortgageRates.forEach(s-> logger.info(s.toString())); 
	}
	//dummy text to push code
}
