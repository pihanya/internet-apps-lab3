package ru.bepis.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

  private static SessionFactory sessionFactoryObj = buildSessionFactoryObj();

  // Create The SessionFactory Object From Standard (Hibernate.cfg.xml) Configuration File
  @SuppressWarnings("deprecation")
  public static SessionFactory buildSessionFactoryObj() {
    try {
      sessionFactoryObj = new Configuration(new MetadataSources().addResource("hibernate.cfg.xml")).configure().buildSessionFactory();
    } catch (ExceptionInInitializerError exceptionObj) {
      exceptionObj.printStackTrace();
    }

    return sessionFactoryObj;
  }

  public static SessionFactory getSessionFactory() {
    return sessionFactoryObj;
  }
}
