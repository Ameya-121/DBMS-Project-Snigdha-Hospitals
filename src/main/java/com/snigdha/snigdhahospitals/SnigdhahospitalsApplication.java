package com.snigdha.snigdhahospitals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SnigdhahospitalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnigdhahospitalsApplication.class, args);
		System.out.println("started . . . . ");
	}

}
