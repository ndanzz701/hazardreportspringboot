package com.hazardreport.hazard.report;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HazardReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(HazardReportApplication.class, args);
	}

}
