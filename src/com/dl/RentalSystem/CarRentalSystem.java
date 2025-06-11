package com.dl.RentalSystem;

public class CarRentalSystem {

	private Car[] cars;
	
	public CarRentalSystem() {
		cars = new Car[] {
			new Car("Maruti swift", "KA 5328"),
			new Car("Hyundai", "KA 2346"),
			new Car("Audi", "AP 9999"),
			new Car("BMW", "AP 7843")
		};
	}
	
	public void showAvailableCars() {
		
		System.out.println("\n Available Cars: ");
		for(Car car: cars) {
			if(!car.isRented()) {
				System.out.println(car.getModel()+ " - "+ car.getNumber());
			}
		}
	}
	
	public void rentCar(String number) {
		for(Car car : cars) {
			if(car.getNumber().equals(number) && !car.isRented()) {
				car.rent();
				System.out.println("✅ Car rented successfully!");
				return;
			}
		}
		System.out.println("❌ Car not available or already rented.");
	}
	
	public void returnCar(String number) {
		
		for(Car car : cars) {
			if(car.getNumber().equals(number) && car.isRented()) {
				car.returnCar();
				System.out.println("✅ Car returned successfully!");
				return;
			}
		}
		System.out.println("❌ Car not found or not rented.");
	}
}
