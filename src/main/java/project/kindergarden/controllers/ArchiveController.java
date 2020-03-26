package project.kindergarden.controllers;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/archive")
public class ArchiveController
{
    ArrayList<test> list = new ArrayList<>();
    ModelAndView mv;

    public ArchiveController()
    {
        list.add(new test(1,"emil1", "pretty good at coding"));
        list.add(new test(2,"emil2", "pretty good at html"));
        list.add(new test(3,"emil3", "pretty handsome"));
        list.add(new test(4,"emil4", "pretty pretty"));
        list.add(new test(5,"emil5", "pretty clever"));
        list.add(new test(6,"emil6", "pretty good humor"));
        list.add(new test(1,"emil1", "pretty good at coding"));
        list.add(new test(2,"emil2", "pretty good at html"));
        list.add(new test(3,"emil3", "pretty handsome"));
        list.add(new test(4,"emil4", "pretty pretty"));
        list.add(new test(5,"emil5", "pretty clever"));
        list.add(new test(6,"emil6", "pretty good humor"));list.add(new test(1,"emil1", "pretty good at coding"));
        list.add(new test(2,"emil2", "pretty good at html"));
        list.add(new test(3,"emil3", "pretty handsome"));
        list.add(new test(4,"emil4", "pretty pretty"));
        list.add(new test(5,"emil5", "pretty clever"));
        list.add(new test(6,"emil6", "pretty good humor"));list.add(new test(1,"emil1", "pretty good at coding"));
        list.add(new test(2,"emil2", "pretty good at html"));
        list.add(new test(3,"emil3", "pretty handsome"));
        list.add(new test(4,"emil4", "pretty pretty"));
        list.add(new test(5,"emil5", "pretty clever"));
        list.add(new test(6,"emil6", "pretty good humor"));list.add(new test(1,"emil1", "pretty good at coding"));
        list.add(new test(2,"emil2", "pretty good at html"));
        list.add(new test(3,"emil3", "pretty handsome"));
        list.add(new test(4,"emil4", "pretty pretty"));
        list.add(new test(5,"emil5", "pretty clever"));
        list.add(new test(6,"emil6", "pretty good humor"));list.add(new test(1,"emil1", "pretty good at coding"));
        list.add(new test(2,"emil2", "pretty good at html"));
        list.add(new test(3,"emil3", "pretty handsome"));
        list.add(new test(4,"emil4", "pretty pretty"));
        list.add(new test(5,"emil5", "pretty clever"));
        list.add(new test(6,"emil6", "pretty good humor"));list.add(new test(1,"emil1", "pretty good at coding"));
        list.add(new test(2,"emil2", "pretty good at html"));
        list.add(new test(3,"emil3", "pretty handsome"));
        list.add(new test(4,"emil4", "pretty pretty"));
        list.add(new test(5,"emil5", "pretty clever"));
        list.add(new test(6,"emil6", "pretty good humor"));list.add(new test(1,"emil1", "pretty good at coding"));
        list.add(new test(2,"emil2", "pretty good at html"));
        list.add(new test(3,"emil3", "pretty handsome"));
        list.add(new test(4,"emil4", "pretty pretty"));
        list.add(new test(5,"emil5", "pretty clever"));
        list.add(new test(6,"emil6", "pretty good humor"));list.add(new test(1,"emil1", "pretty good at coding"));
        list.add(new test(2,"emil2", "pretty good at html"));
        list.add(new test(3,"emil3", "pretty handsome"));
        list.add(new test(4,"emil4", "pretty pretty"));
        list.add(new test(5,"emil5", "pretty clever"));
        list.add(new test(6,"emil6", "pretty good humor"));

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
        mv.addObject("list", list);

        System.out.println(mv.getModel().get("chosen"));
        System.out.println("id -  "+ id);

        int i = Integer.parseInt(id);
        mv.addObject("chosen", list.get(i-1)); // replace in model with a get by id
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
        mv.addObject("searchPattern", new String());
        mv.setViewName("archive");
        mv.addObject("list", list);
        mv.addObject("chosen", list.get(0)); // replace in model with a get by id
        return mv;
    }


}

