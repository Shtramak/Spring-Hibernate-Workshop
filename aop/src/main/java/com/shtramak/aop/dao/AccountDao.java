package com.shtramak.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {
    public void addAccount(){
        System.out.println(this.getClass()+" Making some stuff with DB\n");
    }
}
