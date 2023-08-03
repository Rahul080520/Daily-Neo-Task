package com.proxy;

import com.proxy.accountImpl.Atm;
import com.proxy.accountImpl.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProxyApplication implements CommandLineRunner {

	@Autowired
	private Atm atm;

	public static void main(String[] args) {
		SpringApplication.run(ProxyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(atm.getAccountDetails("1345"));
		System.out.println(atm.getBalance("1345"));
	}
}
