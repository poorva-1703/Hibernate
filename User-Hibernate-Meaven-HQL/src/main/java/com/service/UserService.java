package com.service;

import com.dao.UserDao;

public class UserService {

	public void InsertData() {

		UserDao ud = new UserDao();
		ud.InsertData();
	}

	public void FetchaData() {
		UserDao ud = new UserDao();
		ud.FetchaData();

	}

	public void UpdataData() {
		UserDao ud = new UserDao();
		ud.UpdataData();
	}

	public void DeleteData() {
		UserDao ud = new UserDao();
		ud.DeleteData();
	}
}