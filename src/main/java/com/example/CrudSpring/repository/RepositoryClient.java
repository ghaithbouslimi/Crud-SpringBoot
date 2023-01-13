package com.example.CrudSpring.repository;

import com.example.CrudSpring.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface RepositoryClient extends JpaRepository<Client, Long > {


}
