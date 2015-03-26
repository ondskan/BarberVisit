package marcink.barberVisitApp.service;

import marcink.barberVisitApp.DAO.VisitDAO;
import marcink.barberVisitApp.model.Barberservice;
import marcink.barberVisitApp.model.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Marcin on 2015-03-18.
 */

@Service
public class VisitServiceimpl implements VisitService {

    @Autowired
    VisitDAO visitDAO;


    @Override
    public List<Visit> listClientVisits() {
        return visitDAO.listClientVisits();
    }
}
