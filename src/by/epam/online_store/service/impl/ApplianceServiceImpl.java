package by.epam.online_store.service.impl;

import java.util.List;

import by.epam.online_store.dao.ApplianceDAO;
import by.epam.online_store.dao.DAOException;
import by.epam.online_store.dao.DAOFactory;
import by.epam.online_store.entity.appliance.Appliance;
import by.epam.online_store.entity.criteria.Criteria;
import by.epam.online_store.service.ApplianceService;
import by.epam.online_store.service.ServiceException;
import by.epam.online_store.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService {

	public List<Appliance> find(Criteria criteria) throws ServiceException {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		List<Appliance> appliances;

		try {
			appliances = applianceDAO.find(criteria);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}

		return appliances;
	}

}
