package services;

import java.util.List;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import domain.MortgageRate;
import repos.MortgageRateRepository;

@Service("mortgageRateService")
@Transactional
public class MortgageRateServiceImpl implements MortgageRateService {

	@Autowired
	private MortgageRateRepository rateRepository;

	@Override
	@Transactional(readOnly = true)
	public List<MortgageRate> findAll() {
		return Lists.newArrayList(rateRepository.findAll());
	}

	@Override
	@Transactional(readOnly = true)
	public MortgageRate findByMaturityPeriod(int maturityPeriod) {
		return rateRepository.findByMaturityPeriod(maturityPeriod); 
	}

	@Override
	public MortgageRate save(MortgageRate rate) {
		return rateRepository.save(rate);
	}

	@Override
	public void delete(MortgageRate rate) {
		rateRepository.delete(rate);
	}
	
}
