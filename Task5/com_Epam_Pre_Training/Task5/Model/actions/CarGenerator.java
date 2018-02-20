package com_Epam_Pre_Training.Task5.Model.actions;

import com_Epam_Pre_Training.Task5.Model.entity.cars.Car;
import com_Epam_Pre_Training.Task5.Model.entity.cars.CargoCar;
import com_Epam_Pre_Training.Task5.Model.entity.cars.PassengerCar;

public class CarGenerator {
	private CarGenerator() {
	}
	private static void generateCarsParameters(Car car)
	{
		int cost = 1000 + (int) ( Math.random() * 4000 );
		car.setCost(cost);
		String brand = generateBrand(0 + (int) ( Math.random() * 6 ));
		car.setBrand(brand);
		String fuel = generateFuel(0 + (int) ( Math.random() * 3 ));
		car.setFuel(fuel);
		double tankCapacity = 10 +  Math.random() *35;
		car.setTankCapacity(tankCapacity);
		double maxSpeed = 120 +  Math.random() *80;
		car.setMaxSpeed(maxSpeed);
	}
	public static PassengerCar generatePassengerCar()
	{
		PassengerCar passenger = new PassengerCar();
		generateCarsParameters(passenger);
		int maxPassengers = 1 + (int) ( Math.random() * 4 );
		int passengers = 1+ (int) ( Math.random() *maxPassengers );
		double costPerKilometer = 10 +  Math.random() *40;
		passenger.setMaxPassengers(maxPassengers);
		passenger.setPassengers(passengers);
		passenger.setCostPerKilometer(costPerKilometer);
		return passenger;
	}
	public static CargoCar generateCargoCar()
	{
		CargoCar cargo = new CargoCar();
		generateCarsParameters(cargo);
		double maxCapacity =100 +  Math.random() *200 ;
		double amountСargo = 0 +  Math.random() *maxCapacity;
		double costOfUse=10 +  Math.random() *40;
		cargo.setAmountСargo(amountСargo);
		cargo.setMaxCapacity(maxCapacity);
		cargo.setCostOfUse(costOfUse);
		return cargo;
	}
	private static String generateFuel(int number) {
		String fuel;
		switch (number) {
		case 0:
			fuel = "Petrol";
			break;
		case 1:
			fuel = "Diesel";
			break;
		case 2:
			fuel = "Electricity";
			break;
		default:
			fuel = "Petrol";
		}
		return fuel;
	}

	private static String generateBrand(int number) {
		String brand;
		switch (number) {
		case 0:
			brand = "Toyta";
			break;
		case 1:
			brand = "Mazda";
			break;
		case 2:
			brand = "BMW";
			break;
		case 3:
			brand = "LADA";
			break;
		case 4:
			brand = "Lexus";
			break;
		case 5:
			brand = "Honda";
			break;
		default:
			brand = "Audi";

		}
		return brand;
	}
}
