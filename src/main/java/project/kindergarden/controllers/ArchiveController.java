package project.kindergarden.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import project.kindergarden.models.model.ChildModel;
import project.kindergarden.models.repository.ChildRepository;
import project.kindergarden.models.request.ChildRequest;
import project.kindergarden.models.response.Child;
import project.kindergarden.models.service.ChildService;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/archive")
public class ArchiveController
{
    @Autowired
    ChildService service;

    @Autowired
    ChildRepository repo;


    ArrayList<ChildModel> list = new ArrayList<>();
    ModelAndView mv;

    public ArchiveController()
    {
    }


    @GetMapping(value = "add{fName}{lName}{bDate}{sDate}{note}{gender}")
    public Child add(@PathVariable("fName") String fName, @PathVariable String lName, @PathVariable String gender, @PathVariable String note, @PathVariable String sDate, @PathVariable String bDate)
    {
        ChildService cs = new ChildService();
        ChildRequest cr = new ChildRequest(fName, lName, bDate, sDate, note);
        return service.save(cr); // what happens: adds a new child by sending constructor info
    }


    @GetMapping(value = "")
    public ModelAndView getAll(Model model)
    {



        // sets a model and view
        mv= new ModelAndView();
        mv.setViewName("archive");
        mv.addObject("chosen", repo.findAllKids().get(0));
        mv.addObject("list",repo.findAllKids());
        return mv;
    }


    @GetMapping(value = "/get{id}")
    public ModelAndView getPerson(@PathVariable("id") int id)
    {
        mv= new ModelAndView();
        mv.setViewName("archive");
        mv.addObject("chosen", repo.findKidById(id));
        mv.addObject("list",repo.findAllKids());
        return mv;
    }




    @GetMapping(value = "/search{person}")
    public ModelAndView Search(Model model, @PathVariable Object person)
    {
        return mv;
    }

    @PostMapping(value = "/search")
    public ModelAndView post(@ModelAttribute("searchPattern") String searchPattern)
    {

        mv = new ModelAndView();
        mv.addObject("searchPattern", "");
        mv.setViewName("archive");
        mv.addObject("list", -1);
        mv.addObject("chosen",-1); // replace in model with a get by id
        return mv;
    }


}

