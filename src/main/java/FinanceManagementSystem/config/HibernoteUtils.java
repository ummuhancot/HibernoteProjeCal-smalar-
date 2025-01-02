package FinanceManagementSystem.config;

import FinanceManagementSystem.domain.InCame;
import FinanceManagementSystem.domain.OutCome;
import FinanceManagementSystem.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernoteUtils {

    private static SessionFactory sessionFactory;

    static {

        try {
            Configuration configuration = new Configuration().configure().
                    addAnnotatedClass(User.class).
                    addAnnotatedClass(InCame.class).
                    addAnnotatedClass(OutCome.class);
            sessionFactory= configuration.buildSessionFactory();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutDown(){
        getSessionFactory().close();
    }


    public static void closeSession(Session session){
        if (session != null && session.isOpen()){
            session.close();
        }
    }
}
