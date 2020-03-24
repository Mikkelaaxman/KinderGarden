package project.kindergarden.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * this functions as a navigation map of our web page. each method have a request mapping ewith the location you want to go,
 * and then returns a view (needs to be in resources/templates). The other Controllers control hat happens on going to those pages.
 */
@Controller
public class ViewController
{
    @RequestMapping("/")
    public String index(Model model)
    {
        System.out.println("received req");
        model.addAttribute("name", "emil");
        return "index";
    }


    @RequestMapping("/archive")
    public String archive(Model model)
    {

        return "archive";
    }

    @RequestMapping("/schedule")
    public String schedule(Model model)
    {

        return "schedule";
    }

    @RequestMapping("/employees")
    public String employees(Model model)
    {

        return "employees";
    }



}
