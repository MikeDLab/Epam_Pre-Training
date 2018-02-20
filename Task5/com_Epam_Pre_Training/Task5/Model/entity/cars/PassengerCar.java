package com_Epam_Pre_Training.Task5.Model.entity.cars;

import com_Epam_Pre_Training.Task5.Model.entity.fuel.Fuel;

public class PassengerCar extends Car {
	int passengers;
	int maxPassengers;
	double costPerKilometer;

	public PassengerCar() {
		this.type = "Passenger";
	}

	public PassengerCar(int _maxPassengers, int _passengers, double _costPerKm, int _cost, String _brand, String _fuel,
			double _tankCapacity, double _maxSpeed) {
		this.type = "Passenger";
		this.passengers = _passengers;
		this.costPerKilometer = _costPerKm;
		this.maxPassengers = _maxPassengers;
		this.cost = _cost;
		this.brand = _brand;
		this.maxSpeed = _maxSpeed;
		this.tankCapacity = _tankCapacity;
		super.setFuel(_fuel);

	}

	public int getPassengers() {
		return passengers;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public double getCostPerKilometer() {
		return costPerKilometer;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	public void setCostPerKilometer(double cost) {
		this.costPerKilometer = cost;
	}

	@Override
	public int hashCode() {
		// TODO Автоматически созданная заглушка метода
		int result = 3;
		result = super.hashCode() + maxPassengers + passengers + (int) costPerKilometer;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Автоматически созданная заглушка метода
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		PassengerCar object = (PassengerCar) obj;
		return super.equals(object) && this.getMaxPassengers() == object.getMaxPassengers()
				&& this.getCostPerKilometer() == object.getCostPerKilometer()
				&& this.getPassengers() == object.getPassengers();
	}

	@Override
	public String toString() {
		// TODO Автоматически созданная заглушка метода
		return "PassengerCar{" + "type=" + type + ",brand=" + brand + ",fuel" + fuel + ",cost=" + cost
				+ ",tankCapacity=" + tankCapacity + ",maxSpeed=" + maxSpeed + ",passengers=" + passengers
				+ ",maxPassengers=" + maxPassengers + ",costPerKilometer=" + costPerKilometer + '}';
	}

}
