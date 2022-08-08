package com.abc.service;

import java.util.Scanner;

import com.abc.DAO.DBCON;
import com.abc.model.Student;

public class Delete {
		
	public static void delete() throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll no to delete user");
		int roll=sc.nextInt();
		Student st=new Student();
		st.setRoll(roll);
		DB db=new DB();
		db.dele(st.getRoll());
		
	}
	
}
