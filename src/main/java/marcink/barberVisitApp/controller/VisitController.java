package marcink.barberVisitApp.controller;

import marcink.barberVisitApp.model.Barberservice;
import marcink.barberVisitApp.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Marcin on 2015-03-18.
 */
public class VisitController {

    @Autowired
    VisitService visitService;

    @RequestMapping("myvisits")
    public ModelAndView ClientVisits() {
        List myVisitsList = visitService.listClientVisits();
        return new ModelAndView("myVisitsList", "myVisitsList", myVisitsList);
    }


}
