package in.kiranreddy.controller;

import in.kiranreddy.domain.Reminder;
import in.kiranreddy.repository.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by kiranreddy on 11/04/17.
 */
@RestController
@RequestMapping(value = "/api/reminders")
public class ReminderController {


    private ReminderRepository reminderRepository;

    @Autowired
    public ReminderController(ReminderRepository reminderRepository) {
        this.reminderRepository = reminderRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Reminder> getAllRemainders() {
        return reminderRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Reminder getRemainder(@PathVariable("id") Long id) {
        return reminderRepository.findOne(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteRemainder(@PathVariable("id") Long id) {
        reminderRepository.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void saveRemainder(@RequestBody Reminder reminder) {
        reminderRepository.save(reminder);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void saveRemainder(@PathVariable("id") Long id, @RequestBody Reminder reminder) {
        reminderRepository.save(reminder);
    }
}
