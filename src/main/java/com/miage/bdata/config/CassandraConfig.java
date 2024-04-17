package com.miage.bdata.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories(basePackages = "com.m1.groupe2.bigdataproject.repositories.cassandra")
public class CassandraConfig { }
// TODO : Pas besoin d'éléments liés à la config, car ils sont déjà défini dans le fichier de configuration de l'application
