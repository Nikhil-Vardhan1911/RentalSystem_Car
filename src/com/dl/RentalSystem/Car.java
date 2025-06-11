package com.dl.RentalSystem;

public class Car {

	private String model;
	private String number;
	private boolean isRented;
	
	public Car(String model, String number) {
		this.model = model;
		this.number =  number;
		this.isRented = false;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getNumber() {
		return number;
	}
	
	public boolean isRented() {
		return isRented;
	}
	
	public void rent() {
		isRented = true;
	}
	
	public void returnCar() {
		isRented = false;
	}
}
