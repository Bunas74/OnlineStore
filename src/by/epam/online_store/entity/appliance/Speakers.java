package by.epam.online_store.entity.appliance;

import java.io.Serializable;
import java.util.Objects;

public class Speakers extends Appliance implements Serializable {

	private static final long serialVersionUID = 1L;

	private int powerConsumption;
	private int numberOfSpeakers;
	private double frequencyRange;
	private int cordLength;

	public Speakers() {
	}

	public Speakers(String name, int powerConsumption, int numberOfSpeakers, double frequencyRange, int cordLength) {
		super(name);
		this.powerConsumption = powerConsumption;
		this.numberOfSpeakers = numberOfSpeakers;
		this.frequencyRange = frequencyRange;
		this.cordLength = cordLength;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setNumberOfSpeakers(int numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public void setFrequencyRange(double frequencyRange) {
		this.frequencyRange = frequencyRange;
	}

	public double getFrequencyRange() {
		return frequencyRange;
	}

	public void setCordLength(int cordLength) {
		this.cordLength = cordLength;
	}

	public int getCordLength() {
		return cordLength;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cordLength, frequencyRange, numberOfSpeakers, powerConsumption);
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
		Speakers other = (Speakers) obj;
		return cordLength == other.cordLength
				&& Double.doubleToLongBits(frequencyRange) == Double.doubleToLongBits(other.frequencyRange)
				&& numberOfSpeakers == other.numberOfSpeakers && powerConsumption == other.powerConsumption;
	}

	@Override
	public String toString() {
		return "Speakers [powerConsumption=" + powerConsumption + ", numberOfSpeakers=" + numberOfSpeakers
				+ ", frequencyRange=" + frequencyRange + ", cordLength=" + cordLength + "]";
	}

}
