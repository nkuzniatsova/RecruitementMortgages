/**
 * 
 */
package services;

import java.util.List;

import domain.MortgageRate;

/**
 * @author User
 *
 */
public interface MortgageRateService {
	
	List<MortgageRate> findAll();
	MortgageRate findByMaturityPeriod(int maturityPeriod);
	MortgageRate save(MortgageRate rate);
	void delete(MortgageRate rate);
	
}
