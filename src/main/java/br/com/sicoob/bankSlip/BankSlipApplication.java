package br.com.sicoob.bankSlip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



@SpringBootApplication
public class BankSlipApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankSlipApplication.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("1234"));
	}

}
