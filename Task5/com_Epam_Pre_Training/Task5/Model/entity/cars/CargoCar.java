package com_Epam_Pre_Training.Task5.Model.entity.cars;

import com_Epam_Pre_Training.Task5.Model.entity.fuel.Fuel;

public class CargoCar extends Car {
	double maxCapacity;
	double amountСargo;
	double costOfUse;

	public CargoCar(double _maxCapacity, double _amountCargo, int _cost, double _costOfUse, String _brand, Fuel _fuel,
			double _tankCapacity, double _amountFuel, double _maxSpeed) {
		this.type = "Cargo";
		this.maxCapacity = _maxCapacity;
		this.amountСargo = _amountCargo;
		this.cost = _cost;
		this.brand = _brand;
		this.maxSpeed = _maxSpeed;
		this.tankCapacity = _tankCapacity;
		this.costOfUse = _costOfUse;
		super.setFuel(_fuel);
	}

	public CargoCar() {
		this.type = "Cargo";
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

	public void setCostOfUse(double _costOfUse) {
		this.costOfUse = _costOfUse;
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
