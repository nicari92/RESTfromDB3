package com.thinkopen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkopen.hotel.Hotel;
import com.thinkopen.hotel.HotelRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.MediaType;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/show")
public class ShowController {
	private Logger logger = LoggerFactory.getLogger(ShowController.class);
	
    @Autowired
	HotelRepository repo;
    
    @GetMapping(value = "/{city}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Hotel> hotels(@PathVariable String city) {
//    	logger.info("IN citta/{param}");
    	List<Hotel> hotels = repo.findAll();
    	hotels = hotels.stream().filter(i-> i != null)
    							.filter(i-> i.getCity() != null)
    							.filter(i-> i.getCity().getName().equalsIgnoreCase(city))
    							.collect(Collectors.toList());
//    	logger.debug("FOUND HOTELS: " + thinkopen);
		return hotels;
    }
	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)

	public List<Hotel> allHotels() {
//		logger.info("IN citta/{param}");
		List<Hotel> hotels = repo.findAll();
//		logger.debug("FOUND HOTELS: " + thinkopen);
		return hotels;
	}
    
    /*@GetMapping(value = "/alt/{city}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Hotel> hotelsAlt(@PathVariable String city) {
    	logger.info("IN citta/alt/{param}");
    	List<Hotel> thinkopen = repo.findByCityName(city);
		return thinkopen;
    }*/
}
