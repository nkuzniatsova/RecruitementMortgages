package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

import services.MortgageRateService;

/*
 * Invoking the service
 */
@Configuration
public class RmiClientConfig {
	
	@Bean
	public MortgageRateService mortgageRateService() {
		HttpInvokerProxyFactoryBean factoryBean = new HttpInvokerProxyFactoryBean();
		factoryBean.setServiceInterface(MortgageRateService.class);
		factoryBean.setServiceUrl("http://localhost:8080/invoker/httpInvoker/mortgageRateService");
		factoryBean.afterPropertiesSet();
		return (MortgageRateService) factoryBean.getObject();
	}
	
}
