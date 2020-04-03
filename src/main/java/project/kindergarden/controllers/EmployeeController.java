package project.kindergarden.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController
{
    ModelAndView mv;

    public EmployeeController()
    {
    }


    @GetMapping(value = "")
    public ModelAndView getEmployees(Model model)
    {
        // sets a model and view
        mv= new ModelAndView();
        mv.setViewName("employees");
        mv.addObject("Chosen", -1);
        mv.addObject("List", -1);
        return mv;
    }


    @GetMapping(value = "/get-employee{id}")
    public ModelAndView getEmployee(@PathVariable("id") String id)
    {
        mv= new ModelAndView();
        mv.setViewName("employees");
        mv.addObject("List", -1);

        int i = Integer.parseInt(id);
        mv.addObject("Chosen", -1); // replace in model with a get by id
        return mv;
    }

}
