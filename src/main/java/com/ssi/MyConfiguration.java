package com.ssi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.ssi")
public class MyConfiguration {
	
	@Bean(initMethod="start", destroyMethod="stop")
	@Scope("prototype")
	public Customer customer1() {
		Customer c1=new Customer();
		c1.setCode(111);
		c1.setCname("ABC");
		c1.setAddress(address1());
		return c1;
	}
	@Bean(initMethod="start", destroyMethod="stop")
	@Scope("prototype")
	public Customer customer2() {
		Customer c2=new Customer(112,"XYZ",address2());
		return c2;
	}
	
	public Address address1() {
		Address adr1=new Address(); adr1.setStreet("ABRoad");adr1.setCity("Indore");
		return adr1;
	}
	public Address address2() {
		Address adr2=new Address(); adr2.setStreet("MGRoad");adr2.setCity("Bhopal");
		return adr2;
	}

}
