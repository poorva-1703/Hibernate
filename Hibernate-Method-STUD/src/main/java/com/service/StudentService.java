package com.service;

import com.dao.StudentDao;

public class StudentService {

	public void InsertData() {
		StudentDao sd = new StudentDao();
		sd.Inserdata();
	}

	public void FetchData() {
		StudentDao sd = new StudentDao();
		sd.FetchData();
	}

	public void DeleteData() {
		StudentDao sd = new StudentDao();
		sd.DeleteData();
	}

	public void UpdateData() {
		StudentDao sd = new StudentDao();
		sd.UpdateData();
	}

}
