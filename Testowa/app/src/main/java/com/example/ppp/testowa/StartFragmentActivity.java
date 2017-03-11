package com.example.ppp.testowa;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

   // klasa odpowiedzialna za pobieranie danych
public  class StartFragmentActivity extends FragmentActivity {

    public MyAdapter adapter = new MyAdapter(getSupportFragmentManager());
    public MyAdapter adapterB = new MyAdapter(getSupportFragmentManager());
    public MyAdapter adapterC = new MyAdapter(getSupportFragmentManager());
    public MyAdapter adapterCW = new MyAdapter(getSupportFragmentManager());
    public MyAdapter adapterCU = new MyAdapter(getSupportFragmentManager());
    public MyAdapter adapterCK = new MyAdapter(getSupportFragmentManager());
    public MyAdapter adapterD = new MyAdapter(getSupportFragmentManager());
    public MyAdapter adapterE = new MyAdapter(getSupportFragmentManager());
    public MyAdapter adapterF = new MyAdapter(getSupportFragmentManager());
    public MyAdapter adapterG = new MyAdapter(getSupportFragmentManager());
    public MyAdapter adapterH = new MyAdapter(getSupportFragmentManager());






    ViewPager viewPager;
    Connect connect;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_fragment);


        connect = new Connect();
        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));





        Bundle getData = getIntent().getExtras();

        String dataBaseID = getData.getString("id");


        try {


        adapter.setList(selectDescriptionEducationModule(dataBaseID));
       } catch (SQLException e) {
           e.printStackTrace();
       }
        ///////////////////////////////////////////////////


        try {

            adapterB.setList(selectScopeRequirements(dataBaseID));
        } catch (SQLException e) {
            e.printStackTrace();
        }


        /////////////////////////////////////////////
        try {
            adapterCW.setList(selectKnowledgeC(dataBaseID));
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try {
            adapterCU.setList(selectSkillsC(dataBaseID));
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try {
            adapterCK.setList(selectCompetencesC(dataBaseID));
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try {
            adapterC.setNumber(countEducationEffectsOfModule(dataBaseID));
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try {
            adapterD.setList(selectEducationContent(dataBaseID));
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try {
            adapterD.setNumber(countModule(dataBaseID));
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try {
            adapterE.setList(selectMethodAndFormOfSchoolwork(dataBaseID));
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try {
            adapterF.setList(selectMethodOfVerification(dataBaseID));
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try {
            adapterG.setList(selectMethodofMakeMarks(dataBaseID));
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try {
            adapterH.setList(selectHoursAndECTS(dataBaseID));
        } catch (SQLException e) {
            e.printStackTrace();
        }







    }


    public ArrayList<String> selectDescriptionEducationModule(String id) throws SQLException {

        ArrayList<String> container = new ArrayList<String>();

        String moduleName ="";
        String department="";
        String field ="";
        String moduleCode ="";
        String profile ="";
        String form ="";
        String categoryOfModule ="";
        String Semester="";
        String languageOfLecture ="";
        String ISCD="";
        String name="";
        String surname="";






        Connection con = connect.CONN();

        String query = "SELECT        [IDsylabus], [Nazwa], [Nazwa_wydzialu], [Kierunek], [Kod], [Profil], [Forma_studiow], [Kategoria],[Semestr], [Jezyk],[ISCED/ESAC], [Imie], [Nazwisko], [Stopien]\n" +
                "\n" +
                "FROM            Sylabus INNER JOIN\n" +
                "                         Nazwa_modulu ON Sylabus.IDnazwa_modulu = Nazwa_modulu.IDnazwa_modulu INNER JOIN\n" +
                "                         Wydzial ON Sylabus.IDnazwa_jednostki_prowadzacej = Wydzial.IDwydzial INNER JOIN\n" +
                "                         Kierunek_studiow ON Sylabus.IDkierunek_studiow = Kierunek_studiow.IDkierunek_studiow INNER JOIN\n" +
                "                         Kod_modulu ON Sylabus.IDkod_modulu = Kod_modulu.IDkod_modulu INNER JOIN\n" +
                "                         Profil ON Sylabus.IDprofil = Profil.IDprofil INNER JOIN\n" +
                "                         Forma_studiow ON Sylabus.IDforma_studiow = Forma_studiow.IDforma_studiow INNER JOIN\n" +
                "                         Kategoria_modulu ON Sylabus.IDkategoria_modulu = Kategoria_modulu.IDkategoria_modulu INNER JOIN\n" +
                "                         Jezyk_wykladowy ON Sylabus.IDjezyk_wykladowy = Jezyk_wykladowy.IDjezyk_wykladowy INNER JOIN\n" +
                "                         Wykladowca ON Sylabus.IDwykladowca = Wykladowca.IDwykladowca \n" +
                "\t\t\t\t\t\t where IDsylabus='" + id + "'";


        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {


            moduleName =rs.getString("Nazwa");
            department=rs.getString("Nazwa_wydzialu");
            field =rs.getString("Kierunek");
            moduleCode =rs.getString("Kod");
            profile =rs.getString("Profil");
            form =rs.getString("Forma_studiow");
            categoryOfModule =rs.getString("Kategoria");
            Semester=rs.getString("Semestr");
            languageOfLecture =rs.getString("Jezyk");
            ISCD=rs.getString("ISCED/ESAC");
            name=rs.getString("Imie");
            surname=rs.getString("nazwisko");


        }

        container.add(moduleName);
        container.add(department);
        container.add(field);
        container.add(moduleCode);
        container.add(profile);
        container.add(form);
        container.add(categoryOfModule);
        container.add(Semester);
        container.add(languageOfLecture);
        container.add(ISCD);
        container.add(name);
        container.add(surname);

        return container;
    }

    public ArrayList<String> selectScopeRequirements(String id) throws SQLException {
       String scope ="";
        String requirements ="";

        Connection con = connect.CONN();
        String query = "SELECT Cel_ogolny_modulu, Wymagania_formalne_wstepne FROM Sylabus where IDsylabus = '"+id+"'";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        ArrayList<String> container = new ArrayList<String>();
        while (rs.next()) {

            scope = rs.getString("Cel_ogolny_modulu");
            requirements =rs.getString("Wymagania_formalne_wstepne");

            container.add(scope);
            container.add(requirements);


}

     return container;
     }





    public ArrayList<String> selectKnowledgeC(String id) throws SQLException {

        String symEffectMod ="";
        String educationEffects ="";
        String symEducatEffects ="";
        String type ="";
        String formula ="1";

        Connection con = connect.CONN();
        String query="SELECT       IDtyp, Sylabus.IDsylabus, Nazwa_modulu.Nazwa, Wydzial.Nazwa_wydzialu, Kierunek_studiow.Kierunek, Efekt_ksztalcenia_modulu.Symbol, \n" +
                "              Efekt_ksztalcenia_modulu.Opis, Efekt_ksztalcenia_modulu.Symbol_efektu_modulu\n" +
                "\n" +
                "FROM            Sylabus INNER JOIN\n" +
                "                         Nazwa_modulu ON Sylabus.IDnazwa_modulu = Nazwa_modulu.IDnazwa_modulu INNER JOIN\n" +
                "\t\t\t\t\t\t Wydzial ON Sylabus.IDnazwa_jednostki_prowadzacej = Wydzial.IDwydzial INNER JOIN\n" +
                "                         Kierunek_studiow ON Sylabus.IDkierunek_studiow = Kierunek_studiow.IDkierunek_studiow INNER JOIN\n" +
                "                         Kod_modulu ON Sylabus.IDkod_modulu = Kod_modulu.IDkod_modulu INNER JOIN\n" +
                "                         Efekt_ksztalcenia_modulu ON Sylabus.IDsylabus = Efekt_ksztalcenia_modulu.IDsylabus \n" +
                "\t\t\t\t\t\t where Sylabus.IDSylabus= '"+id+"'";

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        ArrayList<String> container = new ArrayList<String>();
        while (rs.next()) {
            type = rs.getString("IDtyp");

            if(type.equals(formula)) {

                symEffectMod = rs.getString("Symbol");
                educationEffects = rs.getString("Opis");
                symEducatEffects = rs.getString("Symbol_efektu_modulu");

                container.add(symEffectMod);
                container.add(educationEffects);
                container.add(symEducatEffects);
            }

        }



        return container;

    }






    public ArrayList<String> selectSkillsC(String id) throws SQLException {

        String symEffectMod ="";
        String educationEffects ="";
        String symEducatEffects ="";
        String type ="";
        String formula ="2";




        Connection con = connect.CONN();
        String query="SELECT       IDtyp, Sylabus.IDsylabus, Nazwa_modulu.Nazwa, Wydzial.Nazwa_wydzialu, Kierunek_studiow.Kierunek, Efekt_ksztalcenia_modulu.Symbol, \n" +
                "              Efekt_ksztalcenia_modulu.Opis, Efekt_ksztalcenia_modulu.Symbol_efektu_modulu\n" +
                "\n" +
                "FROM            Sylabus INNER JOIN\n" +
                "                         Nazwa_modulu ON Sylabus.IDnazwa_modulu = Nazwa_modulu.IDnazwa_modulu INNER JOIN\n" +
                "\t\t\t\t\t\t Wydzial ON Sylabus.IDnazwa_jednostki_prowadzacej = Wydzial.IDwydzial INNER JOIN\n" +
                "                         Kierunek_studiow ON Sylabus.IDkierunek_studiow = Kierunek_studiow.IDkierunek_studiow INNER JOIN\n" +
                "                         Kod_modulu ON Sylabus.IDkod_modulu = Kod_modulu.IDkod_modulu INNER JOIN\n" +
                "                         Efekt_ksztalcenia_modulu ON Sylabus.IDsylabus = Efekt_ksztalcenia_modulu.IDsylabus \n" +
                "\t\t\t\t\t\t where Sylabus.IDSylabus= '"+id+"'";

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        ArrayList<String> container = new ArrayList<String>();
        while (rs.next()) {
            type = rs.getString("IDtyp");

            if(type.equals(formula)) {

                symEffectMod = rs.getString("Symbol");
                educationEffects = rs.getString("Opis");
                symEducatEffects = rs.getString("Symbol_efektu_modulu");

                container.add(symEffectMod);
                container.add(educationEffects);
                container.add(symEducatEffects);
            }

        }



        return container;

    }







    public ArrayList<String> selectCompetencesC(String id) throws SQLException {

        String symEffectMod ="";
        String educationEffects ="";
        String symEducatEffects ="";
        String type ="";
        String formula ="3";

        Connection con = connect.CONN();
        String query="SELECT       IDtyp, Sylabus.IDsylabus, Nazwa_modulu.Nazwa, Wydzial.Nazwa_wydzialu, Kierunek_studiow.Kierunek, Efekt_ksztalcenia_modulu.Symbol, \n" +
                "              Efekt_ksztalcenia_modulu.Opis, Efekt_ksztalcenia_modulu.Symbol_efektu_modulu\n" +
                "\n" +
                "FROM            Sylabus INNER JOIN\n" +
                "                         Nazwa_modulu ON Sylabus.IDnazwa_modulu = Nazwa_modulu.IDnazwa_modulu INNER JOIN\n" +
                "\t\t\t\t\t\t Wydzial ON Sylabus.IDnazwa_jednostki_prowadzacej = Wydzial.IDwydzial INNER JOIN\n" +
                "                         Kierunek_studiow ON Sylabus.IDkierunek_studiow = Kierunek_studiow.IDkierunek_studiow INNER JOIN\n" +
                "                         Kod_modulu ON Sylabus.IDkod_modulu = Kod_modulu.IDkod_modulu INNER JOIN\n" +
                "                         Efekt_ksztalcenia_modulu ON Sylabus.IDsylabus = Efekt_ksztalcenia_modulu.IDsylabus \n" +
                "\t\t\t\t\t\t where Sylabus.IDSylabus= '"+id+"'";

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        ArrayList<String> container = new ArrayList<String>();
        while (rs.next()) {
            type = rs.getString("IDtyp");

            if(type.equals(formula)) {

                symEffectMod = rs.getString("Symbol");
                educationEffects = rs.getString("Opis");
                symEducatEffects = rs.getString("Symbol_efektu_modulu");

                container.add(symEffectMod);
                container.add(educationEffects);
                container.add(symEducatEffects);
            }

        }



        return container;

    }


    public ArrayList<Integer> countEducationEffectsOfModule(String id) throws SQLException {
        ArrayList<Integer> container = new ArrayList<Integer>();
        String type;
        Connection con = connect.CONN();
        String query="SELECT       IDtyp, Sylabus.IDsylabus, Nazwa_modulu.Nazwa, Wydzial.Nazwa_wydzialu, Kierunek_studiow.Kierunek, Efekt_ksztalcenia_modulu.Symbol, \n" +
                "              Efekt_ksztalcenia_modulu.Opis, Efekt_ksztalcenia_modulu.Symbol_efektu_modulu\n" +
                "\n" +
                "FROM            Sylabus INNER JOIN\n" +
                "                         Nazwa_modulu ON Sylabus.IDnazwa_modulu = Nazwa_modulu.IDnazwa_modulu INNER JOIN\n" +
                "\t\t\t\t\t\t Wydzial ON Sylabus.IDnazwa_jednostki_prowadzacej = Wydzial.IDwydzial INNER JOIN\n" +
                "                         Kierunek_studiow ON Sylabus.IDkierunek_studiow = Kierunek_studiow.IDkierunek_studiow INNER JOIN\n" +
                "                         Kod_modulu ON Sylabus.IDkod_modulu = Kod_modulu.IDkod_modulu INNER JOIN\n" +
                "                         Efekt_ksztalcenia_modulu ON Sylabus.IDsylabus = Efekt_ksztalcenia_modulu.IDsylabus \n" +
                "\t\t\t\t\t\t where Sylabus.IDSylabus= '"+id+"'";

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
int counterKnowledge =0;
int counterSkills =0;
int counterCompetences =0;

String type1 ="1";
String type2 ="2";
String type3 ="3";


        while (rs.next()) {
            type = rs.getString("IDtyp");

       if(type.equals(type1)){
           counterKnowledge++;

       }

            else if(type.equals(type2)){

           counterSkills++;
       }


            else if(type.equals(type3)){
           counterCompetences++;
       }






        }

        container.add(counterKnowledge);
        container.add(counterSkills);
        container.add(counterCompetences);

        return container;
    }





    public ArrayList<String> selectEducationContent(String id) throws SQLException {

        String course ="";
        String decEducCont ="";
        String basicLit ="";
        String extendedLit ="";



        Connection con = connect.CONN();
        String query = "SELECT        Nr_nazwa_kursu, Opis_tresci_ksztalcenia, Literatura_podstawowa, Literatura_dodatkowa\n" +
                "FROM            Kurs WHERE IDSylabus = '"+id+"'";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        ArrayList<String> container = new ArrayList<String>();
        while (rs.next()) {

            course = rs.getString("Nr_nazwa_kursu");
            decEducCont =rs.getString("Opis_tresci_ksztalcenia");
            basicLit = rs.getString("Literatura_podstawowa");
            extendedLit = rs.getString("Literatura_dodatkowa");

            container.add(course);
            container.add(decEducCont);
            container.add(basicLit);
            container.add(extendedLit);


        }
        return container;
    }


    public ArrayList<String> selectMethodAndFormOfSchoolwork(String id) throws SQLException {

        String educationMethod ="";
        String formName ="";
        String numberOfHours ="";
        String name="";
        String surname="";
        Connection con = connect.CONN();
        ArrayList<String> container = new ArrayList<String>();
        String query="SELECT        Kurs.Metody_dydaktyczne, Forma_zajec.Nazwa_formy, Kurs.Liczba_godzin, Wykladowca.Imie, Wykladowca.Nazwisko\n" +
                "FROM            Kurs INNER JOIN\n" +
                "                         Forma_zajec ON Kurs.IDforma_zajec = Forma_zajec.IDforma_zajec INNER JOIN\n" +
                "                         Wykladowca ON Kurs.IDwykladowca = Wykladowca.IDwykladowca WHERE IDSylabus = '"+id+"'";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {

            educationMethod = rs.getString("Metody_dydaktyczne");
            formName =rs.getString("Nazwa_formy");
            numberOfHours = rs.getString("Liczba_godzin");
            name= rs.getString("Imie");
            surname=rs.getString("Nazwisko");

            container.add(educationMethod);
            container.add(formName);
            container.add(numberOfHours);
            container.add(name);
            container.add(surname);


        }


        return container;
    }


    public ArrayList<Integer> countModule(String id) throws SQLException {
        ArrayList<Integer> container = new ArrayList<Integer>();
        String module;
        String query = "SELECT        Nr_nazwa_kursu, Opis_tresci_ksztalcenia, Literatura_podstawowa, Literatura_dodatkowa\n" +
                "FROM            Kurs WHERE IDSylabus = '"+id+"'";
        Connection con = connect.CONN();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

  int counterModule =0;



        while (rs.next()) {
            module = rs.getString("Nr_nazwa_kursu");

                counterModule++;


        }

      container.add(counterModule);
        return container;
    }



    public ArrayList<String> selectMethodOfVerification(String id) throws SQLException {


        String evaluatingMethod ="";
        String ratedModEffect ="";
        String scalingMarks ="";


        Connection con = connect.CONN();
        ArrayList<String> container = new ArrayList<String>();

       String query="SELECT        Sposob_oceny, Oceniane_efekty_modulu, Skalowanie_ocen\n" +
               "FROM            Kurs where IDSylabus ='"+id+"'";


        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);


        while (rs.next()) {
            evaluatingMethod = rs.getString("Sposob_oceny");
            ratedModEffect =rs.getString("Oceniane_efekty_modulu");
            scalingMarks =rs.getString("Skalowanie_ocen");

            container.add(evaluatingMethod);
            container.add(ratedModEffect);
            container.add(scalingMarks);


        }




        return container;
    }



///////////////////////////////////////////////////////////////////////////////////////////////////////


    public ArrayList<String> selectMethodofMakeMarks(String id) throws SQLException {


        String method ="";

        Connection con = connect.CONN();
        ArrayList<String> container = new ArrayList<String>();


        String query="SELECT Sposob_powstania_oceny from Sylabus where IDsylabus = '"+id+"'";


        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);


        while (rs.next()) {
            method = rs.getString("Sposob_powstania_oceny");


        container.add(method);

        }



        return container;
    }




    public ArrayList<String> selectHoursAndECTS(String id) throws SQLException {


        String hours ="";
        String ECTS=" ";

        Connection con = connect.CONN();
        ArrayList<String> container = new ArrayList<String>();


        String query=" SELECT        Kategoria_zajec.Nazwa, Bilans_ECTS.Godziny, Bilans_ECTS.ECTS\n" +
                "FROM            Bilans_ECTS INNER JOIN\n" +
                "                         Kategoria_zajec ON Bilans_ECTS.IDkategoria_zajec = Kategoria_zajec.IDkategoria_zajec\n" +
                "\t\t\t\t\t\t where IDsylabus ='"+id+"'";


        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);


        while (rs.next()) {
            hours = rs.getString("Godziny");
            ECTS=rs.getString("ECTS");

            container.add(hours);
            container.add(ECTS);

        }



        return container;
    }




    /////////////////////////////////////////////////////////////////////////////////////////////////////////


    // klasa MyAdapter odpowiedzialna jest za zarządzanie fragmentami i dane z obiektów tej klasy
    //  są w metodzie   getItem przesyłane do konkretnego fragmentu.

    class MyAdapter extends FragmentPagerAdapter {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> number = new ArrayList<>();


        public MyAdapter(FragmentManager fm) {

            super(fm);

        }


        public void setList(ArrayList<String> list) {

            this.list = list;

        }


        public ArrayList<String> getList() {

            return this.list;
        }


        public void setNumber(ArrayList<Integer> number){
            this.number = number;
        }

        public ArrayList<Integer> getNumber() {
            return this.number;
        }

        @Override
        public Fragment getItem(int arg0) {

            Fragment fragment = null;

            if (arg0 == 0) {

                fragment = new FragmentA();


                ArrayList<String> listFragA = new ArrayList<String>();
                listFragA.addAll(adapter.getList());
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("listaFragA",listFragA);
                fragment.setArguments(bundle);

            }

            if (arg0 == 1) {

                fragment = new FragmentB();
                ArrayList<String> listFragB = new ArrayList<String>();
                listFragB.addAll(adapterB.getList());
                Bundle bundle1 = new Bundle();
                bundle1.putStringArrayList("listaFragB",listFragB);
                fragment.setArguments(bundle1);



            }


            if (arg0 == 2) {

                fragment = new FragmentC();
                ArrayList<String> listKnowledge = new ArrayList<String>();
                ArrayList<String> listSkills = new ArrayList<String>();
                ArrayList<String> listCompetences = new ArrayList<String>();
                ArrayList<Integer> number = new ArrayList<Integer>();

                listKnowledge.addAll(adapterCW.getList());
                listSkills.addAll(adapterCU.getList());
                listCompetences.addAll(adapterCK.getList());
                number.addAll(adapterC.getNumber());


                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("listaWiedz",listKnowledge);
                bundle2.putStringArrayList("listaUmiej",listSkills);
                bundle2.putStringArrayList("listaKomp",listCompetences);
                bundle2.putIntegerArrayList("ileFragC",number);
                fragment.setArguments(bundle2);


            }
            if(arg0==3){
                fragment=new FragmentD();
                ArrayList<String> listFragD = new ArrayList<String>();
                ArrayList<Integer> numberOfModule = new ArrayList<Integer>();

                listFragD.addAll(adapterD.getList());
                numberOfModule.addAll(adapterD.getNumber());


                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("listaFragD",listFragD);
                bundle2.putIntegerArrayList("ileFragD", numberOfModule);
                fragment.setArguments(bundle2);

            }
            if(arg0==4){
                fragment=new FragmentE();

                ArrayList<String> listFragE = new ArrayList<String>();
                ArrayList<Integer> numberOfModule = new ArrayList<Integer>();
                listFragE.addAll(adapterE.getList());
                numberOfModule.addAll(adapterD.getNumber());

                 Bundle bundle1= new Bundle();
                bundle1.putStringArrayList("ListaFragE", listFragE);
                bundle1.putIntegerArrayList("ileFragE", numberOfModule);

                fragment.setArguments(bundle1);

            }

            if(arg0==5){
                fragment=new FragmentF();
                ArrayList<String> listFragF =new ArrayList<String>();
                ArrayList<Integer> number =new ArrayList<Integer>();
                listFragF.addAll(adapterF.getList());
                number.addAll(adapterD.getNumber());

                Bundle bundle1= new Bundle();
                bundle1.putStringArrayList("ListaFragF", listFragF);
                bundle1.putIntegerArrayList("IleFragF", number);

                fragment.setArguments(bundle1);





            }
            if(arg0==6){
                fragment=new FragmentG();


                ArrayList<String> listFragG =new ArrayList<String>();
                listFragG.addAll(adapterG.getList());
                Bundle bundle1= new Bundle();
                bundle1.putStringArrayList("ListaFragG", listFragG);


                fragment.setArguments(bundle1);
            }
            if(arg0==7){
                fragment=new FragmentH();
                ArrayList<String> listFragH =new ArrayList<String>();
                listFragH.addAll(adapterH.getList());

            Bundle bundle1= new Bundle();


                bundle1.putStringArrayList("ListaFragH", listFragH);
                fragment.setArguments(bundle1);

            }














            return fragment;
        }

        @Override
        public int getCount() {
            return 8;
        }
    }
}