/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import fr.solutec.model.Log;
import fr.solutec.model.Poids;
import fr.solutec.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author ESIC
 */
public class LogDao {

    //Insérer ligne log
    
    public static void insert_Log(Log l) throws SQLException{
        String sql  ="INSERT INTO log (date_Deconnexion, User_id_User) VALUES (?, ?)";
        Connection connexion = ConnectBd.getConnection(); 
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setDate(1, l.getDate_Deconnexion());
        requete.setInt(2, l.getUser().getId());
 
       
        requete.execute();
           
    }

    // Compter nombre connexion
    
    public static int nombre_Connexion(Log l) throws SQLException{
        String sql= "SELECT Count(User_id_User) as lignes FROM log WHERE User_id_User = ? GROUP BY User_id_User";
        Connection connexion = ConnectBd.getConnection(); 
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setInt(1, l.getUser().getId());
        
        ResultSet rs = requete.executeQuery();
        
        
       int lignes = 0;
       if( rs.next()){
           lignes = rs.getInt("lignes");
       }
        return lignes;
     }
        
        
   
    
    
    
    
    //Récupérer information dernière connexion (Date, heure)
    
    public static Log derniere_Connexion(Log l)throws SQLException{
        
    String sql  ="SELECT  date_Deconnexion From log " +
"Where date_Deconnexion=(Select MAX(date_Deconnexion) AND User_id_User = ?" +
"From log)";
        Connection connexion = ConnectBd.getConnection(); 
        
        
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setInt(1, l.getUser().getId());
        ResultSet rs = requete.executeQuery();
        if (rs.next()){
            l = new Log();
            l.setDate_Deconnexion(rs.getDate("date_Deconnexion"));
//            l.(rs.getId("User_id_User"));
            
        }
   
        return l;
        
      
    }
}
