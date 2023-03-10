package com.report.reportservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ReportServiceApplication {
	@Value(value = "${my.value}")
	private String myValue;

	@GetMapping("/")
	public String getMyValue() {
		return "My value: " + myValue;
	}
	public static void main(String[] args) {
		SpringApplication.run(ReportServiceApplication.class, args);
	}

}
