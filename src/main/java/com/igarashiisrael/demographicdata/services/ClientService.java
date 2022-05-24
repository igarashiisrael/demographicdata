package com.igarashiisrael.demographicdata.services;

import com.igarashiisrael.demographicdata.entities.Client;
import com.igarashiisrael.demographicdata.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public List<Client> findAll(){
        return repository.findAll();
    }

}
