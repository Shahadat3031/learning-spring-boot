package com.shahadat.learning.service;


import com.shahadat.learning.dao.PersonDao;
import com.shahadat.learning.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonDao personDao;

    @Autowired
    public PersonService( @Qualifier("FakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.addPerson(person);
    }

}
