package marcink.barberVisitApp.service;

import marcink.barberVisitApp.model.Client;
import marcink.barberVisitApp.model.Visit;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Marcin on 2015-02-24.
 */
public interface ClientService {

    public List<Client> showClientProfile();

    public void updateClientProfile(Client client);

    Client getClient(BigDecimal idClient);
}
