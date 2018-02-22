package com_Epam_Pre_Training.Task5.Model.entity.taxiStation;

import com_Epam_Pre_Training.Task5.Model.entity.cars.Car;

public class ManagerTaxiStation {
	private final String DEFAULT_MANAGER_NAME = "Manager";
	private String name = DEFAULT_MANAGER_NAME;
	private TaxiStation station;

	public ManagerTaxiStation() {
		// TODO Автоматически созданная заглушка конструктора
	}

	public ManagerTaxiStation(String _name) {
		this.setName(_name);
		// TODO Автоматически созданная заглушка конструктора
	}

	public ManagerTaxiStation(String _name, TaxiStation _station) {
		this.setName(_name);
		this.station = _station;
	}

	public ManagerTaxiStation(TaxiStation _station) {
		this.station = _station;
	}

	public int countCarsCost() {
		int result = 0;
		for (int i = 0; i < station.getCarsList().size(); i++) {
			result += station.getCarsList().get(i).getCost();
		}
		return result;
	}

	public void setTaxiStation(TaxiStation _station) {
		this.station = _station;
	}

	public TaxiStation getTaxiStation() {
		return station;
	}

	public void addCar(Car car) {
		station.addCar(car);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
