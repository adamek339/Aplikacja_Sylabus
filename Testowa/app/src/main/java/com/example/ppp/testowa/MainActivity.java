package com.example.ppp.testowa;

//import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;


import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class MainActivity extends Activity {

    Connect connect;
    EditText ELogin, EPassword;
    Button BLogin;
    ProgressBar pbbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connect = new Connect();
        ELogin = (EditText) findViewById(R.id.edtuserid);
        EPassword = (EditText) findViewById(R.id.edtpass);
        BLogin = (Button) findViewById(R.id.btnlogin);
        pbbar = (ProgressBar) findViewById(R.id.pbbar);
        pbbar.setVisibility(View.GONE);

        BLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoLogin doLogin = new DoLogin();
                doLogin.execute("");

            }
        });

    }

    public class DoLogin extends AsyncTask<String,String,String>
    {
        String sign1 ="'";
        String sign2 =")";
        String z = "";
        Boolean isSuccess = false;


        String userid = ELogin.getText().toString();
        String password = EPassword.getText().toString();


        @Override
        protected void onPreExecute() {
            pbbar.setVisibility(View.VISIBLE);
        }

        @Override
        protected void onPostExecute(String r) {
            pbbar.setVisibility(View.GONE);
            Toast.makeText(MainActivity.this,r,Toast.LENGTH_SHORT).show();

            if(isSuccess) {
                Intent i = new Intent(MainActivity.this, AfterLogin.class);
                startActivity(i);
                finish();
            }

        }



        // metoda odpowiedzialna za logowanie użytkownika do bazy danych
        // sprawdza czy użytkownik o podaych w polach EditText loginie i hasle istnieje w bazie danych w tabeli Uzytkownicy
        @Override
        protected String doInBackground(String... params) {




            if((userid.indexOf(sign1)==-1 && password.indexOf(sign1)==-1) && (userid.indexOf(sign2)==-1 && password.indexOf(sign2)==-1)) {


                if (userid.trim().equals("") || password.trim().equals(""))
                    z = "Proszę wprowadzić login i hasło";
                else {
                    try {
                        Connection con = connect.CONN();
                        if (con == null) {
                            z = "Błąd połączenia z serwerem";
                        } else {
                            String query = "select * from Uzytkownicy where Login='" + userid + "' and Hasło='" + password + "'";
                            Statement stmt = con.createStatement();
                            ResultSet rs = stmt.executeQuery(query);

                            if (rs.next()) {
                                z = "Zalogowano";
                                isSuccess = true;
                            } else {
                                z = "Niepoprawne dane";
                                isSuccess = false;
                            }
                        }
                    } catch (Exception ex) {
                        isSuccess = false;
                        z = "Exceptions";
                    }
                }
            }


            else {

                z="Niepoprawne znaki w loginie lub haśle";
            }
            return z;
        }
    }
}
