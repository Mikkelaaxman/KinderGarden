package project.kindergarden.controllers;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import project.kindergarden.models.data.Gender;
import project.kindergarden.models.model.ChildModel;

import java.time.LocalDate;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/archive")
public class ArchiveController
{
    ArrayList<ChildModel> list = new ArrayList<>();
    ModelAndView mv;

    public ArchiveController()
    {
    }


    @GetMapping(value = "")
    public ModelAndView getAll(Model model)
    {
        // sets a model and view
        mv= new ModelAndView();
        mv.setViewName("archive");
        mv.addObject("chosen", list.get(0));
        mv.addObject("list", list);
        return mv;
    }


    @GetMapping(value = "/get{id}")
    public ModelAndView getPerson(@PathVariable("id") String id)
    {
        mv= new ModelAndView();
        mv.setViewName("archive");
        mv.addObject("list", -1);

        int i = Integer.parseInt(id);
        mv.addObject("chosen",-1); // replace in model with a get by id
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

