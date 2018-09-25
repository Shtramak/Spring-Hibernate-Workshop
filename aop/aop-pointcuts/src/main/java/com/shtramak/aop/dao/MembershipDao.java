package com.shtramak.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDao {

    public boolean addMockMember() {

        System.out.println(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");

        return true;
    }

    public void goToSleep() {

        System.out.println(getClass() + ": I'm going to sleep now...");

    }

}



