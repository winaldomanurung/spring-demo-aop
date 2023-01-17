package com.winaldo.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.winaldo.aopdemo.dao.AccountDAO;
import com.winaldo.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the account bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		// get the membership bean from spring container
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		// call the business method
		theAccountDAO.addAccount();
		
		// call the membership business method
		theMembershipDAO.addAccount();
		
		// close the context
		context.close();
	}

}
