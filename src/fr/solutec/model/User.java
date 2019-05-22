/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;

/**
 *
 * @author Joel B
 */
public class User {

 
   
    
    private int id ;
    private String login;
    private String nom ;
    private String prenom ;
    private String mail;
    private String mdp ; 
    private double poids;
    private double taille;
    
   
    public User( String login, String nom, String prenom, String mail,String mdp) {
     
        this.login = login;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.mdp = mdp;
        this.poids = poids;
        this.taille = taille;
    }
    
    
    
   
       public User(int id, String login, String nom, String prenom, String mail, String mdp, double Poid, double taille) {
        this.id = id;
        this.login = login;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.mdp = mdp;
        this.Poid = Poid;
        this.taille = taille;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public double getPoid() {
        return Poid;
    }

    public void setPoid(double Poid) {
        this.Poid = Poid;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }
    
    
}
