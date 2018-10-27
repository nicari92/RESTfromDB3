package com.thinkopen.hotel;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "HOTEL")
public class Hotel {
	
	@Id
    @GeneratedValue
	@Column(name = "Id")
	private Long id;
	
	@Column(name = "Name")
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CityId")
    private City city;
	
	@Column(name = "WebSite")
	private String webSite;
	
	public Hotel() {}
	
	public Hotel(String name, String webSite, City city) {
		this.name = name;
		this.webSite = webSite;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	
	public City getCity() {
		return this.city;
	}
	
	public void setCity(City city) {
		this.city = city;
	}

}
