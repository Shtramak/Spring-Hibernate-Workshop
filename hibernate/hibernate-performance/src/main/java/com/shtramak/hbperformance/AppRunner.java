package com.shtramak.hbperformance;

import javax.persistence.EntityManager;

import com.shtramak.hbperformance.entity.Account;
import com.shtramak.hbperformance.entity.Client;

public class AppRunner {
    public static void main(String[] args){

        EntityManager entityManager = EntityManagerUtil.getEntityManager();

        Client client = new Client();
        client.setName("Vasya Pupkin");
        client.setAge(21);

        Account account = new Account();
        account.setAmount(1000);
        account.setClient(client);

        entityManager.getTransaction().begin();
        entityManager.persist(client);
        entityManager.persist(account);
        entityManager.getTransaction().commit();

        entityManager.close();
    }
}
