package com.miage.bdata.repositories.cassandra;

import com.miage.bdata.entity.Partie;
import com.miage.bdata.repositories.PartieRepository;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface PartieCassandraRepository extends CassandraRepository<Partie, UUID>, PartieRepository{

    // TODO

}
