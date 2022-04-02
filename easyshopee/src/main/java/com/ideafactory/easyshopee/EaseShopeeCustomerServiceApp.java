package com.ideafactory.easyshopee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

import com.ideafactory.easyshopee.controller.CustomerOrderController;

@SpringBootApplication
public class EaseShopeeCustomerServiceApp extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(EaseShopeeCustomerServiceApp.class, args);
	}
}
