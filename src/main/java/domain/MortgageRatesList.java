package domain;

import java.time.LocalDateTime;
import java.util.List;

/* 
 * Class that is responsible for the management of Mortgage rates
 */
public class MortgageRatesList {
	private List<MortgageRate> ratesList;
	
	public MortgageRatesList() {		
	}
	
	public MortgageRatesList(List<MortgageRate> ratesList) {
		this.ratesList = ratesList;
	}
	/*
	 * Add new Mortgage Rate to the Mortgage Rates List
	 */
	public void addMortageRate(int maturityPeriod, double interestRate, LocalDateTime lastUpdate) {
		MortgageRate mRate = new MortgageRate(maturityPeriod, interestRate, lastUpdate);
		ratesList.add(mRate);
	}	
		
	public List<MortgageRate> getRatesList() {
		return ratesList;
	}

	public void setRatesList(List<MortgageRate> ratesList) {
		this.ratesList = ratesList;
	}

	/*
	 * Returns interestRate with defined maturity period from Mortgage Rates List
	 */
	public MortgageRate getInterestRateByPeriod(int period) {
		MortgageRate rate = null;
		for (MortgageRate mRate : ratesList) {
			if(mRate.getMaturityPeriod() == period) {
				rate = mRate;
			}
		}
		return rate;
	}
}
