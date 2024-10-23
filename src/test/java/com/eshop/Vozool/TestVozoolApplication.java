package com.eshop.Vozool;

import org.springframework.boot.SpringApplication;

public class TestVozoolApplication {

	public static void main(String[] args) {
		SpringApplication.from(VozoolApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
