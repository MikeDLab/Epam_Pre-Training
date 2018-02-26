package com_Epam_Pre_Training.Task5.Model.entity.cars;

public class PassengerCar extends Car {
	protected int passengers;
	protected int maxPassengers;
	protected double costPerKilometer;

	public PassengerCar() {
		this.type = "Passenger";
	}

	public PassengerCar(int maxPassengers, int passengers, double costPerKm, int cost, String brand, String fuel,
			double tankCapacity, double maxSpeed) {
		super(cost,brand,fuel,tankCapacity, maxSpeed);
		this.type = "Passenger";
		this.passengers = passengers;
		this.costPerKilometer = costPerKm;
		this.maxPassengers = maxPassengers;
	}
	public PassengerCar(PassengerCar car)
	{
		super(car);
		this.passengers = car.getPassengers();
		this.maxPassengers = car.getMaxPassengers();
		this.costPerKilometer = car.getCostPerKilometer();
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
