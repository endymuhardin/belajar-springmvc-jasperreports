package com.muhardin.endy.belajar.springmvcjasper.controller;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HaloController {

    @RequestMapping(value = "/halo", method = RequestMethod.GET)
    public ModelMap halo() {
        return new ModelMap().addAttribute("nama", "Endy Muhardin");
    }

    @RequestMapping(value = "/anggota/export*", method = RequestMethod.GET)
    public ModelMap exportDataAnggota(HttpServletRequest request) {
        String uri = request.getRequestURI();
        String format = uri.substring(uri.lastIndexOf(".") + 1);

        return new ModelMap()
                .addAttribute("format", format)
                .addAttribute("tanggal", new Date());
    }
}
