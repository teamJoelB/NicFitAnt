/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import fr.solutec.model.Poids;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ESIC
 */



  // Inscription (ajouter valeur poids dans classe Poids dans base de données)





public class PoidsDao {
    
  
    
    
        public static void insert_Poid(Poids p) throws SQLException{
        String sql  ="INSERT INTO poids (val_Poids, User_id_User) VALUES (?, ?)";
        Connection connexion = ConnectBd.getConnection(); 
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setDouble(1, p.getVal_Poids());
        requete.setInt(2, p.getUser().getId());
 
       
        requete.execute();
           
    }
        
        //Mettre à jour poids
        
     public static void update_Poid(Poids p) throws SQLException{
        String sql  ="UPDATE 'poids' SET 'val_Poids' = ? WHERE id_User=User_id_User";
        Connection connexion = ConnectBd.getConnection(); 
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setDouble(1, p.getVal_Poids());

        
        requete.execute();
    }        
}
