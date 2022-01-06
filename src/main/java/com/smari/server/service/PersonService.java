package com.smari.server.service;

import com.smari.server.dto.PersonModel;

import java.util.List;

/**
 * @author smari
 */
public interface PersonService {
    public PersonModel createPerson(PersonModel model);
    public PersonModel updatePerson(PersonModel model);
    public void deletePerson(Long id);
    public PersonModel getPerson(Long id);
    public List<PersonModel> getAllPersons();
}
