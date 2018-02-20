package com_Epam_Pre_Training.Task5.controller;

import com_Epam_Pre_Training.Task5.Model.actions.CarGenerator;
import com_Epam_Pre_Training.Task5.Model.container.ImpossibleArraySize;
import com_Epam_Pre_Training.Task5.Model.entity.taxiStation.ManagerTaxiStation;
import com_Epam_Pre_Training.Task5.Model.entity.taxiStation.TaxiStation;
import com_Epam_Pre_Training.Task5.view.View;

public class Main {

	public static void main(String[] args) throws ImpossibleArraySize {
		executeTask();
		
	}
	public static void executeTask()
	{
		int carsQuantity = 10;
		ManagerTaxiStation manager = new ManagerTaxiStation("Manager");
		TaxiStation station = new TaxiStation("Almaz");
		station.setManager(manager);
		manager.setTaxiStation(station);
		addCars(carsQuantity, manager);
		View.view("Стоимость всех машин: "+ manager.countCarsCost());
	}
	public static void addCars(int quantity,ManagerTaxiStation manager)
	{
		for(int i=0;i<quantity;i++)
		{
			if(i % 2 ==0)
			{
				manager.addCar(CarGenerator.generateCargoCar());
			}
			else
			{
				manager.addCar(CarGenerator.generatePassengerCar());
			}

		}
	}
	
}
