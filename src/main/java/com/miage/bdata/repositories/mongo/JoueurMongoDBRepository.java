package com.miage.bdata.repositories.mongo;

import com.miage.bdata.entity.Joueur;
import com.miage.bdata.repositories.JoueurRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface JoueurMongoDBRepository extends MongoRepository<Joueur, UUID>, JoueurRepository {

    // TODO
}
