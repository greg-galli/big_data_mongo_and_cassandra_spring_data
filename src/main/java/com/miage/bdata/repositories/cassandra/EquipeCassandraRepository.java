package com.miage.bdata.repositories.cassandra;

import com.miage.bdata.entity.Equipe;
import com.miage.bdata.repositories.EquipeRepository;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface EquipeCassandraRepository extends CassandraRepository<Equipe, UUID>, EquipeRepository {

    // TODO
}
