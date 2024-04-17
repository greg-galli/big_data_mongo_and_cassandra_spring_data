package com.miage.bdata.repositories.cassandra;

import com.miage.bdata.entity.Joueur;
import com.miage.bdata.repositories.JoueurRepository;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface JoueurCassandraRepository extends CassandraRepository<Joueur, UUID>, JoueurRepository{
}
