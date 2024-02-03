package com.technosignia.com.QuickEstate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Properties {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	String types;
	String name;
	@ManyToOne
	Owner owner;
	String configuration;
	@OneToOne
	Address address;
	double rentalPrice;
	double sellPrice;
	String propertyAge;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public String getConfiguration() {
		return configuration;
	}
	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getRentalPrice() {
		return rentalPrice;
	}
	public void setRentalPrice(double rentalPrice) {
		this.rentalPrice = rentalPrice;
	}
	public double getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}
	public String getProperty_Age() {
		return propertyAge;
	}
	public void setProperty_Age(String property_Age) {
		propertyAge = property_Age;
	}

}
