package com.igarashiisrael.demographicdata.resources;

import com.igarashiisrael.demographicdata.entities.Client;
import com.igarashiisrael.demographicdata.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientResources {

    @Autowired
    private ClientService service;

    @GetMapping
    public ResponseEntity <List<Client>> findAll(){
        List<Client> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }
}
