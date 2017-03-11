package com.example.ppp.testowa;

import android.app.Activity;
import android.content.Intent;
//import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class AfterLogin extends Activity implements AdapterView.OnItemSelectedListener {
// do spinnera
    Spinner spinner;





    Connect connect;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pozalogowaniu);



        connect = new Connect();









        ArrayList<String> names= new ArrayList<String>();



        //// do spinera
        spinner= (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        ArrayAdapter<String> adapter;


        try {
        names.addAll(selectModuleName());
        } catch (SQLException e) {
            e.printStackTrace();
        }





        adapter= new ArrayAdapter<String>(this,R.layout.spinner_item,names);

        spinner.setAdapter(adapter);










    }


    public ArrayList<String> selectModuleName() throws SQLException {

        String moduleName="";
        Connection con = connect.CONN();
        String query = "select * from Nazwa_modulu;";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        ArrayList<String> container = new ArrayList<String>();
        while (rs.next()) {

            moduleName = rs.getString("Nazwa");

            container.add(moduleName);


        }




 return container;




    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {









    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }



    public ArrayList<String> selectID() throws SQLException {


        String id="";
        Connection con = connect.CONN();
        String query = "select IDsylabus from Sylabus;";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        ArrayList<String> container = new ArrayList<String>();
        while (rs.next()) {

            id = rs.getString("IDsylabus");

            container.add(id);


        }

return container;
    }




    public void pressedShow(View view) {


        ArrayList<String> container = new ArrayList<String>();
        try {
            container.addAll(selectID());
        } catch (SQLException e) {
            e.printStackTrace();
        }



        int position = spinner.getSelectedItemPosition(); // łapanie pozycji jaka jest ustawiona na sppinerze

        String finallyID ="";


        Bundle bundle = new Bundle();



       finallyID = container.get(position);

            final Intent intent;





            bundle.putString("id", finallyID);


            intent = new Intent(this, StartFragmentActivity.class);
            intent.putExtras(bundle);   // wkladamy nasze dane do Intentu
             startActivity(intent);




    }


    public void pressedExit(View view) {

        finish();
    }
}
