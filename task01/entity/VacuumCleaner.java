package by.tc.task01.entity;

import java.util.Objects;

public class VacuumCleaner extends Appliance{
	private int powerConsumption;
	private String filterType;
	private String bagType;
	private String wandType;
	private int motorSpeedRegulation;
	private double cleaningWidth;
	
	
	public VacuumCleaner() {
		super();
	}
	
	public VacuumCleaner(String applianceName, double price, int quantity, int powerConsumption, String filterType, String bagType, String wandType, int motorSpeedRegulation, double cleaningWidth) {
		super(applianceName, price, quantity);
		this.powerConsumption = powerConsumption;
		this.filterType = filterType;
		this.bagType = bagType;
		this.wandType = wandType;
		this.motorSpeedRegulation = motorSpeedRegulation;
		this.cleaningWidth = cleaningWidth;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public String getBagType() {
		return bagType;
	}

	public void setBagType(String bagType) {
		this.bagType = bagType;
	}

	public String getWandType() {
		return wandType;
	}

	public void setWandType(String wandType) {
		this.wandType = wandType;
	}

	public int getMotorSpeedRegulation() {
		return motorSpeedRegulation;
	}

	public void setMotorSpeedRegulation(int motorSpeedRegulation) {
		this.motorSpeedRegulation = motorSpeedRegulation;
	}

	public double getCleaningWidth() {
		return cleaningWidth;
	}

	public void setCleaningWidth(double cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(bagType, cleaningWidth, filterType, motorSpeedRegulation, powerConsumption, wandType);
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
		VacuumCleaner other = (VacuumCleaner) obj;
		return Objects.equals(bagType, other.bagType)
				&& Double.doubleToLongBits(cleaningWidth) == Double.doubleToLongBits(other.cleaningWidth)
				&& Objects.equals(filterType, other.filterType) && motorSpeedRegulation == other.motorSpeedRegulation
				&& powerConsumption == other.powerConsumption && Objects.equals(wandType, other.wandType);
	}

	@Override
	public String toString() {
		return "VacuumCleaner [powerConsumption=" + powerConsumption + ", filterType=" + filterType + ", bagType="
				+ bagType + ", wandType=" + wandType + ", motorSpeedRegulation=" + motorSpeedRegulation
				+ ", cleaningWidth=" + cleaningWidth + "]";
	}
	
}
