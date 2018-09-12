package com.backend.trics.platform.provider.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProviderMain {
	public static void main(String[] args) {
		SpringApplication.run(ProviderMain.class, args);
		try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
