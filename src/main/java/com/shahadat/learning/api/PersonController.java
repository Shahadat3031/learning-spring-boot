package com.shahadat.learning.api;


import com.shahadat.learning.model.Person;
import com.shahadat.learning.service.PersonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
     public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
     }
}
