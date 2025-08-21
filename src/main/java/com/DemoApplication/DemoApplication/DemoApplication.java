package com.DemoApplication.DemoApplication;

import com.DemoApplication.DemoApplication.controller.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(UserController.class);


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
        logger.info("Application starting");
	}

}