package repos;

import org.springframework.data.repository.CrudRepository;

import domain.MortgageRate;

public interface MortgageRateRepository extends CrudRepository<MortgageRate, Long> {

	MortgageRate findByMaturityPeriod(int maturityPeriod);

}
