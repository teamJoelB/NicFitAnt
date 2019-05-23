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
public class Poids {
    private int id_Poids ;
    private double val_Poids;
    private Date date_Modification;
    private User user;

    public Poids(int id_Poids, double val_Poids, Date date_Modification, User user) {
        this.id_Poids = id_Poids;
        this.val_Poids = val_Poids;
        this.date_Modification = date_Modification;
        this.user = user;
    }

    
    public Poids(){}

    public int getId_Poids() {
        return id_Poids;
    }

    public void setId_Poids(int id_Poids) {
        this.id_Poids = id_Poids;
    }

    public double getVal_Poids() {
        return val_Poids;
    }

    public void setVal_Poids(double val_Poids) {
        this.val_Poids = val_Poids;
    }

    public Date getDate_Modification() {
        return date_Modification;
    }

    public void setDate_Modification(Date date_Modification) {
        this.date_Modification = date_Modification;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    




    
    
    
    
}
