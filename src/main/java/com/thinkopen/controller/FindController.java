package com.thinkopen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.data.domain.Pageable;

import javax.servlet.http.HttpServletRequest;

import com.thinkopen.hotel.CityRepo;
import com.thinkopen.hotel.HotelRepository;

@Controller
@RequestMapping("/hotel")
public class FindController {
	
	@Autowired
	CityRepo repo;
	
	@Autowired
	HotelRepository hrepo;
	
	@GetMapping
	public String hotel(Model model) {
		return "hotel";
	}
	
	@RequestMapping(value = "search", method = RequestMethod.GET)
	@ResponseBody
	public List<String> search(HttpServletRequest request) {
		return repo.findByName(request.getParameter("term"),  (Pageable) PageRequest.of(0,10));

	}
	@GetMapping("/result")
    public String authors(@RequestParam String cityName, Model model) {
        model.addAttribute("hotels", hrepo.findByCityName(cityName));
        model.addAttribute("hotel", "Hotel");
        System.out.print(hrepo.findByCityName(cityName));
        return "result";
    }

}
