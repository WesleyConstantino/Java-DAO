
package empresaapp;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionFactory {
    private Connection conexao;
    public Connection  getConnection(){
        try {
            return DriverManager.getConnection("jdbc:derby://localhost:1527/empresa","app","app");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
