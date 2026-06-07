package com.jatin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Games game = new Games();
        game.setId(6);
        game.setNames("MORTAL KOMBAT");
        game.setPrices(5500);

     Configuration cfg = new Configuration();
      cfg.addAnnotatedClass(com.jatin.Games.class);

        cfg.configure("hibernate.cfg.xml");
        System.out.println("CONFIGURATION DONE");

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        System.out.println("SESSION OPENED");

//        Games g = session.find(Games.class,1);  // FOR FETCH

        Transaction transaction = session.beginTransaction();
        session.persist(game);

        // FOR FETCH

//        session.persist(g);
//        System.out.println(g.toString());

        transaction.commit();
        System.out.println("TRANSACTION COMMITED");

        sf.close();
        session.close();
        System.out.println(game.toString());

        System.out.println("SF Close");


    }
}
