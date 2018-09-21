package com.shtramak.hbperformance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {

    private static EntityManager entityManager;

    private EntityManagerUtil() {
    }

    public static EntityManager getEntityManager() {
        if (entityManager==null){
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu-manager");
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }
}
