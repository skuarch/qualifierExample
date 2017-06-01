package com.astrazeneca.als;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.astrazeneca.als.demo", "com.astrazeneca.als"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean(name="mocos")
	@Qualifier("mocos")
	public MyBean myBean(){ System.out.print("seted ");
		return new MyBean();
	}
}
