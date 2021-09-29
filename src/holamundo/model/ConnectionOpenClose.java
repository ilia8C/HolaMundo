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

    private final ResourceBundle CONFIGFILE;
    private final String URL;
    private final String USER;
    private final String PASS;

    /**
     * Constructor where the variables read from the configuration file are
     * initialized.
     */
    public ConnectionOpenClose() {
        CONFIGFILE = ResourceBundle.getBundle("holamundo.model.DBConnection", new Locale("es"));
        URL = CONFIGFILE.getString("URL");
        USER = CONFIGFILE.getString("DBUser");
        PASS = CONFIGFILE.getString("DBPass");
    }

    /**
     * Method for opening the connection with initialized parameters
     *
     * @return con
     * @throws SQLException
     */
    public Connection openConnection() throws Exception {

        Connection con = null;
        con = DriverManager.getConnection(URL, USER, PASS);

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
