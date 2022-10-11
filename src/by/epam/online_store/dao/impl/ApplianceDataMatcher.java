package by.epam.online_store.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import by.epam.online_store.entity.criteria.Criteria;

public class ApplianceDataMatcher {

	private List<String> dataFromSource;
	private Criteria criteria;

	public ApplianceDataMatcher() {

	}

	public ApplianceDataMatcher(List<String> dataFromSource, Criteria criteria) {
		this.dataFromSource = dataFromSource;
		this.criteria = criteria;
	}

	public List<String> match() {

		List<String> dataAfterMatching = new ArrayList<>();
		List<String> searchPatterns = formFindPattern();

		for (String data : dataFromSource) {
			if (checkToPatters(data, searchPatterns)) {
				dataAfterMatching.add(data);
			}
		}
		return dataAfterMatching;
	}

	private List<String> formFindPattern() {

		List<String> searchPatterns = new ArrayList<>();
		Map<String, Object> formCriteria = criteria.getCriteria();

		Set<String> keys = formCriteria.keySet();

		for (String key : keys) {

			String pattern = key + "=" + formCriteria.get(key);
			searchPatterns.add(pattern);
		}
		return searchPatterns;
	}

	private boolean checkToPatters(String data, List<String> searchPatterns) {

		for (String pattern : searchPatterns) {
			if (!data.contains(pattern)) {
				return false;
			}
		}
		return true;
	}
}
