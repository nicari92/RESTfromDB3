package com.thinkopen.hotel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CITY")
public class City {
	
	@Id
    @GeneratedValue
	@Column(name = "Id")
	private Long id;
	
	@Column(name = "Name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public City() {}
	
	public City(String name) {
		this.name = name;
	}
}
