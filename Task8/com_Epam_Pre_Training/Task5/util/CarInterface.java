package com_Epam_Pre_Training.Task5.util;

public interface CarInterface {
	// in dollars
	final int MAX_CAR_COST = 5000;
	final int MIN_CAR_COST = 1000;
	final int MAX_COST_PER_KM = 50;
	final int MIN_COST_PER_KM = 10;
	final int MIN_COST_OF_USE = 10;
	final int MAX_COST_OF_USE = 50;
	// in litres
	final double MAX_TANK_CAPACITY = 35.0;
	final double MIN_TANK_CAPACITY = 10.0;
	//in Kg
	final double MAX_CARGO_CAPACITY = 200.0;
	final double MIN_CARGO_CAPACITY = 100.0;
	// in km per hour
	final double MAX_CAR_SPEED = 180.0;
	final double MIN_CAR_SPEED = 0.0;
	final int MIN_PASSENGERS_QUANTITY = 0;
	final int MAX_PASSENGERS_QUANTITY = 4;
}
