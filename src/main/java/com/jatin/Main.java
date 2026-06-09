package com.jatin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        // 1. Create the object to save
        Games game = new Games();
        game.setId(4);
        game.setNames("MORTAL KOMBAT");
        game.setPrices(5500);

        // 2. Setup Hibernate Config
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.jatin.Games.class); // link the entity class
        cfg.configure("hibernate.cfg.xml");           // load DB credentials
        System.out.println("CONFIGURATION DONE");

        // 3. Create SessionFactory (Heavy, create only once)
        SessionFactory sf = cfg.buildSessionFactory();

        // 4. Open Session (Lightweight, use for current DB work)
        Session session = sf.openSession();
        System.out.println("SESSION OPENED");


        /*
        // FETCH (Read)
        Games g = session.find(Games.class, 1);

        // REMOVE (Delete)
        Games g1 = session.find(Games.class, 6);
        session.remove(g1);

        // MERGE (Update)
        session.merge(game);
        */

        // 5. Begin Transaction (Mandatory for insert/update/delete)
        Transaction transaction = session.beginTransaction();

        // 6. Save to DB
        session.persist(game);

        // 7. Push changes
        transaction.commit();
        System.out.println("TRANSACTION COMMITED");

        // 8. Close resources to prevent leaks
        sf.close();
        session.close();

        System.out.println(game.toString());
        System.out.println("SF Close");
    }
}