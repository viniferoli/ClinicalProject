package controller;

import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnection {
    
    public Statement st;
    public ResultSet rs;
    private String driver = "org.postgresql.Driver";
    private String path = "jdbc:postgresql://localhost:5432/clinicalproject";
    private String user = "postgres";
    private String key = "admin";
    public Connection con;
    
    
    /*public void connection(){
        
        try {
            System.setProperty("jdbc.Drivers", driver);
            con=DriverManager.getConnection(driver, user, path);
            JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o Banco de dados:\n" +ex.getMessage());
        }
    }*/
    public DBConnection(){
    }

    public Connection getCon(){
        con = null;
        try {
            Class.forName("org/postgresql.Driver");
            con  = DriverManager.getConnection("jdbc:postgresql//localhost:5432/clinicalproject", "postgres","admin");
            JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso!");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o Banco de dados:\n" +ex.getMessage());
        }
        return con;
    }
        
    public void disconnection(){
        try {
            con.close();
            JOptionPane.showMessageDialog(null, "BD Desconectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com BD:\n" +ex.getMessage());
        }
    }
    
}
