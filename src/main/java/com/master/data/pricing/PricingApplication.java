package com.master.data.pricing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EntityScan("com.master.data.pricing.models")
@EnableJpaRepositories("com.master.data.pricing.repositories")
public class PricingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PricingApplication.class, args);
	}
}