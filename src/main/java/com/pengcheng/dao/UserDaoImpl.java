package com.pengcheng.dao;

import com.pengcheng.model.User;


public class UserDaoImpl implements UserDAO {

	public void add(User user) {
		System.out.println(" user saved! ");
	}

	public void delete(User user) {
		System.out.println(" user delete! ");
		
	}

}
