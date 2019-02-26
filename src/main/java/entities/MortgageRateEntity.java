/**
 * 
 */
package entities;

import java.io.Serializable;
//import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * @author User
 *
 */


@Entity 
@Table(name = "mortgageRateTable")
public class MortgageRateEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Version
	@Column(name = "VERSION")
	private int version;
	
	@Column(name = "MATURITY_PERIOD")
	private int maturityPeriod;
	
	@Column(name = "INTEREST_RATE")
	private double interestRate;
	
	@Column(name = "LAST_UPDATE")
	private Date lastUpdate;
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
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

	public Long getId() {
		return id;
	}

	
	

}
