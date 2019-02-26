/**
 * Class represents the result of the calculation of the mortgage. 
 * 
 */
package domain;

/**
 * @author Natallia
 * Class represents the result of MortgageCheck: isFeasible returns True if mortgage is possible,
 * montlyCost the cost of mortgage per month, additionalInfo returns the reason of refusal in case 
 * if mortgage is not possible.
 */
public class MortgageCheckResult {
	private boolean isFeasible;
	private double monthlyCost;
	private String additionalInfo;
	
	public MortgageCheckResult(boolean isFeasible, double monthlyCost, String additionalInfo) {
		this.isFeasible = isFeasible;
		this.monthlyCost = monthlyCost;
		this.additionalInfo = additionalInfo;
	}

	public boolean isFeasible() {
		return isFeasible;
	}

	public void setFeasible(boolean isFeasible) {
		this.isFeasible = isFeasible;
	}

	public double getMonthlyCost() {
		return monthlyCost;
	}

	public void setMonthlyCost(double monthlyCost) {
		this.monthlyCost = monthlyCost;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	
	
}
