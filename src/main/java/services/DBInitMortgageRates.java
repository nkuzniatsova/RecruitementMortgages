/**
 * 
 */
package services;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import domain.MortgageRate;
import entities.MortgageRateEntity;
import repos.MortgageRateRepository;

/**
 * @author User
 *
 */
public class DBInitMortgageRates {

	private Logger logger = LoggerFactory.getLogger(DBInitMortgageRates.class);
	@Autowired
	MortgageRateRepository rateRepository;
	
	@PostConstruct
	public void initDB() {
		logger.info("Starting DB initialization...");
		MortgageRate rate = new MortgageRate();
		rate.setMaturityPeriod(3); //3 years
		rate.setInterestRate(5.2);
		rate.setLastUpdate(new Date(new GregorianCalendar(2019, 02, 25).getTime().getTime()));
		rateRepository.save(rate);
		
		MortgageRate rate1 = new MortgageRate();
		rate1.setMaturityPeriod(5); 
		rate1.setInterestRate(4.5);
		rate1.setLastUpdate(new Date(new GregorianCalendar(2019, 02, 25).getTime().getTime()));
		rateRepository.save(rate1);
		
		MortgageRate rate2 = new MortgageRate();
		rate2.setMaturityPeriod(10); 
		rate2.setInterestRate(5.2);
		rate2.setLastUpdate(new Date(new GregorianCalendar(2019, 02, 25).getTime().getTime()));
		rateRepository.save(rate2);
		
		MortgageRate rate3 = new MortgageRate();
		rate3.setMaturityPeriod(30); //30 years
		rate3.setInterestRate(2.5);
		rate3.setLastUpdate(new Date(new GregorianCalendar(2019, 02, 25).getTime().getTime()));
		rateRepository.save(rate3);
		
		logger.info("Database initialization finished.");
	}
}
