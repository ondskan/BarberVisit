package marcink.barberVisitApp.service;

import marcink.barberVisitApp.DAO.BarberserviceDAO;
import marcink.barberVisitApp.model.Barberservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Marcin on 2015-02-22.
 */
@Service
@Transactional
public class BarberserviceServiceimpl implements BarberserviceService {

    @Autowired
    private BarberserviceDAO barberserviceDAO;

    @Override
    public List<Barberservice> listBarberServices() {
        return barberserviceDAO.listBarberServices();
    }
}
