package com.miage.bdata.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor @Builder
@Table("partie")
@Document(collection = "partie")
public class Partie {

    @Id
    @PrimaryKey
    private UUID uuid;

    // TODO - Ajouter les attributs nécessaires pour représenter une partie

}
