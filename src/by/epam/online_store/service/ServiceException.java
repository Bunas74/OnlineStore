package by.epam.online_store.service;

import java.io.Serializable;

public class ServiceException extends Exception implements Serializable {

	private static final long serialVersionUID = 1L;

	public ServiceException(Exception e) {
		super(e);
	}

}
