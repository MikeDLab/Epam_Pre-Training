package com_Epam_Pre_Training.Task5.util;

import com_Epam_Pre_Training.Task5.model.entity.cars.Car;
import com_Epam_Pre_Training.Task5.model.entity.cars.CargoCar;
import com_Epam_Pre_Training.Task5.model.entity.cars.PassengerCar;
import com_Epam_Pre_Training.Task5.model.entity.fuel.Diesel;
import com_Epam_Pre_Training.Task5.model.entity.fuel.Electricity;
import com_Epam_Pre_Training.Task5.model.entity.fuel.Fuel;
import com_Epam_Pre_Training.Task5.model.entity.fuel.Petrol;

public enum CarGenerator implements CarInterface {

	Generator;
	private void generateCar(Car car) {
		int cost = MIN_CAR_COST + (int) (Math.random() * (MAX_CAR_COST - MIN_CAR_COST));
		car.setCost(cost);
		Fuel fuel = generateFuel((int) (Math.random() * 4));
		car.setFuel(fuel);
		double tankCapacity = MIN_TANK_CAPACITY + Math.random() * (MAX_TANK_CAPACITY - MIN_TANK_CAPACITY);
		car.setTankCapacity(tankCapacity);
		double maxSpeed = Math.random() * MAX_CAR_SPEED;
		car.setMaxSpeed(maxSpeed);
	}

	public PassengerCar generatePassengerCar() {
		PassengerCar passenger = new PassengerCar();
		generateCar(passenger);
		int maxPassengers = MIN_PASSENGERS_QUANTITY
				+ (int) (Math.random() * (MAX_PASSENGERS_QUANTITY - MIN_PASSENGERS_QUANTITY));
		int passengers = (int) (Math.random() * maxPassengers);
		double costPerKilometer = MIN_COST_PER_KM + Math.random() * (MAX_COST_PER_KM - MIN_COST_PER_KM);
		passenger.setMaxPassengers(maxPassengers);
		passenger.setPassengers(passengers);
		passenger.setCostPerKilometer(costPerKilometer);
		return passenger;
	}

	public CargoCar generateCargoCar() {
		CargoCar cargo = new CargoCar();
		generateCar(cargo);
		double maxCapacity = MIN_CARGO_CAPACITY + Math.random() * (MAX_CARGO_CAPACITY - MIN_CARGO_CAPACITY);
		double amountСargo = Math.random() * maxCapacity;
		int costOfUse = MIN_COST_OF_USE + (int) Math.random() * (MAX_COST_OF_USE - MIN_COST_OF_USE);
		cargo.setAmountСargo(amountСargo);
		cargo.setMaxCapacity(maxCapacity);
		cargo.setCostOfUse(costOfUse);
		return cargo;
	}

	private Fuel generateFuel(int number) {
		Fuel fuel;
		switch (number) {
		case 0:
			fuel = new Petrol();
			break;
		case 1:
			fuel = new Diesel();
			break;
		case 2:
			fuel = new Electricity();
			break;
		default:
			fuel = new Petrol();
		}
		return fuel;

	}
}
