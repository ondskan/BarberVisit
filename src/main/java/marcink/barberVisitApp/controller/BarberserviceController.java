package marcink.barberVisitApp.controller;

import marcink.barberVisitApp.model.Barberservice;
import marcink.barberVisitApp.service.BarberserviceService;
import marcink.barberVisitApp.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Marcin on 2015-02-22.
 */
@Controller
public class BarberserviceController {

    @Autowired
    private BarberserviceService barberserviceService;

    @Autowired
    private VisitService visitService;


  @RequestMapping(value = { "/", "/newVisit"})
    public ModelAndView listServices() {
        List listServices = barberserviceService.listBarberServices();
        return new ModelAndView("listServices", "listServices", listServices);
    }


   /* @RequestMapping(value = { "/", "/newVisit"})
    public String listBarberServices(Model model) {

        List<Barberservice> listServices = visitService.newVisitListServices();

        model.addAttribute("listServices", listServices);

        return "listServices";

    }*/




}
