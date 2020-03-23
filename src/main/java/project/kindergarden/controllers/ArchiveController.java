package project.kindergarden.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/archive")
public class ArchiveController
{
    ArrayList<String> list = new ArrayList<>();
    Model model;
    public ArchiveController()
    {
    }


    @GetMapping(value = "")
    public ModelAndView start(Model model)
    {
        System.out.println("starting");
        // sets a model and view
        ModelAndView mv= new ModelAndView();
        mv.setViewName("archive");
        this.model = model;

        model.addAttribute("displayedChildren", list);
        return mv;
    }

    @GetMapping(value = "/all")
    public void getAll(Model model)
    {


        list = (ArrayList<String>) model.getAttribute("displayedChildren");

        list.add("tommy");
        list.add("buddy");
        list.add("pilar");
        list.add("jonas");

        return;
    }



}
