/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import modele.dao.Jdbc;
import vue.*;
import controleur.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author btssio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
////        Jdbc.creer("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:", "@localhost:1521:XE", "", "btssio", "btssio");
//        Jdbc.creer("com.mysql.jdbc.Driver", "jdbc:mysql:", "//localhost/", "AGENCEB", "agenceb_util", "secret");
//        try {
//            Jdbc.getInstance().connecter();
//            /*VueLesAdresses uneVue = new VueLesAdresses();
//            CtrlLesAdresses unControleur = new CtrlLesAdresses(uneVue);*/
//            VueLesClients uneVue = new VueLesClients();
//            CtrlLesClients unControleur = new CtrlLesClients(uneVue);
//            // afficher la vue
//            uneVue.setVisible(true);
//        } catch (ClassNotFoundException ex) {
//            JOptionPane.showMessageDialog(null, "Main - classe JDBC non trouvée");
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Main - échec de connexion");
//        }
//
//    }
//
//}
