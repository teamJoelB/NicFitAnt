/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import fr.solutec.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESIC
 */
public class UserDao {
    
    // Chercher dans la base de données couple Login/Mot de passe (renvoie null si rien)
    
    public static User get_By_Login_Pass(String login, String mdp) throws SQLException{
        User u = null;
        
        String sql = "SELECT * FROM user WHERE login=? AND mdp=?";
            Connection connexion = ConnectBd.getConnection();
        
            PreparedStatement requete = connexion.prepareStatement(sql);
    requete.setString(1, login);
    requete.setString(2, mdp);
    
        ResultSet rs = requete.executeQuery();
        
        if (rs.next()){
            u = new User();
            u.setId(rs.getInt("id_User"));
            u.setNom(rs.getString("nom"));
            u.setPrenom(rs.getString("prenom"));
            u.setAge(rs.getInt("age"));
            u.setMail(rs.getString("mail"));  
            u.setLogin(rs.getString("login"));
            u.setMdp(rs.getString("mdp")); 
            u.setTaille(rs.getDouble("taille"));
            u.setSexe(rs.getString("sexe"));
        }
        
        
        
        
        return u;
}
    
    
    // Retourner utilisateur
    
    public static User user_Inscrit(String login, String mdp) throws SQLException{
        User u = null;
        
        String sql = "SELECT * FROM user WHERE login=? AND mdp=?";
            Connection connexion = ConnectBd.getConnection();
        
            PreparedStatement requete = connexion.prepareStatement(sql);
    requete.setString(1, login);
    requete.setString(2, mdp);
    
        ResultSet rs = requete.executeQuery();
        
        if (rs.next()){
            u = new User();
            u.setId(rs.getInt("id_User"));
            u.setNom(rs.getString("nom"));
            u.setPrenom(rs.getString("prenom"));
            u.setAge(rs.getInt("age"));
            u.setMail(rs.getString("mail"));  
            u.setLogin(rs.getString("login"));
            u.setMdp(rs.getString("mdp")); 
            u.setTaille(rs.getDouble("taille"));
            u.setSexe(rs.getString("sexe"));
        }

        return u;
}
    
    // Nombre d'inscrit sur l'appli
    
    public static int nombre_Inscrit() throws SQLException{
        String sql = "SELECT Count(id_User)as lignes FROM user";
        Connection connexion = ConnectBd.getConnection();
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        ResultSet rs = requete.executeQuery();
        
        
        int lignes = 0;
        rs.next();
        lignes = rs.getInt("lignes");
        return lignes;
    }
    
    // Inscription (ajouter User dans base de données)
    
    public static void insert_Us(User u) throws SQLException{
        String sql  ="INSERT INTO user (nom, prenom, age, mail, login, mdp, taille, sexe) VALUES (?,?,?,?,?,?,?,?)";
        Connection connexion = ConnectBd.getConnection(); 
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, u.getNom());
        requete.setString(2, u.getPrenom());
        requete.setInt(3, u.getAge());
        requete.setString(4, u.getMail());
        requete.setString(5, u.getLogin());
        requete.setString(6, u.getMdp());
        requete.setDouble(7, u.getTaille());
        requete.setString(8, u.getSexe());
       
        requete.execute();
  
    }
    
        // Mettre à jour info profil utilisateur
     public static void update_Us(User u) throws SQLException{
        String sql  ="UPDATE 'user' SET 'nom' = ?, 'prenom' = ?, 'age' =?, 'mail' =?, 'login'=?, 'mdp'=?, 'taille'=?, 'sexe'=? WHERE login=? AND mdp=?";
        Connection connexion = ConnectBd.getConnection(); 
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, u.getNom());
        requete.setString(2, u.getPrenom());
        requete.setInt(3, u.getAge());
        requete.setString(4, u.getMail());
        requete.setString(5, u.getLogin());
        requete.setString(6, u.getMdp());
        requete.setDouble(7, u.getTaille());
        requete.setString(8, u.getSexe());
        requete.setString(9, u.getLogin());
        requete.setString(10, u.getMdp());
        
        requete.execute();
    }
   
    
}
