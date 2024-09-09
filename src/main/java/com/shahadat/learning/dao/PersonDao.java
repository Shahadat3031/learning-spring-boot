package com.shahadat.learning.dao;

import com.shahadat.learning.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {

    int insertPerson(UUID id, Person person);

    default int addPerson(Person person){
        UUID id =  UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPerson();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonByID(UUID id);

    int updatePersonById(UUID id, Person person);
}
