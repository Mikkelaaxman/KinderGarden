package project.kindergarden.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import project.kindergarden.models.model.ChildModel;
import project.kindergarden.models.repository.ChildRepository;
import project.kindergarden.models.request.ChildRequest;
import project.kindergarden.models.response.Child;
import project.kindergarden.models.service.ModelService;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/archive")
public class ArchiveController
{
    @Autowired
    ModelService service;

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
        ModelService cs = new ModelService();
        ChildRequest cr = new ChildRequest(fName, lName, bDate, sDate, note);
        return service.save(cr); // what happens: adds a new child by sending constructor info
    }


    @GetMapping(value = "")
    public ModelAndView getAll(Model model)
    {
        // sets a model and view
        mv= new ModelAndView();
        mv.setViewName("archive");
        mv.addObject("ModelService", service);
        mv.addObject("chosen", service.getAll().get(0));
        return mv;
    }


    @GetMapping(value = "/get{id}")
    public ModelAndView getPerson(@PathVariable("id") int id)
    {
        mv= new ModelAndView();
        mv.setViewName("archive");
        mv.addObject("ModelService", service);
        mv.addObject("chosen", service.getChild(id));
        return mv;
    }
}

