package com.miage.bdata.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor @Builder
@Document(collection = "equipe")
@Table("equipe")
public class Equipe {

    @Id
    @PrimaryKey
    private UUID uuid;

    // TODO - Ajouter les attributs nécessaires pour représenter une équipe

    // Exemples statistiques sur le niveau de l'équipe
    private int nombreMatchsJouees;
    private int nombreMatchsGagnees;
    private double scoreMoyen;
}
