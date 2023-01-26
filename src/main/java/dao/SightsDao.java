package dao;

import attraction.Cities;
import attraction.Sight;
import liquibase.pro.packaged.S;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;
import java.util.List;

public class SightsDao {

    public Sight findById(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Sight sight = session.get(Sight.class, id);
        session.close();
        return sight;
    }

    public void save(Sight sight) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(sight);
        tx1.commit();
        session.close();
    }


    public void update(Sight sight) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(sight);
        tx1.commit();
        session.close();
    }

    public void delete(Sight sight) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(sight);
        tx1.commit();
        session.close();
    }

    public Sight findSightById(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Sight sight = session.get(Sight.class, id);
        session.close();
        return sight;
    }

    public List<Sight> findAll() {
        List<Sight> sights = (List<Sight>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Sight ").list();
        return sights;
    }
}
