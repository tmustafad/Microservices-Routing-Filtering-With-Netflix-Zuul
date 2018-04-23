package com.turkmen.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author TTTDEMIRCI
 *
 */

@RestController
@SpringBootApplication
public class LoginApplication {

	private static Logger logger=LoggerFactory.getLogger(LoginApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
	}

	@RequestMapping("/login")
	public String login() {
		logger.info("In Login method......");
		return "Login done!";
	}
}
