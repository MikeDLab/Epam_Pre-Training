package com_Epam_Pre_Training.Task5.Model.entity.fuel;

public class Electricity extends Fuel {
	public Electricity() {
		this.type = "Electricity";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Автоматически созданная заглушка метода
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		// TODO Автоматически созданная заглушка метода
		return super.hashCode();
	}
	@Override
	public String toString() {
		// TODO Автоматически созданная заглушка метода
		return "Electricity{" + "type=" + type + '}';
	}
}
