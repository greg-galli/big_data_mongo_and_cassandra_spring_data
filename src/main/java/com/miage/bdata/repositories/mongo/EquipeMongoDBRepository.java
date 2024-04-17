package com.miage.bdata.repositories.mongo;

import com.miage.bdata.entity.Equipe;
import com.miage.bdata.repositories.EquipeRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;


public interface EquipeMongoDBRepository extends MongoRepository<Equipe, UUID>, EquipeRepository {

    // TODO
}
