package com_Epam_Pre_Training.Task5.Model.entity.taxiStation;

import java.util.List;

import com_Epam_Pre_Training.Task5.Model.entity.cars.Car;
import com_Epam_Pre_Training.Task5.container.ArrayList;

public class TaxiStation {
	private final String DEFAULT_NAME_STATION = "Taxi Station";
	private final int DEFAULT_MAX_CAR = 10;
	private List<Car> carsList;
	private String nameStation;
	private int maxCars = DEFAULT_MAX_CAR;
	private ManagerTaxiStation manager;

	public TaxiStation() {
		this.nameStation = DEFAULT_NAME_STATION;
	}

	public TaxiStation(String name) {
		this.nameStation = name;
		carsList = new ArrayList<Car>();
	}

	public List<Car> getCarsList() {
		return carsList;
	}

	public int getAmountCars() {
		return carsList.size();
	}

	public void setName(String name) {
		nameStation = name;
	}

	public String getName() {
		return nameStation;
	}

	public void setMaxCars(int maxQuantity) {
		maxCars = maxQuantity;
	}

	public int getCarsQuantity() {
		return carsList.size();
	}

	public int getMaxCars() {
		return maxCars;
	}

	public void addCar(Car car) {
		carsList.add(car);
	}

	public void setManager(ManagerTaxiStation _manager) {
		this.manager = _manager;
	}
	public ManagerTaxiStation getManager()
	{
		return manager;
	}
}
