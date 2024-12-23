package com.tpe.hotelManagementSystem.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

    private static final SessionFactory sessionFactory;

    static {
        try {
            Configuration configuration = new Configuration().
                    configure("hibernate.cfg.xml");
            // addAnnotatedClass(Hotel.class).
            // addAnnotatedClass(Room.class).
            // addAnnotatedClass(Reservation.class).
            // addAnnotatedClass(Guest.class); xml dosyamızda yaptık yapmamıza gerek yok.
            sessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initialization of session factory is FAILED!! " + ex);
            throw new ExceptionInInitializerError(ex); // Javanın kendi exception'ı yazmasakta olurdu.
        }
    }

    // getSessionFactory methodu
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    // sessionFactory shutDown
    public static void shutDown() {
        getSessionFactory().close();
    }

    // sessionClose
    public static void closeSession(Session session) {
        if (session != null && session.isOpen()) {
            session.close();
        }
    }

}
