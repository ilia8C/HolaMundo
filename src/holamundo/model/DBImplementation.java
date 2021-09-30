/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.model;

import holamundo.controller.Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * Class for reading the database
 *
 * @author Ilia Consuegra y Alain Lozano
 */
public class DBImplementation implements Model {

    /**
     * Method that opens the connection, closes it with the database and reads
     * the greeting from the greeting table and finally returns the greeting in
     * String format.
     *
     * @return saludo
     * @throws java.lang.Exception
     */
    @Override
    public String getGreeting() throws Exception {
        final String GETGREETING = "SELECT * FROM greeting";
        Connection con;
        ConnectionOpenClose connection = new ConnectionOpenClose();
        String saludo = null;

        ResultSet rs = null;

        con = connection.openConnection();

        PreparedStatement stmt = con.prepareStatement(GETGREETING);

        rs = stmt.executeQuery();

        if (rs.next()) {
            saludo = rs.getString("castellano");
        }

        connection.closeConnection(stmt, con);

        return saludo;
    }

}
