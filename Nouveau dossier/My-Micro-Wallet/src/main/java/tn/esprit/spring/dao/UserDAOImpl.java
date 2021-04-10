package tn.esprit.spring.dao;

import tn.esprit.spring.dao.IUserDAO;

public class UserDAOImpl {
	IUserDAO userDAO;
	public IUserDAO getUserDAO() {
	return userDAO;
	}
	public void setUserDAO(IUserDAO userDAO) {
	this.userDAO = userDAO;
	}
}
