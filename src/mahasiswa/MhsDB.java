/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class MhsDB {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;
    public MhsDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_crud", "root", "");
            System.out.println("koneksi berhasil");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MhsDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MhsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void insertDB(String nim, String nama, String alamat){
        try {
            String sql = "insert into mahasiswa value (?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, nim);
            pst.setString(2, nama);
            pst.setString(3, alamat);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MhsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateDB(String nim, String nama, String alamat){
        try {
            String sql = "update mahasiswa set namamhs = ?, alamatmhs = ? where nimmhs = ?";
            pst = con.prepareStatement(sql);
            pst.setString(3, nim);
            pst.setString(1, nama);
            pst.setString(2, alamat);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MhsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet selectDB(){
        try {
            String sql = "select * from mahasiswa";
            st = con.createStatement();
            rs = st.executeQuery(sql);
                    } catch (SQLException ex) {
            Logger.getLogger(MhsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public void deleteDB(String nim){
        try {
            String sql = "delete from mahasiswa where nimmhs = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, nim);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MhsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet selectDBBarang(){
        try {
            String sql = "select * from barang";
            st = con.createStatement();
            rs = st.executeQuery(sql);
                    } catch (SQLException ex) {
            Logger.getLogger(MhsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public void insertBarang(String kodebarang, String namabarang){
        try {
            String sql = "insert into barang value (?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, kodebarang);
            pst.setString(2, namabarang);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MhsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateBarang(String kodebarang, String namabarang){
        try {
            String sql = "update barang set namabarang = ? where kodebarang = ?";
            pst = con.prepareStatement(sql);
            pst.setString(2, kodebarang);
            pst.setString(1, namabarang);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MhsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteBarang(String kodebarang){
        try {
            String sql = "delete from barang where kodebarang = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, kodebarang);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MhsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet selectDBWisata(){
        try {
            String sql = "select * from wisata";
            st = con.createStatement();
            rs = st.executeQuery(sql);
                    } catch (SQLException ex) {
            Logger.getLogger(MhsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public void insertWisata(String kodewisata, String namawisata, String kota){
        try {
            String sql = "insert into wisata value (?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, kodewisata);
            pst.setString(2, namawisata);
            pst.setString(3, kota);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MhsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateWisata(String kodewisata, String namawisata, String kota){
        try {
            String sql = "update wisata set namawisata = ?, kota = ? where kodewisata = ?";
            pst = con.prepareStatement(sql);
            pst.setString(3, kodewisata);
            pst.setString(1, namawisata);
            pst.setString(2, kota);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MhsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteWisata(String kodewisata){
        try {
            String sql = "delete from wisata where kodewisata = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, kodewisata);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MhsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

