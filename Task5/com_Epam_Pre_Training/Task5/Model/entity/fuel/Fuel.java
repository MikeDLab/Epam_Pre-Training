package com_Epam_Pre_Training.Task5.Model.entity.fuel;

public abstract class Fuel {
	protected String type;

	public Fuel getFuel() {
		return this;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		// TODO Автоматически созданная заглушка метода
		return "Fuel{" + "type=" + type + '}';
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		Fuel object = (Fuel) obj;
		return this.type == object.getType();
	}

	@Override
	public int hashCode() {
		// TODO Автоматически созданная заглушка метода
		final int prime = 31;
		int result = 1;
		result = prime * result + (type == null ? 0 : type.hashCode());
		return result;
	}
}
