package marcink.barberVisitApp.service;

import marcink.barberVisitApp.DAO.ClientDAO;
import marcink.barberVisitApp.model.Client;
import marcink.barberVisitApp.model.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Marcin on 2015-02-24.
 */
@Service
@Transactional
public class ClientServiceimpl implements ClientService {

    @Autowired
    private ClientDAO clientDAO;


    @Override
    public List<Client> showClientProfile() {
        return clientDAO.showClientProfile();
    }

    @Override
    public void updateClientProfile(Client client) {
        clientDAO.updateClientProfile(client);
    }

    @Override
    public Client getClient(BigDecimal idClient) {
        return clientDAO.getIdClient(idClient);
    }

}
