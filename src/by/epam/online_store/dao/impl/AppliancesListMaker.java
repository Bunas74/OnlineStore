package by.epam.online_store.dao.impl;

import java.util.ArrayList;
import java.util.List;

import by.epam.online_store.entity.appliance.Appliance;
import by.epam.online_store.entity.appliance.Laptop;
import by.epam.online_store.entity.appliance.Oven;
import by.epam.online_store.entity.appliance.Refrigerator;
import by.epam.online_store.entity.appliance.Speakers;
import by.epam.online_store.entity.appliance.TabletPC;
import by.epam.online_store.entity.appliance.VacuumCleaner;

public class AppliancesListMaker {

	private List<String> dataAfterMatching;

	public AppliancesListMaker() {

	}

	public AppliancesListMaker(List<String> dataAfterMatching) {
		this.dataAfterMatching = dataAfterMatching;
	}

	public List<Appliance> make() {

		Appliance appliance = null;
		List<Appliance> appliancesResult = new ArrayList<>();

		for (String lineData : dataAfterMatching) {

			String[] array = lineData.split("[\\s,:=]+");

			switch (array[0]) {

			case "Oven":
				appliance = new Oven(array[0], Integer.parseInt(array[2]), Integer.parseInt(array[4]),
						Integer.parseInt(array[6]), Integer.parseInt(array[8]), Double.parseDouble(array[10]),
						Double.parseDouble(array[12]));
				appliancesResult.add(appliance);
				break;
			case "Laptop":
				appliance = new Laptop(array[0], Double.parseDouble(array[2]), array[4], Integer.parseInt(array[6]),
						Integer.parseInt(array[8]), Double.parseDouble(array[10]), Integer.parseInt(array[12]));
				appliancesResult.add(appliance);
				break;
			case "Refrigerator":
				appliance = new Refrigerator(array[0], Integer.parseInt(array[2]), Integer.parseInt(array[4]),
						Integer.parseInt(array[6]), Double.parseDouble(array[8]), Integer.parseInt(array[10]),
						Integer.parseInt(array[12]));
				appliancesResult.add(appliance);
				break;
			case "VacuumCleaner":
				appliance = new VacuumCleaner(array[0], Integer.parseInt(array[2]), array[4], array[6], array[8],
						Integer.parseInt(array[10]), Integer.parseInt(array[12]));
				appliancesResult.add(appliance);
				break;
			case "TabletPC":
				appliance = new TabletPC(array[0], Integer.parseInt(array[2]), Integer.parseInt(array[4]),
						Integer.parseInt(array[6]), Integer.parseInt(array[8]), array[10]);
				appliancesResult.add(appliance);
				break;
			case "Speakers":
				appliance = new Speakers(array[0], Integer.parseInt(array[2]), Integer.parseInt(array[4]),
						Double.parseDouble(array[6]), Integer.parseInt(array[8]));
				appliancesResult.add(appliance);
				break;
			}
		}
		return appliancesResult;
	}
}
