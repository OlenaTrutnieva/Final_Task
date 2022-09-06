package by.tc.task01.entity;

import java.util.Objects;

public class Oven extends Appliance {
	private int powerConsumption;
	private double depth;
	private int weight;
	private double capacity;
	private double height;
	private double width;

	public Oven() {
		super();
	}

	public Oven(String applianceName, double price, int quantity, int powerConsumption, int weight, double capacity, double height, double width, double depth) {
		super(applianceName, price, quantity);
		this.depth = depth;
		this.weight = weight;
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

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
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
		result = prime * result + Objects.hash(capacity, depth, height, weight, width);
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
		Oven other = (Oven) obj;
		return Double.doubleToLongBits(capacity) == Double.doubleToLongBits(other.capacity)
				&& Double.doubleToLongBits(depth) == Double.doubleToLongBits(other.depth)
				&& Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height) && weight == other.weight
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}

	@Override
	public String toString() {
		return "Oven [depth=" + depth + ", weight=" + weight + ", capacity=" + capacity + ", height=" + height
				+ ", width=" + width + "]";
	}
	
}
