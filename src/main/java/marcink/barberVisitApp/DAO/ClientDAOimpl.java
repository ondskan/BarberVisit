package marcink.barberVisitApp.DAO;

import marcink.barberVisitApp.model.*;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Marcin on 2015-02-24.
 */
@Repository
public class ClientDAOimpl implements ClientDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Client> showClientProfile() {

        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("SELECT c FROM Client c");
        return query.list();

    }

    @Override
    public void updateClientProfile(Client client) {
        Session session = sessionFactory.getCurrentSession();
        session.update(client);
    }

    @Override
    public Client getIdClient(BigDecimal idClient) {
        Client client = (Client) sessionFactory.getCurrentSession().get(Client.class, idClient);
        return client;
    }

}
