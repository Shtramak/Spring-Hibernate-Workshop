package com.shtramak.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDao {
	public String addAccount() {
		System.out.println(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
		return "Membership addAccount()";
	}
}
