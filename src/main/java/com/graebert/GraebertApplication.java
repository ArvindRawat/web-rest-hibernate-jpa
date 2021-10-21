package com.graebert;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class GraebertApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraebertApplication.class, args);
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	/*@Bean
   	public HibernateJpaSessionFactoryBean sessionFactory() {
   		return new HibernateJpaSessionFactoryBean();
   	}*/

}
