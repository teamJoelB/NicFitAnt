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

 
   
    
    private int id_User ;
    private String login;
    private String nom ;
    private String prenom ;
    private String mail;
    private String mdp ; 
    private double taille;
    private int age;
    private String sexe; 

    public User(int id_User, String login, String nom, String prenom, String mail, String mdp, double taille, int age, String sexe) {
        this.id_User = id_User;
        this.login = login;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.mdp = mdp;
        this.taille = taille;
        this.age = age;
        this.sexe = sexe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    
   
    
   

 
    
    
   
       public User(int id_User, String login, String nom, String prenom, String mail, String mdp, double taille) {
        this.id_User = id_User;
        this.login = login;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.mdp = mdp;
        this.taille = taille;
    }

    public int getId() {
        return id_User;
    }

    public void setId(int id_User) {
        this.id_User = id_User;
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

   
    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }
    
    
}
