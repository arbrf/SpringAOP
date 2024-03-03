package com.in28minutes.LEarn.SpringAOP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.LEarn.SpringAOPexample.bussiness.BussinessService1;

@SpringBootApplication
@ComponentScan(basePackages = {"com.in28minutes.LEarn.SpringAOP", "com.in28minutes.LEarn.SpringAOPexample"})

public class LEarnSpringAopApplication implements CommandLineRunner {
	private Logger logger=LoggerFactory.getLogger(getClass());	
	
private BussinessService1 bussinessService1;
	@Autowired
	public LEarnSpringAopApplication(BussinessService1 bussinessService1) {
	super();
	this.bussinessService1 = bussinessService1;
}

	public static void main(String[] args) {
		SpringApplication.run(LEarnSpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("value returned is {}",bussinessService1.calculateMax());
		
	}

}
