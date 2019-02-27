/**
 * 
 */
package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

import services.MortgageRateService;

/**
 * @author User
 *
 */
@Configuration
public class HttpInvokerConfig {
	
	@Autowired
	MortgageRateService mortgageRateService;
	
	@Bean(name = "/httpInvoker/mortgageRateService")
	public HttpInvokerServiceExporter httInvokerServiceExplorer() {
		HttpInvokerServiceExporter invokerService = new HttpInvokerServiceExporter();
		invokerService.setService(mortgageRateService);
		invokerService.setServiceInterface(MortgageRateService.class);
		return invokerService;		
	}
	 
}
