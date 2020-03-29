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
    ArrayList<test> list = new ArrayList<>();
    ModelAndView mv;

    public EmployeeController()
    {
        list.add(new test(1,"eraskel1", "pretty good at coding"));
        list.add(new test(2,"eraskel2", "pretty good at html"));
        list.add(new test(3,"eraskel3", "pretty handsome"));
        list.add(new test(4,"eraskel4", "pretty pretty"));
        list.add(new test(5,"eraskel5", "pretty clever"));
        list.add(new test(6,"eraskel6", "pretty good humor"));
        list.add(new test(7,"eraskel7", "pretty good at coding"));
        list.add(new test(8,"eraskel8", "pretty good at html"));
        list.add(new test(9,"eraskel9", "pretty handsome"));
        list.add(new test(10,"raskel 10", "pretty pretty"));
        list.add(new test(11,"raskel 11", "pretty clever"));
    }


    @GetMapping(value = "")
    public ModelAndView getEmployees(Model model)
    {
        // sets a model and view
        mv= new ModelAndView();
        mv.setViewName("employees");
        mv.addObject("Chosen", list.get(0));
        mv.addObject("List", list);
        return mv;
    }


    @GetMapping(value = "/get-employee{id}")
    public ModelAndView getEmployee(@PathVariable("id") String id)
    {
        mv= new ModelAndView();
        mv.setViewName("employees");
        mv.addObject("List", list);

        int i = Integer.parseInt(id);
        mv.addObject("Chosen", list.get(i-1)); // replace in model with a get by id
        return mv;
    }

}
