/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import fr.solutec.model.Objectif;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ObjectifDao {
    
    //Ajout objectif dans la base de données
    
        public static void insert_Obj(Objectif o) throws SQLException{
        String sql  ="INSERT INTO objectif (description, categorie, valeur_Max, echeance, User_id_User) VALUES (?,?,?,?, ?)";
        Connection connexion = ConnectBd.getConnection(); 
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, o.getDescription());
        requete.setString(2, o.getCategorie());
        requete.setInt(3, o.getValeur_Max());
        requete.setDate(4, o.getEcheance());
        requete.setInt(5, o.getUser().getId());

       
        requete.execute();
        
    }
        
        
         public static void update_Obj(Objectif o) throws SQLException{
        String sql  ="UPDATE INTO objectif (description, categorie, valeur_Max, echeance) VALUES (?,?,?,?)";
        Connection connexion = ConnectBd.getConnection(); 
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, o.getDescription());
        requete.setString(2, o.getCategorie());
        requete.setInt(3, o.getValeur_Max());
        requete.setDate(4, o.getEcheance());

       
        requete.execute();
        
    }
        
        
        
        
        
    //Génère liste objectifs de la base de données (renvoie liste)
        
        public static List<Objectif> getAllObjectif() throws SQLException{
        List<Objectif> objectifs = new ArrayList<>();
        Connection connexion = ConnectBd.getConnection(); 
        
        String sql = "SELECT * FROM objectif";
        
        Statement requete = connexion.createStatement();
        ResultSet rs = requete.executeQuery(sql);
        
        while (rs.next()){
            Objectif o = new Objectif();
            o.setId_Objectif(rs.getInt("id_Objectif"));
            o.setDescription(rs.getString("description"));
            o.setCategorie(rs.getString("categorie"));
            o.setValeur_Max(rs.getInt("valeur_Max")); 
            o.setValeur_Actuelle(rs.getInt("valeur_Actuelle")); 
            o.setEcheance(rs.getDate("echeance"));
            
            objectifs.add(o);
        }
        
        return objectifs;
    }
    
}
