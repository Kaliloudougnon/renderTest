package com.example.demo.dao.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author kdougnon
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long numPlace;
    private String name;
    private String lastName;
    private String sexe;
    private String etablissement;
    private String annnee_naissance;
    private String academie;
    private String statut;
    private String mention;
    private String serie;
    private long session;


}
