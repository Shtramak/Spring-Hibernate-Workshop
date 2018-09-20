package com.shtramak.aop;

import com.shtramak.aop.config.AopAppConfig;
import com.shtramak.aop.dao.AccountDao;
import com.shtramak.aop.dao.MembershipDao;
import com.shtramak.aop.entity.Account;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppRunner {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopAppConfig.class)) {
            AccountDao accountDao = context.getBean(AccountDao.class);
            accountDao.addAccount(new Account());
            MembershipDao membershipDao = context.getBean("membershipDao",MembershipDao.class);
            membershipDao.addAccount();
        }
    }
}
