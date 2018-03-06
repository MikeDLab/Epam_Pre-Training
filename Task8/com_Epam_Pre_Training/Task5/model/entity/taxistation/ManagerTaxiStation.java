package com_Epam_Pre_Training.Task5.model.entity.taxistation;

import java.util.Arrays;

import com_Epam_Pre_Training.Task5.container.ArrayList;
import com_Epam_Pre_Training.Task5.model.entity.cars.Car;
import com_Epam_Pre_Training.Task5.util.Searcher;
import com_Epam_Pre_Training.Task5.util.Sorter;

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
		station.getCarsList().add(car);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Car> sortCarsByCost() {
		Sorter sorter = Sorter.SORTER;
		Car[] cars = Arrays.copyOf(station.getCarsList().toArray(), station.getCarsList().size(), Car[].class);
		ArrayList<Car> sortedCars = new ArrayList<>();
		sorter.bubleSort(cars);
		for (Car car : cars) {
			sortedCars.add(car);
		}
		return sortedCars;
	}

	public int findCar(Car car) {
		Searcher searcher = Searcher.SEARCHER;
		Car[] cars = Arrays.copyOf(station.getCarsList().toArray(), station.getCarsList().size(), Car[].class);
		return searcher.binaryRecursiveSearch(cars, car);
	}
}
