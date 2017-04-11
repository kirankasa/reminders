package in.kiranreddy.controller;

import in.kiranreddy.domain.Remainder;
import in.kiranreddy.repository.RemainderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by kiranreddy on 11/04/17.
 */
@RestController
@RequestMapping(value = "/api/remainders")
public class RemainderController {


    private RemainderRepository remainderRepository;

    @Autowired
    public RemainderController(RemainderRepository remainderRepository) {
        this.remainderRepository = remainderRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Remainder> getAllRemainders() {
        return remainderRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Remainder getRemainder(@PathVariable("id") Long id) {
        return remainderRepository.findOne(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteRemainder(@PathVariable("id") Long id) {
        remainderRepository.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void saveRemainder(@RequestBody Remainder remainder) {
        remainderRepository.save(remainder);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void saveRemainder(@PathVariable("id") Long id, @RequestBody Remainder remainder) {
        remainderRepository.save(remainder);
    }
}
