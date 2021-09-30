/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Class that allows opening and closing a connection to the greeting database.
 *
 * @author Ilia Consuegra y Alain Lozano
 */
public class ConnectionOpenClose {

    private ResourceBundle configFile;
    private String url;
    private String user;
    private String pass;

    /**
     * Constructor where the variables read from the configuration file are
     * initialized.
     */
    public ConnectionOpenClose() {
        configFile = ResourceBundle.getBundle("holamundo.model.DBConnection", new Locale("es"));
        url = configFile.getString("URL");
        user = configFile.getString("DBUser");
        pass = configFile.getString("DBPass");
    }

    /**
     * Method for opening the connection with initialized parameters
     *
     * @return con
     * @throws SQLException
     */
    public Connection openConnection() throws Exception {

        Connection con = null;
        con = DriverManager.getConnection(url, user, pass);

        return con;
    }

    /**
     * Method to close connection if input parameters are not null.
     *
     * @param stmt
     * @param con
     * @throws SQLException
     */
    public void closeConnection(PreparedStatement stmt, Connection con) throws SQLException {

        if (stmt != null) {
            stmt.close();
        }
        if (con != null) {
            con.close();
        }
    }
}
