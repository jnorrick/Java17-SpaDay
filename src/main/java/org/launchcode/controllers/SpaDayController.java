package org.launchcode.controllers;

import org.launchcode.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


@Controller
public class SpaDayController {

    @GetMapping
    public String customerForm () {
        return "serviceSelection";
    }

    @PostMapping
    public String spaMenu(@RequestParam String skintype, @RequestParam String manipedi, Model model) {

        Client newClient = new Client(skintype, manipedi);
        newClient.setAppropriateFacials(skintype);
        model.addAttribute("client" , newClient);

        model.addAttribute("name", name );
        model.addAttribute("skintype", skintype);
        model.addAttribute("manipedi", manipedi);

        return "menu";
    }
}
