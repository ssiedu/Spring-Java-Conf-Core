package com.ssi;

import org.springframework.stereotype.Component;


public class Customer {
	private int code;
	private String cname;
	private Address address;
	
	public void start() {
		System.out.println("Customer Start");
	}
	public void stop() {
		System.out.println("Customer Stop");
	}
	
	public Customer() {
		System.out.println("No Arg Constructor Called");
	}
	public Customer(int code, String cname, Address address) {
		System.out.println("Two Arg Constructor Called");
		this.code = code;
		this.cname = cname;
		this.address = address;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [code=" + code + ", cname=" + cname + ", address=" + address + "]";
	}
	
	

	
}
