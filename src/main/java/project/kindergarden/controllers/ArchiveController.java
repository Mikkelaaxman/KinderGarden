package project.kindergarden.controllers;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import project.kindergarden.data.Gender;
import project.kindergarden.models.ChildModel;
import project.kindergarden.models.ListUtil;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/archive")
public class ArchiveController
{
    ArrayList<ChildModel> list = new ArrayList<>();
    ModelAndView mv;
    ListUtil listUtil = new ListUtil();

    public ArchiveController()
    {
        list = (ArrayList<ChildModel>) listUtil.getChildList();
        listUtil.CreateChild(9999, new int[99], "THe", "Dude", Gender.M, LocalDate.parse("2020-05-22"), LocalDate.parse("1990-05-22"), LocalDate.parse("1990-05-22"), true, "Wheres my rug");
        System.out.println(listUtil.getChildList().get(0).getBirthDate() );
        listUtil.getChildList().get(0).setBirthDate(LocalDate.parse("1010-05-22"));
        System.out.println(listUtil.getChildList().get(0).getBirthDate() + " THis means it works ");
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

        int i = Integer.parseInt(id);
        mv.addObject("chosen", listUtil.ReadChild(i)); // replace in model with a get by id
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
        mv.addObject("list", list);
        mv.addObject("chosen", list.get(0)); // replace in model with a get by id
        return mv;
    }


}

