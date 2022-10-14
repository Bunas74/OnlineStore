package by.epam.online_store.dao.impl;

import java.io.IOException;
import java.util.List;

import by.epam.online_store.dao.ApplianceDAO;
import by.epam.online_store.dao.DAOException;
import by.epam.online_store.entity.appliance.Appliance;
import by.epam.online_store.entity.criteria.Criteria;

public class FileApplianceDAOImpl implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) throws DAOException {

		List<Appliance> appliancesResult;

		final String sourcePath = "src/resources/appliances_db.txt";
		ApplianceReader applianceReader = new ApplianceReader(sourcePath);

		List<String> dataFromSource = null;

		if (criteria.getGroupSearchName() != null) {
			try {
				dataFromSource = applianceReader.take(criteria.getGroupSearchName());
			} catch (IOException e) {
				throw new DAOException(e);
			}
		} else {
			try {
				dataFromSource = applianceReader.take();
			} catch (IOException e) {
				throw new DAOException(e);
			}
		}

		ApplianceDataMatcher matcher = new ApplianceDataMatcher(dataFromSource, criteria);
		List<String> dataAfterMatching = matcher.match();

		AppliancesListMaker maker = new AppliancesListMaker(dataAfterMatching);
		appliancesResult = maker.make();

		return appliancesResult;
	}

}
