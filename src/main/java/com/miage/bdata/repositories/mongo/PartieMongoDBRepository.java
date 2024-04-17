package com.miage.bdata.repositories.mongo;

import com.miage.bdata.entity.Partie;
import com.miage.bdata.repositories.PartieRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;


public interface PartieMongoDBRepository extends MongoRepository<Partie, UUID>, PartieRepository{

    // TODO
}
