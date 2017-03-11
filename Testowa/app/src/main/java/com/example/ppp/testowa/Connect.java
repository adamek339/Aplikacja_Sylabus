package com.example.ppp.testowa;


import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;





/**
 * Created by ppp on 2016-09-11.
 */



// klasa odpowiedzialna za połączenie z serwerem


public class Connect {

       String ip="***********";                          // adres ip serwera

    String driver = "net.sourceforge.jtds.jdbc.Driver";   // sterownik
    String dataBaseName = "wsei2";                        //nazwa bazy danych

    String serUserName = "sa";                           // nazwa uzytkownika serwera
    String serPassword = "Wsei1";                       // hasło uzytkownika serwera

    @SuppressLint("NewApi")
    public Connection CONN() {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection conn = null;
        String ConnURL = null;
        try {

            Class.forName(driver);
            ConnURL = "jdbc:jtds:sqlserver://" + ip + ";"
                    + "databaseName=" + dataBaseName + ";user=" + serUserName + ";password="
                    + serPassword + ";";
            conn = DriverManager.getConnection(ConnURL);
        } catch (SQLException se) {
            Log.e("ERRO", se.getMessage());
        } catch (ClassNotFoundException e) {
            Log.e("ERRO", e.getMessage());
        } catch (Exception e) {
            Log.e("ERRO", e.getMessage());
        }
        return conn;
    }
}
