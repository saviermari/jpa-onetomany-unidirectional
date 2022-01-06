package com.smari.server.service;

import com.smari.server.dao.PersonRepository;
import com.smari.server.dto.PersonModel;
import com.smari.server.enitity.Person;
import com.smari.server.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author smari
 */
@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonRepository repository;

    @Autowired
    private PersonMapper mapper;

    @Override
    public PersonModel createPerson(PersonModel model) {
        return mapper.convertEntityToModel(repository.save(mapper.convertModelToEntity(model)));
    }

    @Override
    public PersonModel updatePerson(PersonModel model) {
        return mapper.convertEntityToModel(repository.save(mapper.convertModelToEntity(model)));
    }

    @Override
    public void deletePerson(Long id) {
        repository.deleteById(id);
    }

    @Override
    public PersonModel getPerson(Long id) {
        Optional<Person> optional = repository.findById(id);
        if(optional.isPresent()){
            return mapper.convertEntityToModel(optional.get());
        }
        return null;
    }

    @Override
    public List<PersonModel> getAllPersons() {
        List<Person> personList = repository.findAll();
        List<PersonModel> modelList = personList.stream().map(mapper::convertEntityToModel).collect(Collectors.toList());
        return modelList;
    }
}
