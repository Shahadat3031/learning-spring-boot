package com.shahadat.learning.service;


import com.shahadat.learning.model.Person;
import com.shahadat.learning.dao.PersonDao;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {

    private final PersonDao personDao;

    @Autowired
    public PersonService( @Qualifier("FakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(@RequestBody Person person){
        return personDao.addPerson(person);
    }

    public List<Person> getAllPeople(){
        return personDao.selectAllPerson();
    }

    public Optional<Person> getPersonById(UUID id){
        return personDao.selectPersonById(id);
    }

}
