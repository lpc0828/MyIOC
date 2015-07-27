package com.pengcheng.service;

import com.pengcheng.dao.UserDAO;
import com.pengcheng.model.User;

public class UserService {

	private UserDAO userDao;

	/**
	 * @return the userDao
	 */
	public UserDAO getUserDao() {
		return userDao;
	}

	/**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	public void addUser(User user) {
		userDao.add(user);
	}

}
