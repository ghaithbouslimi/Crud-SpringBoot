package com.example.CrudSpring.repository;

import com.example.CrudSpring.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RepositoryClient extends JpaRepository<Client, Long > {

}
