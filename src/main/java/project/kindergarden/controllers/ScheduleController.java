package project.kindergarden.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import project.kindergarden.models.ScheduleModel;

@RestController
@RequestMapping(value = "/schedule")
public class ScheduleController
{
    ScheduleModel scheduleModel;
    public ScheduleController()
    {
        scheduleModel = new ScheduleModel();
    }


    @GetMapping(value = "")
    public ModelAndView schedule()
        {
            ModelAndView mv = new ModelAndView();
            mv.setViewName("schedule");

            mv.addObject("thisYear", "placeholder");
            mv.addObject("thisMonth",  "placeholder");
            mv.addObject("thisDay",  "placeholder");
            mv.addObject("daysInMonth", "placeholder");




            return  mv;
        }
}