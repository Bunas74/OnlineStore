package by.epam.online_store.entity.appliance;

import java.io.Serializable;
import java.util.Objects;

public class TabletPC extends Appliance implements Serializable {

	private static final long serialVersionUID = 1L;

	private int batteryCapacity;
	private int displayInches;
	private int memoryRom;
	private int flashMemoryCapacity;
	private String color;

	public TabletPC() {
	}

	public TabletPC(String name, int batteryCapacity, int displayInches, int memoryRom, int flashMemoryCapacity,
			String color) {
		super(name);
		this.batteryCapacity = batteryCapacity;
		this.displayInches = displayInches;
		this.memoryRom = memoryRom;
		this.flashMemoryCapacity = flashMemoryCapacity;
		this.color = color;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setDisplayInches(int displayInches) {
		this.displayInches = displayInches;
	}

	public int getDisplayInches() {
		return displayInches;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setFlashMemoryCapacity(int flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}

	public int getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(batteryCapacity, color, displayInches, flashMemoryCapacity, memoryRom);
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
		TabletPC other = (TabletPC) obj;
		return batteryCapacity == other.batteryCapacity && Objects.equals(color, other.color)
				&& displayInches == other.displayInches && flashMemoryCapacity == other.flashMemoryCapacity
				&& memoryRom == other.memoryRom;
	}

	@Override
	public String toString() {
		return "TabletPC [batteryCapacity=" + batteryCapacity + ", displayInches=" + displayInches + ", memoryRom="
				+ memoryRom + ", flashMemoryCapacity=" + flashMemoryCapacity + ", color=" + color + "]";
	}

}
