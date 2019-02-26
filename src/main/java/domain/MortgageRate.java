package domain;

import java.time.LocalDateTime;
import java.util.Date;

/* 
 * Class that represents Mortgage rate, rates are defined per maturity period in years. 
 */
public class MortgageRate {
	private int maturityPeriod;
	private double interestRate;
	private Date lastUpdate;
	
	public MortgageRate(int maturityPeriod, double interestRate, Date lastUpdate) {
		this.maturityPeriod = maturityPeriod;
		this.interestRate = interestRate;
		this.lastUpdate = lastUpdate;	
	}

	public MortgageRate() {
		// TODO Auto-generated constructor stub
	}

	public int getMaturityPeriod() {
		return maturityPeriod;
	}

	public void setMaturityPeriod(int maturityPeriod) {
		this.maturityPeriod = maturityPeriod;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}
