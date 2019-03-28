package com.epam.springBootSproject;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringBootSprojectApplication {

	private static final Logger log = Logger.getLogger(SpringBootSprojectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSprojectApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner (ApplicationContext ctx) {
		log.info("Log for app");
		log.info("VER- "+org.springframework.core.SpringVersion.getVersion());
		log.error("Это сообщение об ошибке");

		System.out.println("    -----------    ");
		System.out.println("VER- "+org.springframework.core.SpringVersion.getVersion());
		return args -> {
			log.info("All beans are loaded for start");
			String[] beanNames = ctx.getBeanDefinitionNames();
			Stream.of(beanNames)
					.filter(a -> a.contains("org.springframework.boot"))
					.sorted()
					.forEach(a -> {
						log.info(String.format("Been {%s}",a));
					});
		};
//					.forEach(System.out::println);
	}




}


