package com.shahadat.learning.service;


import com.shahadat.learning.dao.PersonDao;
import com.shahadat.learning.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PersonService {

    private final PersonDao personDao;

    @Autowired
    public PersonService( @Qualifier("FakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    @PostMapping
    public int addPerson(@RequestBody Person person){
        return personDao.addPerson(person);
    }

    @GetMapping
    public List<Person> getAllPeople(){
        return personDao.selectAllPerson();
    }

}
