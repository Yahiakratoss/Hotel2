package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

    // Méthode pour obtenir une connexion à la base de données
    public static Connection getCon() {
        Connection con = null;
        try {
            // Charger le driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // URL de connexion JDBC, utilisateur et mot de passe
            String url = "jdbc:mysql://localhost:3306/java"; // Remplacez "your_database" par le nom de votre base
            String user = "root"; // Remplacez par votre nom d'utilisateur MySQL
            String password = "root"; // Remplacez par votre mot de passe MySQL
            
            // Obtenir la connexion
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connexion réussie à la base de données !");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC non trouvé : " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Erreur de connexion à la base de données : " + e.getMessage());
        }
        return con;
    }
}
