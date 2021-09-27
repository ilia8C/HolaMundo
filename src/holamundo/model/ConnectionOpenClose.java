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
 * Clase que permite abrir y cerrar una conexión con la base de datos greeting.
 * @author Ilia Consuegra y Alain Lozano
 */
public class ConnectionOpenClose {
    private ResourceBundle configFile;
    private String url;
    private String user;
    private String pass;
    
    /**
     * Constructor donde se inicializan las variables leídas desde el archivo de configuración.
     */
    public ConnectionOpenClose(){
        configFile = ResourceBundle.getBundle("holamundo.model.DBConnection", new Locale("es"));
        url = configFile.getString("URL");
        user = configFile.getString("DBUser");
        pass = configFile.getString("DBPass");
    }
    
    /**
     * Método para abrir la conexión con los parámetros inicializados
     * @return con
     * @throws SQLException
     */
    public Connection openConnection()throws SQLException{
        
        Connection con = null;
        try{
            con = DriverManager.getConnection(url, user, pass);
        }catch (SQLException e){
            System.out.println((e.getMessage()));
        }
        return con;
    }
    
    /**
     * Método para cerrar la conexión si los parámetros de entrada no son nulos.
     * @param stmt
     * @param con
     * @throws SQLException
     */
    public void closeConnection(PreparedStatement stmt, Connection con) throws SQLException{
        
        if(stmt != null){
            stmt.close();
        }
        if(con != null){
            con.close();
        }
    }
}
