package com_Epam_Pre_Training.Task5.model.entity.cars;

import com_Epam_Pre_Training.Task5.model.entity.fuel.Fuel;

public class CargoCar extends Car {
	protected double maxCapacity;
	protected double amountСargo;
	protected double costOfUse;

	public CargoCar() {
		this.type = "Cargo";
	}

	public CargoCar(double maxCapacity, double amountCargo, int cost, double costOfUse, String brand,Fuel fuel,
			double tankCapacity, double amountFuel, double maxSpeed) {
		super(cost, brand, fuel, tankCapacity, maxSpeed);
		this.type = "Cargo";
		this.maxCapacity = maxCapacity;
		this.amountСargo = amountCargo;
		this.costOfUse = costOfUse;
	}

	public CargoCar(CargoCar car) {
		super(car);
		this.maxCapacity = car.getMaxCapacity();
		this.amountСargo = car.getAmountСargo();
		this.costOfUse = car.getCostOfUse();
	}

	public double getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(double maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public double getCostOfUse() {
		return costOfUse;
	}

	public void setCostOfUse(double costOfUse) {
		this.costOfUse = costOfUse;
	}

	public double getAmountСargo() {
		return amountСargo;
	}

	public void setAmountСargo(double amountСargo) {
		this.amountСargo = amountСargo;
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
		CargoCar object = (CargoCar) obj;
		return super.equals(object) && this.getMaxCapacity() == object.getMaxCapacity()
				&& this.getAmountСargo() == object.getAmountСargo() && this.getCostOfUse() == object.getCostOfUse();
	}

	@Override
	public int hashCode() {
		// TODO Автоматически созданная заглушка метода
		int result = 3;
		result = super.hashCode() + (int) maxCapacity + (int) amountСargo + (int) costOfUse;
		return result;
	}

	@Override
	public String toString() {
		// TODO Автоматически созданная заглушка метода
		return "CargoCar{" + "type=" + type + ",brand=" + brand + ",fuel" + fuel + ",cost=" + cost + ",tankCapacity="
				+ tankCapacity + ",maxSpeed=" + maxSpeed + ",maxCapacity=" + maxCapacity + ",amountCargo=" + amountСargo
				+ ",costOfUse=" + costOfUse + '}';
	}
}
