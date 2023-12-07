package com.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient//ServiceRegistry will automatically register the local server
@EnableFeignClients
public class FeignAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignAppApplication.class, args);
	}

}
