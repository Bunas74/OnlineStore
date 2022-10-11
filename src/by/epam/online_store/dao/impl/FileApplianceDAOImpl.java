package by.epam.online_store.dao.impl;

import java.util.List;

import by.epam.online_store.dao.ApplianceDAO;
import by.epam.online_store.entity.appliance.Appliance;
import by.epam.online_store.entity.criteria.Criteria;

public class FileApplianceDAOImpl implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) {

		List<Appliance> appliancesResult;

		final String sourcePath = "src/resources/appliances_db.txt";
		ApplianceReader applianceReader = new ApplianceReader(sourcePath);

		List<String> dataFromSource = null;

		if (criteria.getGroupSearchName() != null) {
			try {
				dataFromSource = applianceReader.take(criteria.getGroupSearchName());
			} catch (java.io.IOException e) {
			}
		} else {
			try {
				dataFromSource = applianceReader.take();
			} catch (java.io.IOException e) {
			}
		}

		ApplianceDataMatcher matcher = new ApplianceDataMatcher(dataFromSource, criteria);
		List<String> dataAfterMatching = matcher.match();

		AppliancesListMaker maker = new AppliancesListMaker(dataAfterMatching);
		appliancesResult = maker.make();

		return appliancesResult;
	}

}
