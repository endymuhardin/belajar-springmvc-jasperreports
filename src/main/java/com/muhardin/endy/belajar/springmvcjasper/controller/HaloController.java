package com.muhardin.endy.belajar.springmvcjasper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HaloController {
    
    @RequestMapping(value = "/halo", method = RequestMethod.GET)
    public ModelMap halo(){ 
        return new ModelMap().addAttribute("nama", "Endy Muhardin"); 
    }
    
}
