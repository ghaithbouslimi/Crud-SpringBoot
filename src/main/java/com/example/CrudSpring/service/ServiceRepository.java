package com.example.CrudSpring.service;

import com.example.CrudSpring.model.Client;
import com.example.CrudSpring.repository.RepositoryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class ServiceRepository {

    @Autowired
    private RepositoryClient repositoryClient ;

    public List<Client> getAllClient()
    {
        return repositoryClient.findAll();
    }

    public Optional<Client> getOne(Long id)
    {
        return repositoryClient.findById(id);
    }
    public Client findByid(Long id)
    {
        return repositoryClient.findById(id).get();
    }

    public Client saveClient(Client client)
    {
        return repositoryClient.save(client);
    }
    public Client updateClient(Client client)
    {
        return repositoryClient.save(client);
    }

      public boolean exsitById(Long id )
      {
          return repositoryClient.existsById(id);
      }
     public void DeleteClient (Long id)
     {
         Client client = findByid(id);
            repositoryClient.delete(client);
     }


}
