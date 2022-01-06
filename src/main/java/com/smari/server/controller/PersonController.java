package com.smari.server.controller;

import com.smari.server.dto.PersonModel;
import com.smari.server.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author smari
 */
@RestController
@RequestMapping(value = "/rest/v1", produces = { MediaType.APPLICATION_JSON_VALUE })
public class PersonController {
    @Autowired
    private PersonService service;
    @PostMapping("/persons")
    public PersonModel createPerson(@RequestBody PersonModel model){
        return service.createPerson(model);
    }

    @PutMapping("/persons/{id}")
    public PersonModel updatePerson(@RequestBody PersonModel model, @PathVariable Long id){
        PersonModel person = service.getPerson(id);
        if(person == null){
            throw new RuntimeException("Not found");
        }
        if(model != null) if (null == model.getId()) {
            model.setId(person.getId());
        }
        return service.updatePerson(model);
    }

    @DeleteMapping("/persons/{id}")
    public void deletePerson(@PathVariable Long id){
         service.deletePerson(id);
    }
    @GetMapping("/persons/{id}")
    public PersonModel getPerson(@PathVariable Long id){
        return service.getPerson(id);
    }

    @GetMapping("/persons")
    public List<PersonModel> getAllPersons(){
        return service.getAllPersons();
    }
}
