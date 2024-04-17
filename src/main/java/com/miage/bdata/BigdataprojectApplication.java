package com.miage.bdata;

import com.miage.bdata.entity.Joueur;
import com.miage.bdata.repositories.cassandra.JoueurCassandraRepository;
import com.miage.bdata.repositories.mongo.JoueurMongoDBRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.UUID;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.m1.groupe2.bigdataproject.repositories.mongo")
public class BigdataprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BigdataprojectApplication.class, args);
	}

	@Bean 
	CommandLineRunner commandLineRunner(JoueurMongoDBRepository joueurMongoDBRepository,
										JoueurCassandraRepository joueurCassandraRepository) {
		// Injection has to be done on the specific repository, not on the common interface because of the multiple inheritance
		return args -> {

			// Create a new joueur
			Joueur joueur = new Joueur();
			joueur.setUuid(UUID.randomUUID());
			joueur.setNbMatchsJouees(10);
			joueur.setNbMatchsGagnees(5);
			joueur.setScoreMoyen(10.0);
			joueur.setNbBoulesLancees(100);
			joueur.setNbCarreaux(10);

			// Save the joueur though Cassandra and Mongo repository
			joueurCassandraRepository.save(joueur);
			joueurMongoDBRepository.save(joueur);

			// Fetch all joueur from Cassandra and MongoDB repositories, method is defined in JoueurRepository common interface
			System.out.println(joueurCassandraRepository.findAll());
			System.out.println(joueurMongoDBRepository.findAll());
		};
	}
}