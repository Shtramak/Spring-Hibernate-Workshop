package com.shtramak.aop.dao;

import com.shtramak.aop.entity.Account;
import org.springframework.stereotype.Component;

@Component
public class MembershipDao {
    public String addMembership(Account account, boolean flag) {
        System.out.println(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
        return "Membership addMembership()";
    }
}
