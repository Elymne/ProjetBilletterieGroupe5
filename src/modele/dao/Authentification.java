/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modele.jdbc.Jdbc;
import modele.metier.Utilisateur;

/**
 *
 * @author Elymne
 */
public class Authentification {
    
    public static Utilisateur selectOneByName(String nomUser) throws SQLException {
        Utilisateur utilisateur = null;
        ResultSet rs = null;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT * FROM user WHERE LOGIN= ?";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setString(1, nomUser);
        rs = pstmt.executeQuery();
        if (rs.next()) {
            utilisateur = Authentification.utilisateurFromResultSet(rs);
        }
        return utilisateur;
    }
    
    public static ArrayList<Utilisateur> selectAll() throws SQLException {
        ArrayList<Utilisateur> lesUtilisateurs = new ArrayList<Utilisateur>();
        Utilisateur utilisateur = null;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT * FROM user";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            utilisateur = Authentification.utilisateurFromResultSet(rs);
            lesUtilisateurs.add(utilisateur);
        }
        return lesUtilisateurs;
    }
    
    private static Utilisateur utilisateurFromResultSet(ResultSet rs) throws SQLException {
        Utilisateur clt = null;
        int id = rs.getInt("ID");
        String loggin = rs.getString("LOGIN");
        String password = rs.getString("PASSWORD");
        clt = new Utilisateur(id, loggin, password);
        return clt;
    }
}
