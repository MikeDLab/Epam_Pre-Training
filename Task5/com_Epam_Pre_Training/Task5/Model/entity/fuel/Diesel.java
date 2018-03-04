package com_Epam_Pre_Training.Task5.model.entity.fuel;

public class Diesel extends Fuel {
	public Diesel()
	{
		this.type = "Diesel";
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
		return "Diesel{" + "type=" + type + '}';
	}
}