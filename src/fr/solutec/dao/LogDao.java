/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import fr.solutec.model.Log;
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
    
    public static Log derniere_Connexion(Log l)throws SQLException{
        
    String sql  ="SELECT MAX(date_Deconnexion) FROM Log WHERE id_User=User_id_User";
        Connection connexion = ConnectBd.getConnection(); 
        PreparedStatement requete = connexion.prepareStatement(sql);
        ResultSet rs = requete.executeQuery();
        
        if (rs.next()){
            l = new Log();
            l.setId_Log(rs.getId_Log("id_Log"));
            l.setDate_Deconnexion(rs.getDate_Deconnexion("date_Deconnexion"));
            l.setUser(rs.getUser("user"));
            
        }
   
        return l;
        
    }
}
