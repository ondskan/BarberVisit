package marcink.barberVisitApp.controller;

import marcink.barberVisitApp.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Marcin on 2015-02-24.
 */
@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/myprofile")
    public ModelAndView clientPeofile(){
        List myprofile = clientService.showClientProfile();
        return new ModelAndView("myprofile", "myprofile", myprofile);
    }


    @RequestMapping(value = "/editprofile/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable BigDecimal idClient, Model model) {
        model.addAttribute("client", clientService.getClient(idClient));
        return "editProfile";
    }


}
