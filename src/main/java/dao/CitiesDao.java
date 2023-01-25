package dao;

import attraction.Cities;
import attraction.Sight;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;
import java.util.List;

public class CitiesDao {

    public Cities findById(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Cities cities = session.get(Cities.class, id);
        session.close();
        return cities;
    }

    public void save(Cities cities) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(cities);
        tx1.commit();
        session.close();
    }

    public void update(Cities cities) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(cities);
        tx1.commit();
        session.close();
    }

    public void delete(Cities cities) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(cities);
        tx1.commit();
        session.close();
    }

    public Sight findSightById(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Sight sight = session.get(Sight.class, id);
        session.close();
        return sight;
    }

    public List<Cities> findAll() {
        List<Cities> cities = (List<Cities>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Cities ").list();
        return cities;
    }
}