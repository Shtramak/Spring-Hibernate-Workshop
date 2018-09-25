package com.shtramak.aop.dao;

import com.shtramak.aop.entity.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDao {
    public void addAccount(Account account){
        System.out.println(this.getClass()+" Making some stuff with DB\n");
    }
}
