package by.epam.online_store.dao;

import java.util.List;

import by.epam.online_store.entity.appliance.Appliance;
import by.epam.online_store.entity.criteria.Criteria;

public interface ApplianceDAO {
	List<Appliance> find(Criteria criteria) throws DAOException;
}
