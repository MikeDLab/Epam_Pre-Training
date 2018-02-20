package com_Epam_Pre_Training.Task5.Model.entity.cars;

import com_Epam_Pre_Training.Task5.Model.entity.fuel.Diesel;
import com_Epam_Pre_Training.Task5.Model.entity.fuel.Electricity;
import com_Epam_Pre_Training.Task5.Model.entity.fuel.Fuel;
import com_Epam_Pre_Training.Task5.Model.entity.fuel.Petrol;

public abstract class Car {
	String type;
	String brand;
	Fuel fuel;
	int cost;
	double tankCapacity;
	double maxSpeed;

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

	public void setType(String _type) {
		type = _type;
	}

	public void setBrand(String _brand) {
		brand = _brand;
	}

	public void setFuel(String _fuel) {
		switch (_fuel) {
		case "Petrol":
			fuel = new Petrol();
			break;
		case "Diesel":
			fuel = new Diesel();
			break;
		case "Electricity":
			fuel = new Electricity();
			break;
		default:
			fuel = new Petrol();
		}
	}

	public void setFuel(Fuel _fuel) {
		switch (_fuel.getType()) {
		case "Petrol":
			fuel = new Petrol();
			break;
		case "Diesel":
			fuel = new Diesel();
			break;
		case "Electricity":
			fuel = new Electricity();
			break;
		default:
			fuel = new Petrol();
		}
	}

	public void setCost(int _cost) {
		cost = _cost;
	}

	public void setTankCapacity(double _capacity) {
		tankCapacity = _capacity;
	}

	public void setMaxSpeed(double _maxSpeed) {
		maxSpeed = _maxSpeed;
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
