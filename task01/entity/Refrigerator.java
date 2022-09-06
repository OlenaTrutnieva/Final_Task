package by.tc.task01.entity;

import java.util.Objects;

public class Refrigerator extends Appliance {
	private int powerConsumption;
	private int weight;
	private double freezerCapacity;
	private double capacity;
	private double height;
	private double width;

	public Refrigerator() {
		super();
	}

	public Refrigerator(String applianceName, double price, int quantity, int powerConsumption, int weight,
			double freezerCapacity, double capacity, double height, double width) {
		super(applianceName, price, quantity);
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.freezerCapacity = freezerCapacity;
		this.capacity = capacity;
		this.height = height;
		this.width = width;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(double freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(capacity, freezerCapacity, height, powerConsumption, weight, width);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Refrigerator other = (Refrigerator) obj;
		return Double.doubleToLongBits(capacity) == Double.doubleToLongBits(other.capacity)
				&& Double.doubleToLongBits(freezerCapacity) == Double.doubleToLongBits(other.freezerCapacity)
				&& Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& powerConsumption == other.powerConsumption && weight == other.weight
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}

	@Override
	public String toString() {
		return "Refrigerator [powerConsumption=" + powerConsumption + ", weight=" + weight + ", freezerCapacity="
				+ freezerCapacity + ", capacity=" + capacity + ", height=" + height + ", width=" + width + "]";
	}
	
}
