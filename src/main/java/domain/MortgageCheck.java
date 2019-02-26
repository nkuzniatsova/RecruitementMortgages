package domain;

import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class MortgageCheck {
	
	public static void main(String[] args) throws IOException {
		SpringApplication.run(MortgageCheck.class, args);
			
	}
}