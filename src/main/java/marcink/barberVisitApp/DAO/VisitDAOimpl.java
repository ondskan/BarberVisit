package marcink.barberVisitApp.DAO;

import marcink.barberVisitApp.model.Barberservice;
import marcink.barberVisitApp.model.Visit;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Marcin on 2015-03-18.
 */

@Repository
public class VisitDAOimpl implements VisitDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Visit> listClientVisits() {

        Session session = sessionFactory.getCurrentSession();
            Query query = session.createSQLQuery("SELECT BarberService.name,\n" +
                    "  BarberService.duration,\n" +
                    "  BarberService.price,\n" +
                    "  VISIT.term\n" +
                    "FROM BarberService\n" +
                    "INNER JOIN VISIT\n" +
                    "ON BarberService.ID_SERVICE = VISIT.BARBERSERVICE_ID_SERVICE");
            return query.list();

        }


   /* @Override
    public List<Barberservice> newVisitListServices() {

        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("SELECT b FROM Barberservice b");
        return query.list();
    }*/





}
