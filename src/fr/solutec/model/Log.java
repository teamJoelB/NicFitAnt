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
    
     // Constructeur entier

    public Log(int id_Log, Date date_Deconnexion) {
        this.id_Log = id_Log;
        this.date_Deconnexion = date_Deconnexion;
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
    
    
    
}
