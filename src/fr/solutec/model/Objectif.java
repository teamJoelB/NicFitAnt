/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;

import java.sql.Date;

/**
 *
 * @author ESIC
 */
public class Objectif {
    
    private int id_Objectif ;
    private  String description;
    private  String categorie;
    private int valeur_Max;
    private int valeur_Actuelle;
    private Date echeance;

    
    // constructeur general
    
    public Objectif(int id_Objectif, String description, String categorie, int valeur_Max, int valeur_Actuelle, Date echeance) {
        this.id_Objectif = id_Objectif;
        this.description = description;
        this.categorie = categorie;
        this.valeur_Max = valeur_Max;
        this.valeur_Actuelle = valeur_Actuelle;
        this.echeance = echeance;
    }

    // Constructeur d'ajout d'objectif
    
    public Objectif(String description, String categorie, int valeur_Max) {
        this.description = description;
        this.categorie = categorie;
        this.valeur_Max = valeur_Max;
    }
    
    
    // Constructeur vide
    public Objectif(){}
    

    public int getId_Objectif() {
        return id_Objectif;
    }

    public void setId_Objectif(int id_Objectif) {
        this.id_Objectif = id_Objectif;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getValeur_Max() {
        return valeur_Max;
    }

    public void setValeur_Max(int valeur_Max) {
        this.valeur_Max = valeur_Max;
    }

    public int getValeur_Actuelle() {
        return valeur_Actuelle;
    }

    public void setValeur_Actuelle(int valeur_Actuelle) {
        this.valeur_Actuelle = valeur_Actuelle;
    }

    public Date getEcheance() {
        return echeance;
    }

    public void setEcheance(Date echeance) {
        this.echeance = echeance;
    }
    
    
    
    
    
}
