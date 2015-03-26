package marcink.barberVisitApp.DAO;

import marcink.barberVisitApp.model.Barberservice;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Marcin on 2015-02-22.
 */
@Repository
public class BarberserviceDAOimpl implements BarberserviceDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Barberservice> listBarberServices() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("SELECT b FROM Barberservice b");
        return query.list();
    }
}
