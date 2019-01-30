package com.wroccer.controllers;


import com.wroccer.dao.DruzynaDao;
import com.wroccer.entity.Druzyna;
import com.wroccer.repositories.DruzynaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("druzyny")
public class DruzynaController {


    @Autowired
    DruzynaDao druzynaDao;

    @Autowired
    DruzynaRepository druzynaRepository;


    @RequestMapping("/all")
    public String start(Model model)
    {
        model.addAttribute("druzyny",druzynaRepository.findAll());

        return "druzyny";
    }

    @RequestMapping("/{id}")
    public String view(@PathVariable Long id, Model model){
        Druzyna druzyna = druzynaRepository.findById(id);
        model.addAttribute("druzyna",druzyna);
        model.addAttribute("zawodnik", druzyna.getZawodnik());
        return "druzyna";
    }


    @RequestMapping("/{id}/info")
    public String viewInfo(@PathVariable Long id, Model model){
        Druzyna druzyna = druzynaRepository.findById(id);
        model.addAttribute("zawodnik", druzyna.getZawodnik());
        return "infoDruzyny";
    }

}
