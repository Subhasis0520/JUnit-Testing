package com.org.service;

import com.org.dao.UserDao;

public class UserService {

	private UserDao dao;
	
	public UserService(UserDao dao) {
		this.dao = dao;
	}

	public String getName(int id) {
		String findNameById = dao.findNameById(id);
		return findNameById;
	}
	public String getPassword(int id) {
		String password = dao.findPasswordById(id);
		return password;
	}
}
