package domain;
 /*
  * Class represents mortgage request containing income, maturity period, loan value, home value
  */
public class MortgageRequest {
	private double income; 
	private int maturityPeriod; 
	private double loanValue;
	private double homeValue;
	
	public MortgageRequest(double income, int maturityPeriod, double loanValue, double homeValue) {
		this.income = income;
		this.maturityPeriod = maturityPeriod;
		this.loanValue = loanValue;
		this.homeValue = homeValue;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public int getMaturityPeriod() {
		return maturityPeriod;
	}

	public void setMaturityPeriod(int maturityPeriod) {
		this.maturityPeriod = maturityPeriod;
	}

	public double getLoanValue() {
		return loanValue;
	}

	public void setLoanValue(double loanValue) {
		this.loanValue = loanValue;
	}

	public double getHomeValue() {
		return homeValue;
	}

	public void setHomeValue(double homeValue) {
		this.homeValue = homeValue;
	}
	
}
