package com.wroccer.controllers;

import com.wroccer.dao.WniosekDao;
import com.wroccer.entity.Status;
import com.wroccer.entity.Wniosek;
import com.wroccer.repositories.WniosekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("wnioski")
public class WniosekController {


    @Autowired
    WniosekDao wniosekDao;

    @Autowired
    WniosekRepository wniosekRepository;


    @GetMapping("/all")
    public String start(Model model)
    {
        model.addAttribute("wnioski",wniosekRepository.findAll());
        return "wnioski";
    }

    @RequestMapping("/{id}")
    public String view(@PathVariable Long id, Model model){
        Wniosek wniosek = wniosekRepository.findById(id);
        model.addAttribute("wniosek",wniosek);
        model.addAttribute("zawodnicy",wniosek.getZawodnicy());
        return "wniosek";
    }

    @RequestMapping("{id}/status/{status}")
    public String updateStatus(@PathVariable Long id, @PathVariable int status, Model model)
    {
        Wniosek wniosek = wniosekRepository.findById(id);
        wniosek.setStatus(Status.values()[status]);
        wniosekDao.update(wniosek);

        return "redirect: /wnioski/{id}";
    }

    @RequestMapping("filter/{status}")
    public String updateStatus(@PathVariable int status, Model model)
    {
        List<Wniosek> wnioski = wniosekRepository.findByStatus(Status.values()[status]);
        model.addAttribute("wnioski",wnioski);
        return "wnioski";
    }
}
