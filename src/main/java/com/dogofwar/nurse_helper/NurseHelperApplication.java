package com.dogofwar.nurse_helper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dogofwar.nurse_helper.dao")
public class NurseHelperApplication {

	public static void main(String[] args) {
		SpringApplication.run(NurseHelperApplication.class, args);
	}
}
