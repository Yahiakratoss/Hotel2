package project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class select {

    public static ResultSet getData(String query) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = ConnectionProvider.getCon(); // Remplacez par votre méthode de connexion.
            st = con.createStatement();
            rs = st.executeQuery(query);
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
}
