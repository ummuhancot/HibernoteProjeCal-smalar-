package FinanceManagementSystem.repository;

import FinanceManagementSystem.config.HibernoteUtils;
import FinanceManagementSystem.domain.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserRepository {

    private Session session;
    public Transaction transaction;

    public void save(User user) {

        try {
            session= HibernoteUtils.getSessionFactory().openSession();
            transaction=session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            HibernoteUtils.closeSession(session);
        }

    }




}
