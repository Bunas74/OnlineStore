package by.epam.online_store.service;

import java.util.List;

import by.epam.online_store.entity.appliance.Appliance;
import by.epam.online_store.entity.criteria.Criteria;

public interface ApplianceService {

	List<Appliance> find(Criteria criteria) throws ServiceException;

}
