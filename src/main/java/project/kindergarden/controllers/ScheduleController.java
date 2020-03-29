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

            mv.addObject("thisYear", scheduleModel.getCurrentYear());
            mv.addObject("thisMonth",  scheduleModel.getCurrentMonth());
            mv.addObject("thisDay",  scheduleModel.getCurrentDay());
            mv.addObject("daysInMonth", scheduleModel.totalDaysInMonth());




            return  mv;
        }
}
