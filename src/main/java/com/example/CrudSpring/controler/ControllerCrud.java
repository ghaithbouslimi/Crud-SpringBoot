package com.example.CrudSpring.controler;

import com.example.CrudSpring.model.Client;
import com.example.CrudSpring.service.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
@Service
public class ControllerCrud {
    @Autowired
    private ServiceRepository service;

    @GetMapping("/client")
    public List<Client> getAllClient ()
    {
        return service.getAllClient();
    }

    @GetMapping("/client/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable("id") Long id) {
        Optional<Client> client = service.getOne(id);

        if (client.isPresent()) {
            return new ResponseEntity<>(client.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create")
    public Client postEmploye(@RequestBody Client client)
    {
        return service.saveClient(client);
    }
    @PutMapping("/update")
    public Client updateClient(@RequestBody Client client) {
        return service.updateClient(client);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
        try {
            service.DeleteClient(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }




}
