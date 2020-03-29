package project.kindergarden.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/schedule")
public class ScheduleController
{

    public ScheduleController()
    {
    }


    @GetMapping(value = "")
    public ModelAndView schedule()
        {
            ModelAndView mv = new ModelAndView();
            mv.setViewName("schedule");



            return  mv;
        }
}
