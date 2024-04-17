package com.miage.bdata.repositories;

import com.miage.bdata.entity.Joueur;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JoueurRepository {

    // Definition of a common method to find all players, implemented in JoueurCassandraRepository, JoueurMongoDBRepository through Spring Data
    // Only possible for methods that are common to MongoDb and Cassandra repositories
    public List<Joueur> findAll();
}