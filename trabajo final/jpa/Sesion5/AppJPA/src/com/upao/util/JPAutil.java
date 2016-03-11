package com.upao.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Upao
 */
public class JPAutil {

    private static EntityManagerFactory factory;

    static {
        factory = Persistence.createEntityManagerFactory("AppJPATRABAJO");
    }

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

    public static void close() {
        factory.close();
    }
}
