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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ilia Consuegra y Alain Lozano
 */
public class DBImplementation implements Model{

    private Connection con;   
    private ConnectionOpenClose connection = new ConnectionOpenClose();
    private String saludo;
    
    final String GETGREETING = "SELECT * FROM greeting";
    
    
    
    @Override
    public String getGreeting() {
        ResultSet rs = null;
        try {           
            con = connection.openConnection();
            
            PreparedStatement stmt = con.prepareStatement(GETGREETING);
            
            rs = stmt.executeQuery();
            
            if(rs.next())
                saludo = rs.getString("castellano");
            
            connection.closeConnection(stmt, con);
            
        } catch (SQLException ex) {
            Logger.getLogger(DBImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return saludo;
    }
    
}
