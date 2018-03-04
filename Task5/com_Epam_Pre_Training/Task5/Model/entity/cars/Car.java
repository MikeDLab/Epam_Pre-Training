package com_Epam_Pre_Training.Task5.model.entity.cars;

import com_Epam_Pre_Training.Task5.model.entity.fuel.Fuel;

public class Car {
	protected final String DEFAULT_BRAND = "Unknown brand";
	protected String type;
	protected String brand = DEFAULT_BRAND;
	protected Fuel fuel;
	protected int cost;
	protected double tankCapacity;
	protected double maxSpeed;

	public Car() {

	}

	public Car(int cost, String brand, Fuel fuel, double tankCapacity, double maxSpeed) {
		this.cost = cost;
		this.brand = brand;
		this.maxSpeed = maxSpeed;
		this.tankCapacity = tankCapacity;
		setFuel(fuel);
	}

	public Car(Car car) {
		this.type = car.getType();
		this.brand = car.getBrand();
		this.fuel = car.getFuel();
		this.cost = car.getCost();
		this.tankCapacity = car.getTankCapacity();
		this.maxSpeed = car.getMaxSpeed();
	}

	public String getType() {
		return type;
	}

	public String getBrand() {
		return brand;
	}

	public Fuel getFuel() {
		return fuel;
	}

	public int getCost() {
		return cost;
	}

	public double getTankCapacity() {
		return tankCapacity;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setTankCapacity(double capacity) {
		this.tankCapacity = capacity;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		// TODO Автоматически созданная заглушка метода
		return "Car{" + "type=" + type + ",brand=" + brand + ",fuel" + fuel + ",cost=" + cost + ",tankCapacity="
				+ tankCapacity + ",maxSpeed=" + maxSpeed + '}';
	}

	@Override
	public int hashCode() {
		// TODO Автоматически созданная заглушка метода
		final int prime = 17;
		int result = 3;
		result = prime * result + (type == null ? 0 : type.hashCode()) + (brand == null ? 0 : brand.hashCode())
				+ (fuel == null ? 0 : fuel.hashCode()) + cost + (int) tankCapacity + (int) maxSpeed;
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
		Car object = (Car) obj;
		return this.type == object.getType() && this.brand == object.getBrand() && this.fuel.equals(object.getFuel())
				&& this.cost == object.getCost() && this.tankCapacity == object.getTankCapacity()
				&& this.maxSpeed == object.getMaxSpeed();
	}
}
