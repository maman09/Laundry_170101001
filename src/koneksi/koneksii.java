/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Abdurrahman
 */
public class koneksii {
    //deklarasi variabel koneksi bernama conn
    public static Connection conn;
    public static Statement stm;
    
    //method koneksi bernama getKoneksi()
    public static Connection getKoneksi(){
        //isian untuk server
        String  host = "jdbc:mysql://localhost/laundry_uas170101001",
                user = "root",
                pass = "";
        
        //ujilah koneksi dengan pernyataan try catch
        try{
            conn = (Connection) DriverManager.getConnection(host, user, pass);
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
        return conn;
    }
}
