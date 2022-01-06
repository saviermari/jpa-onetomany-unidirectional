package com.smari.server.mapper;

import com.smari.server.dto.PhoneModel;
import com.smari.server.enitity.Phone;
import org.springframework.stereotype.Component;

/**
 * @author smari
 */
@Component
public class PhoneMapper {
    public Phone convertModelToEntity(PhoneModel model) {
        Phone phone = new Phone();
        if(model != null){
            if(model.getId() != null) phone.setId(model.getId());
            phone.setPhoneNumber(model.getPhoneNumber());
        }
        return phone;
    }

    public PhoneModel convertEntityToModel(Phone entity) {
        PhoneModel phoneModel = new PhoneModel();
        if(entity != null){
            if(entity.getId() != null) phoneModel.setId(entity.getId());
            phoneModel.setPhoneNumber(entity.getPhoneNumber());
        }
        return phoneModel;
    }
}
