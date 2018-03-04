package com_Epam_Pre_Training.Task5.controller;

import com_Epam_Pre_Training.Task5.model.entity.taxistation.ManagerTaxiStation;
import com_Epam_Pre_Training.Task5.model.entity.taxistation.TaxiStation;
import com_Epam_Pre_Training.Task5.util.CarGenerator;
import com_Epam_Pre_Training.Task5.view.View;

public class Main {

	public static void main(String[] args) {
		executeTask();

	}

	public static void executeTask() {
		int carsQuantity = 10;
		ManagerTaxiStation manager = new ManagerTaxiStation("Manager");
		TaxiStation station = new TaxiStation("Almaz");
		station.setManager(manager);
		manager.setTaxiStation(station);
		addCars(carsQuantity, manager);
		View.view("Стоимость всех машин: " + manager.countCarsCost());
	}

	public static void addCars(int quantity, ManagerTaxiStation manager) {
		CarGenerator carGenerator = CarGenerator.Generator;
		for (int i = 0; i < quantity; i++) {
			if (i % 2 == 0) {
				manager.addCar(carGenerator.generateCargoCar());
			} else {
				manager.addCar(carGenerator.generatePassengerCar());
			}

		}
	}

}
