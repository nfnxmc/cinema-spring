package com.mnc.cinema.admin.service;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class AdminConfig {

	@Bean
	public BCryptPasswordEncoder bcryptPasswordEncoder() throws NoSuchAlgorithmException {
		return new BCryptPasswordEncoder(12, SecureRandom.getInstance("NativePRNG"));
	}
}
