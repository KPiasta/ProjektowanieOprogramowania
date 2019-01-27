package com.wroccer.controllers;

import com.wroccer.dao.WniosekDao;
import com.wroccer.entity.Wniosek;
import com.wroccer.repositories.WniosekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("wnioski")
public class WniosekController {


    @Autowired
    WniosekDao wniosekDao;

    @Autowired
    WniosekRepository wniosekRepository;


    @RequestMapping("/all")
    public String start(Model model)
    {
        model.addAttribute("wnioski",wniosekRepository.findAll());

        return "wnioski";
    }

    @RequestMapping("/{id}")
    public String view(@PathVariable Long id, Model model){
        Wniosek wniosek = wniosekRepository.findById(id);
        model.addAttribute("wniosek",wniosek);
        return "wniosek";
    }
}
