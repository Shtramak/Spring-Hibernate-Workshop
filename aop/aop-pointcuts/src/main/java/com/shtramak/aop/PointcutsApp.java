package com.shtramak.aop;

import com.shtramak.aop.config.AopAppConfig;
import com.shtramak.aop.dao.AccountDao;
import com.shtramak.aop.dao.MembershipDao;
import com.shtramak.aop.entity.Account;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PointcutsApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopAppConfig.class);

        AccountDao theAccountDAO = context.getBean(AccountDao.class);

        MembershipDao theMembershipDAO = context.getBean(MembershipDao.class);

        Account myAccount = new Account();
        theAccountDAO.addAccount(myAccount, true);
        theAccountDAO.doWork();

        theAccountDAO.setName("foobar");
        theAccountDAO.setServiceCode("silver");

        String name = theAccountDAO.getName();
        String code = theAccountDAO.getServiceCode();

        theMembershipDAO.addMockMember();
        theMembershipDAO.goToSleep();

        context.close();
    }

}










