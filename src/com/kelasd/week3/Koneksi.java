package com.kelasd.week3;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;

public class Koneksi {
    
    public static Connection hubungkanDB(){
        try {
            //Koneksi ke DB
            MysqlDataSource m = new MysqlDataSource();
            m.setDatabaseName("toko"); 
            m.setUser("root");
            m.setPassword(""); 
            m.setServerName("localhost"); 
            m.setPortNumber(3306); 
            m.setServerTimezone("Asia/Jakarta"); 
            Connection c = m.getConnection();
            return c;
        } catch (Exception e) {            
        }
        return null;
    }
    
}
