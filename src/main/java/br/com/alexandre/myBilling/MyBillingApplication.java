package br.com.alexandre.myBilling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"br.com.alexandre"})
@EntityScan(basePackages = {"br.com.alexandre"})
public class MyBillingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBillingApplication.class, args);
	}
	
}
