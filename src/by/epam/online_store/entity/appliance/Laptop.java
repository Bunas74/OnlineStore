package by.epam.online_store.entity.appliance;

import java.io.Serializable;
import java.util.Objects;

public class Laptop extends Appliance implements Serializable {

	private static final long serialVersionUID = 1L;

	private double batteryCapacity;
	private String oS;
	private int memoryRom;
	private int systemMemory;
	private double cPU;
	private int displayInchs;

	public Laptop() {
	}

	public Laptop(String name, double batteryCapacity, String oS, int memoryRom, int systemMemory, double cPU,
			int displayInchs) {
		super(name);
		this.batteryCapacity = batteryCapacity;
		this.oS = oS;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.cPU = cPU;
		this.displayInchs = displayInchs;
	}

	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setOS(String oS) {
		this.oS = oS;
	}

	public String getOS() {
		return oS;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public void setCPU(double cPU) {
		this.cPU = cPU;
	}

	public double getCPU() {
		return cPU;
	}

	public void setDisplayInchs(int displayInchs) {
		this.displayInchs = displayInchs;
	}

	public int getDisplayInchs() {
		return displayInchs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(batteryCapacity, cPU, displayInchs, memoryRom, oS, systemMemory);
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
		Laptop other = (Laptop) obj;
		return Double.doubleToLongBits(batteryCapacity) == Double.doubleToLongBits(other.batteryCapacity)
				&& Double.doubleToLongBits(cPU) == Double.doubleToLongBits(other.cPU)
				&& displayInchs == other.displayInchs && memoryRom == other.memoryRom && Objects.equals(oS, other.oS)
				&& systemMemory == other.systemMemory;
	}

	@Override
	public String toString() {
		return "Laptop [batteryCapacity=" + batteryCapacity + ", oS=" + oS + ", memoryRom=" + memoryRom
				+ ", systemMemory=" + systemMemory + ", cPU=" + cPU + ", displayInchs=" + displayInchs + "]";
	}

}
