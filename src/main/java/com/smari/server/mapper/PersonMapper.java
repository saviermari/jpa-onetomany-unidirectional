package com.smari.server.mapper;

import com.smari.server.dto.PersonModel;
import com.smari.server.dto.PhoneModel;
import com.smari.server.enitity.Person;
import com.smari.server.enitity.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author smari
 */
@Component
public class PersonMapper {
    @Autowired
    private PhoneMapper mapper;
    public  PersonModel convertEntityToModel(Person entity){
        PersonModel personModel = new PersonModel();
        if(entity != null){
            if(entity.getId() != null) personModel.setId(entity.getId());
            personModel.setFirstName(entity.getFirstName());
            personModel.setLastName(entity.getLastName());
            List<PhoneModel> phones = null;
            if(entity.getPhones() == null)
                return personModel;
            phones = entity.getPhones().stream().map(mapper::convertEntityToModel).collect(Collectors.toList());
            personModel.setPhones(phones);
        }
        return personModel;
    }

    public  Person convertModelToEntity(PersonModel model){
        Person person = new Person();
        if(model != null){
            if(model.getId() != null) person.setId(model.getId());
            person.setFirstName(model.getFirstName());
            person.setLastName(model.getLastName());
            List<Phone> phones = null;
            if (model.getPhones() == null) {
                return person;
            }
            phones = model.getPhones().stream().map(mapper::convertModelToEntity).collect(Collectors.toList());
            person.setPhones(phones);
        }
        return person;
    }
}
