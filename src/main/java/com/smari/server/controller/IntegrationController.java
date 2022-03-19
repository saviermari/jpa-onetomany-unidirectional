package com.smari.server.controller;

import com.smari.server.dao.VendorRepository;
import com.smari.server.dto.PersonModel;
import com.smari.server.enitity.Vendor;
import com.smari.server.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/v1", produces = { MediaType.APPLICATION_JSON_VALUE })
public class IntegrationController {
    @Autowired
    private VendorRepository repo;

    @PostMapping("/vendors")
    public Vendor createVendor(@RequestBody Vendor entity){
        return repo.save(entity);
    }

    @GetMapping("/vendors")
    public List<Vendor> getAllVendors(){
        return repo.findAll();
    }

}
