package com.citting.controllers;

import com.citting.dao.WniosekDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("wnioski")
public class WniosekController {


    @Autowired
    WniosekDao wniosekDao;

    @RequestMapping("/all")
    public String start(Model model)
    {
        model.addAttribute("wnioski",wniosekDao.getList());

        return "wnioski";
    }
}
