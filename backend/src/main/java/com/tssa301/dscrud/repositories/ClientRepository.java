package com.tssa301.dscrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tssa301.dscrud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}