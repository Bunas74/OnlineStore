package by.epam.online_store.main;

import java.util.List;

import by.epam.online_store.entity.appliance.Appliance;
import by.epam.online_store.entity.appliance.Laptop;
import by.epam.online_store.entity.appliance.Oven;
import by.epam.online_store.entity.appliance.Refrigerator;
import by.epam.online_store.entity.appliance.Speakers;
import by.epam.online_store.entity.appliance.TabletPC;
import by.epam.online_store.entity.appliance.VacuumCleaner;

public class PrintApplianceInfo {

	public static void print(String title, List<Appliance> appliance) {

		System.out.println(title);
		System.out.println(
				"----------------------------------------------------------------------------------------------------------");

		for (Appliance element : appliance) {

			switch (element.getName()) {

			case "Oven":
				System.out.printf("|%-13s|%-18s|%-15s|%-17s|%-22s|%-7s|%-6s|\n", "NAME", "POWER_CONSUMPTION", "WEIGHT",
						"CAPACITY", "DEPTH", "HEIGHT", "WIDTH");
				System.out.println(
						"----------------------------------------------------------------------------------------------------------");
				System.out.printf("|%-13s|%-18s|%-15s|%-17s|%-22s|%-7s|%-6s|\n", ((Oven) element).getName(),
						((Oven) element).getPowerConsumption(), ((Oven) element).getWeight(),
						((Oven) element).getCapacity(), ((Oven) element).getDepth(), ((Oven) element).getHeight(),
						((Oven) element).getWidth());
				System.out.println(
						"----------------------------------------------------------------------------------------------------------");
				break;
			case "Laptop":
				System.out.printf("|%-13s|%-18s|%-15s|%-17s|%-22s|%-7s|%-6s|\n", "NAME", "BATTERY_CAPACITY", "OS",
						"MEMORY_ROM", "SYSTEM_MEMORY", "CPU", "DISPLAY_INCHS");
				System.out.println(
						"----------------------------------------------------------------------------------------------------------");
				System.out.printf("|%-13s|%-18s|%-15s|%-17s|%-22s|%-7s|%-6s|\n", ((Laptop) element).getName(),
						((Laptop) element).getBatteryCapacity(), ((Laptop) element).getOS(),
						((Laptop) element).getMemoryRom(), ((Laptop) element).getSystemMemory(),
						((Laptop) element).getCPU(), ((Laptop) element).getDisplayInchs());
				System.out.println(
						"----------------------------------------------------------------------------------------------------------");
				break;
			case "Refrigerator":
				System.out.printf("|%-13s|%-18s|%-15s|%-17s|%-22s|%-7s|%-6s|\n", "NAME", "POWER_CONSUMPTION", "WEIGHT",
						"FREEZER_CAPACITY", "OVERALL_CAPACITY", "HEIGHT", "WIDTH");
				System.out.println(
						"----------------------------------------------------------------------------------------------------------");
				System.out.printf("|%-13s|%-18s|%-15s|%-17s|%-22s|%-7s|%-6s|\n", ((Refrigerator) element).getName(),
						((Refrigerator) element).getPowerConsumption(), ((Refrigerator) element).getWeight(),
						((Refrigerator) element).getFreezerCapacity(), ((Refrigerator) element).getOverallCapacity(),
						((Refrigerator) element).getHeight(), ((Refrigerator) element).getWidth());
				System.out.println(
						"----------------------------------------------------------------------------------------------------------");
				break;
			case "VacuumCleaner":
				System.out.printf("|%-13s|%-18s|%-15s|%-17s|%-22s|%-7s|%-6s|\n", "NAME", "POWER_CONSUMPTION",
						"FILTER_TYPE", "BAG_TYPE", "WAND_TYPE", "MOTOR_SPEED_REGULATION", "CLEANING_WIDTH");
				System.out.println(
						"----------------------------------------------------------------------------------------------------------");
				System.out.printf("|%-13s|%-18s|%-15s|%-17s|%-22s|%-7s|%-6s|\n", ((VacuumCleaner) element).getName(),
						((VacuumCleaner) element).getPowerConsumption(), ((VacuumCleaner) element).getFilterType(),
						((VacuumCleaner) element).getBagType(), ((VacuumCleaner) element).getWandType(),
						((VacuumCleaner) element).getMotorSpeedRegulation(),
						((VacuumCleaner) element).getCleaningWidth());
				System.out.println(
						"----------------------------------------------------------------------------------------------------------");
				break;
			case "TabletPC":
				System.out.printf("|%-13s|%-18s|%-15s|%-17s|%-22s|%-7s|%-6s|\n", "NAME", "BATTERY_CAPACITY",
						"DISPLAY_INCHES", "MEMORY_ROM", "FLASH_MEMORY_CAPACITY", "COLOR", " -- ");
				System.out.println(
						"----------------------------------------------------------------------------------------------------------");
				System.out.printf("|%-13s|%-18s|%-15s|%-17s|%-22s|%-7s|%-6s|\n", ((TabletPC) element).getName(),
						((TabletPC) element).getBatteryCapacity(), ((TabletPC) element).getDisplayInches(),
						((TabletPC) element).getMemoryRom(), ((TabletPC) element).getFlashMemoryCapacity(),
						((TabletPC) element).getColor(), " -- ");
				System.out.println(
						"----------------------------------------------------------------------------------------------------------");
				break;
			case "Speakers":
				System.out.printf("|%-13s|%-18s|%-15s|%-17s|%-22s|%-7s|%-6s|\n", "NAME", "POWER_CONSUMPTION",
						"NUMBER_OF_SPEAKERS", "FREQUENCY_RANGE", "CORD_LENGTH", " -- ", " -- ");
				System.out.println(
						"----------------------------------------------------------------------------------------------------------");
				System.out.printf("|%-13s|%-18s|%-15s|%-17s|%-22s|%-7s|%-6s|\n", ((Speakers) element).getName(),
						((Speakers) element).getPowerConsumption(), ((Speakers) element).getNumberOfSpeakers(),
						((Speakers) element).getFrequencyRange(), ((Speakers) element).getCordLength(), " -- ", " -- ");
				System.out.println(
						"----------------------------------------------------------------------------------------------------------");
				break;
			}
		}
	}
}
