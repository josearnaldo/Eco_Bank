package com.example.register;

import org.springframework.boot.SpringApplication;

public class TestRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.from(RegisterApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
