/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotell2;
import project.ConnectionProvider;
import java.sql.Connection;

/**
 *
 * @author Yahia
 */
public class Hotell2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try (Connection con = ConnectionProvider.getCon()) {
            if (con != null) {
                System.out.println("Connexion réussie à MySQL !");
            } else {
                System.out.println("Échec de la connexion à MySQL !");
            }
        } catch (Exception e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
    
}
