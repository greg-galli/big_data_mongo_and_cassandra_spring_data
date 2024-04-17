package com.miage.bdata.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor @Builder
@Table("joueur")
@Document(collection = "joueur")
public class Joueur {

    @Id
    @PrimaryKey
    private UUID uuid;

    // TODO - Ajouter les attributs nécessaires pour représenter un joueur

    // Exemples statistiques sur le niveau du joueur
    private int nbMatchsJouees;
    private int nbMatchsGagnees;
    private double scoreMoyen;
    private int nbBoulesLancees;
    private int nbCarreaux;

    @Override
    public String toString() {
        return this.uuid.toString();
    }
}
