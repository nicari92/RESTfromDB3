package com.thinkopen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thinkopen.hotel.HotelRepository;


@SpringBootApplication
public class  MyApp {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
    HotelRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
	}

}
