package com.shtramak.aop;

import com.shtramak.aop.config.AopAppConfig;
import com.shtramak.aop.dao.AccountDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppRunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopAppConfig.class);
        AccountDao accountDao = context.getBean(AccountDao.class);
        accountDao.addAccount();
        context.close();
    }
}
