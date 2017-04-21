package in.kiranreddy.controller;

import in.kiranreddy.domain.Reminder;
import in.kiranreddy.repository.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kiranreddy on 21/04/17.
 */
@Controller
@RequestMapping
public class ReminderController {

    private ReminderRepository reminderRepository;

    @Autowired
    public ReminderController(ReminderRepository reminderRepository) {
        this.reminderRepository = reminderRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String loadHomePage(Model model) {
        model.addAttribute("reminders", reminderRepository.findAll());
        return "index";
    }


    @RequestMapping(method = RequestMethod.POST)
    public String addReminder(@ModelAttribute("reminder") Reminder reminder, Model model) {
        reminderRepository.save(reminder);
        return "redirect:/";
    }
}
