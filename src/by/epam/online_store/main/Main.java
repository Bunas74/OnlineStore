package by.epam.online_store.main;

import java.util.List;

import by.epam.online_store.entity.appliance.Appliance;
import by.epam.online_store.entity.appliance.Oven;
import by.epam.online_store.entity.appliance.TabletPC;
import by.epam.online_store.entity.criteria.Criteria;
import by.epam.online_store.entity.criteria.SearchCriteria.OvenFunction;
import by.epam.online_store.entity.criteria.SearchCriteria.TabletPCFunction;
import by.epam.online_store.service.ApplianceService;
import by.epam.online_store.service.ServiceException;
import by.epam.online_store.service.ServiceFactory;

public class Main {
	public static void main(String[] args) throws ServiceException {

		List<Appliance> appliances;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());// "Oven"
		criteriaOven.add(OvenFunction.CAPACITY.toString(), 32);

		appliances = service.find(criteriaOven);

		PrintApplianceInfo.print("\nSearch result by product name and one parameter:", appliances);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven1 = new Criteria(Oven.class.getSimpleName());
		criteriaOven1.add(OvenFunction.HEIGHT.toString(), 40);
		criteriaOven1.add(OvenFunction.DEPTH.toString(), 60);

		appliances = service.find(criteriaOven1);

		PrintApplianceInfo.print("\nSearch result by product name and two parameters:", appliances);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPCFunction.COLOR.toString(), "blue");
		criteriaTabletPC.add(TabletPCFunction.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPCFunction.MEMORY_ROM.toString(), 8000);

		appliances = service.find(criteriaTabletPC);

		PrintApplianceInfo.print("\nSearch result by product name and three parameters:", appliances);

		//////////////////////////////////////////////////////////////////

		Criteria criteria = new Criteria();
		criteria.add("OVERALL_CAPACITY", 350.5);
		criteriaTabletPC.add("FREEZER_CAPACITY", 20);
		criteriaTabletPC.add("POWER_CONSUMPTION", 150);

		appliances = service.find(criteria);

		PrintApplianceInfo.print("\nThe result of a product search for only three parameters:", appliances);

	}

}
