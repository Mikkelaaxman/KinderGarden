package project.kindergarden.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * this functions as a navigation map of our web page. each method have a request mapping with the location you want to go,
 * and then returns a view (needs to be in resources/templates). The other Controllers control what happens on going to those pages.
 */
@Controller
public class ViewController
{

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping("")
    public String index(Model model)
    {
        return "index";
    }
}
