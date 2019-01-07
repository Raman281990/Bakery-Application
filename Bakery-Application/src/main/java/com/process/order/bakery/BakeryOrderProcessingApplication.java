package com.process.order.bakery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Ramandeep kaur
 * 
 * Bakery Order Processing Application Spring boot Main Class which loads all the configuration data.
 * 
 *
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class,
		HibernateJpaAutoConfiguration.class,
		DataSourceTransactionManagerAutoConfiguration.class })
@ComponentScan(basePackages = { "com.process.order.bakery" })
@EnableSwagger2
@EnableConfigServer
public class BakeryOrderProcessingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BakeryOrderProcessingApplication.class, args);
	}
}
