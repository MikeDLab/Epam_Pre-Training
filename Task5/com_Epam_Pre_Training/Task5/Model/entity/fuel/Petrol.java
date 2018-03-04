package com_Epam_Pre_Training.Task5.model.entity.fuel;

public class Petrol extends Fuel {

	public Petrol() {
		this.type = "Petrol";
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
		Petrol object = (Petrol) obj;
		return this.type == object.getType();
	}

	@Override
	public int hashCode() {
		// TODO Автоматически созданная заглушка метода
		return super.hashCode();

	}

	@Override
	public String toString() {
		// TODO Автоматически созданная заглушка метода
		return "Petrol{" + "type=" + type + '}';
	}
}
