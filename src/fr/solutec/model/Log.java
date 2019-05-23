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
public class Log {
    
    
    private int id_Log ;
    private Date date_Deconnexion;
    private User user;
    
     // Constructeur entier

    public Log(int id_Log, Date date_Deconnexion, User user) {
        this.id_Log = id_Log;
        this.date_Deconnexion = date_Deconnexion;
        this.user = user;
    }

  
    
     // Constructeur vide
    
    public Log(){}
    
    

    public int getId_Log() {
        return id_Log;
    }

    public void setId_Log(int id_Log) {
        this.id_Log = id_Log;
    }

    public Date getD_Connection() {
        return date_Deconnexion;
    }

    public void setD_Connection(Date date_Deconnexion) {
        this.date_Deconnexion = date_Deconnexion;
    }

    public Date getDate_Deconnexion() {
        return date_Deconnexion;
    }

    public User getUser() {
        return user;
    }
    


    public void setDate_Deconnexion(Date date_Deconnexion) {
        this.date_Deconnexion = date_Deconnexion;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
    
}
