package com.example.ppp.testowa;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentE extends Fragment {


    public FragmentE() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewE = inflater.inflate(R.layout.fragment_e, container, false);

         int numberOfModules;
        ArrayList<String> data = new ArrayList<String>();
        ArrayList<Integer> number = new ArrayList<Integer>();  // how many modules is in the sylabus
        data = getArguments().getStringArrayList("ListaFragE");
        number =getArguments().getIntegerArrayList("ileFragE");


        numberOfModules = number.get(0);



        String educMethA ="";
        String formOfClassA ="";
        String numberOfHoursA ="";
        String nameA ="";
        String surnameA ="";
        String space=" ";
        String teacherA="";

        String educMethB ="";
        String formOfClassB ="";
        String numberOfHoursB ="";
        String nameB ="";
        String surnameB ="";
        String teacherB="";

        String educMethC ="";
        String formOfClassC ="";
        String numberOfHoursC ="";
        String nameC ="";
        String surnameC ="";
        String teacherC="";

        String educMethD ="";
        String formOfClassD ="";
        String numberOfHoursD ="";
        String nameD ="";
        String surnameD ="";
        String teacherD="";

        String educMethE ="";
        String formOfClassE ="";
        String numberOfHoursE ="";
        String nameE ="";
        String surnameE ="";
        String teacherE="";


        TextView EEducMethA = (TextView) viewE.findViewById(R.id.EducMethAB);
        TextView EFormOfClassA = (TextView) viewE.findViewById(R.id.formOfClassAB);
        TextView ENumberOfHoursA = (TextView) viewE.findViewById(R.id.numberOfHourseAB);
        TextView ENameA = (TextView) viewE.findViewById(R.id.nameAB);
        TextView ESurnameA = (TextView) viewE.findViewById(R.id.surnameAB);

        TextView EEducMethB = (TextView) viewE.findViewById(R.id.EducMethBB);
        TextView EFormOfClassB = (TextView) viewE.findViewById(R.id.formOfClassBB);
        TextView ENumberOfHoursB = (TextView) viewE.findViewById(R.id.numberOfHourseBB);
        TextView ENameB = (TextView) viewE.findViewById(R.id.nameBB);
        TextView ESurnameB = (TextView) viewE.findViewById(R.id.surnameBB);


        TextView EEducMethC = (TextView) viewE.findViewById(R.id.EducMethCB);
        TextView EFormOfClassC = (TextView) viewE.findViewById(R.id.formOfClassCB);
        TextView ENumberOfHoursC = (TextView) viewE.findViewById(R.id.numberOfHourseCB);
        TextView ENameC = (TextView) viewE.findViewById(R.id.nameCB);
        TextView ESurnameC = (TextView) viewE.findViewById(R.id.surnameCB);



        TextView EEducMethD = (TextView) viewE.findViewById(R.id.EducMethDB);
        TextView EFormOfClassD = (TextView) viewE.findViewById(R.id.formOfClassDB);
        TextView ENumberOfHoursD = (TextView) viewE.findViewById(R.id.numberOfHourseDB);
        TextView ENameD = (TextView) viewE.findViewById(R.id.nameDB);
        TextView ESurnameD = (TextView) viewE.findViewById(R.id.surnameDB);



        TextView EEducMethE = (TextView) viewE.findViewById(R.id.EducMethEB);
        TextView EFormOfClassE = (TextView) viewE.findViewById(R.id.formOfClassEB);
        TextView ENumberOfHoursE = (TextView) viewE.findViewById(R.id.numberOfHourseEB);
        TextView ENameE = (TextView) viewE.findViewById(R.id.nameEB);
        TextView ESurnameE = (TextView) viewE.findViewById(R.id.SurnameEB);





        if(numberOfModules ==1){

            educMethA = data.get(0);
            formOfClassA = data.get(1);
            numberOfHoursA = data.get(2);
            nameA = data.get(3);
            surnameA = data.get(4);
            teacherA=nameA+space+surnameA;





            EEducMethA.setText(educMethA);
            EFormOfClassA.setText(formOfClassA);
            ENumberOfHoursA.setText(numberOfHoursA);
            ENameA.setText(teacherA);
            //ESurnameA.setText(surnameA);

            EEducMethB.setText(educMethB);
            EFormOfClassB.setText(formOfClassB);
            ENumberOfHoursB.setText(numberOfHoursB);
            ENameB.setText(nameB);
            ESurnameB.setText(surnameB);

            EEducMethC.setText(educMethC);
            EFormOfClassC.setText(formOfClassC);
            ENumberOfHoursC.setText(numberOfHoursC);
            ENameC.setText(nameC);
            ESurnameC.setText(surnameC);

            EEducMethD.setText(educMethD);
            EFormOfClassD.setText(formOfClassD);
            ENumberOfHoursD.setText(numberOfHoursD);
            ENameD.setText(nameD);
            ESurnameD.setText(surnameD);


            EEducMethE.setText(educMethE);
            EFormOfClassE.setText(formOfClassE);
            ENumberOfHoursE.setText(numberOfHoursE);
            ENameE.setText(nameE);
            ESurnameE.setText(surnameE);



        }




        if (numberOfModules ==2){


            educMethA = data.get(0);
            formOfClassA = data.get(1);
            numberOfHoursA = data.get(2);
            nameA = data.get(3);
            surnameA = data.get(4);
            teacherA=nameA+space+surnameA;

            educMethB = data.get(5);
            formOfClassB = data.get(6);
            numberOfHoursB = data.get(7);
            nameB = data.get(8);
            surnameB = data.get(9);
            teacherB=nameB+space+surnameB;

            EEducMethA.setText(educMethA);
            EFormOfClassA.setText(formOfClassA);
            ENumberOfHoursA.setText(numberOfHoursA);
            ENameA.setText(teacherA);
          //  ESurnameA.setText(surnameA);

            EEducMethB.setText(educMethB);
            EFormOfClassB.setText(formOfClassB);
            ENumberOfHoursB.setText(numberOfHoursB);
            ENameB.setText(teacherB);
            //ESurnameB.setText(surnameB);

            EEducMethC.setText(educMethC);
            EFormOfClassC.setText(formOfClassC);
            ENumberOfHoursC.setText(numberOfHoursC);
            ENameC.setText(nameC);
            ESurnameC.setText(surnameC);

            EEducMethD.setText(educMethD);
            EFormOfClassD.setText(formOfClassD);
            ENumberOfHoursD.setText(numberOfHoursD);
            ENameD.setText(nameD);
            ESurnameD.setText(surnameD);


            EEducMethE.setText(educMethE);
            EFormOfClassE.setText(formOfClassE);
            ENumberOfHoursE.setText(numberOfHoursE);
            ENameE.setText(nameE);
            ESurnameE.setText(surnameE);
        }






        if(numberOfModules ==3){

            educMethA = data.get(0);
            formOfClassA = data.get(1);
            numberOfHoursA = data.get(2);
            nameA = data.get(3);
            surnameA = data.get(4);
            teacherA=nameA+space+surnameA;


            educMethB = data.get(5);
            formOfClassB = data.get(6);
            numberOfHoursB = data.get(7);
            nameB = data.get(8);
            surnameB = data.get(9);
            teacherB=nameB+space+surnameB;

            educMethC = data.get(10);
            formOfClassC = data.get(11);
            numberOfHoursC = data.get(12);
            nameC = data.get(13);
            surnameC = data.get(14);
            teacherC=nameC+space+surnameC;

            EEducMethA.setText(educMethA);
            EFormOfClassA.setText(formOfClassA);
            ENumberOfHoursA.setText(numberOfHoursA);
            ENameA.setText(teacherA);
            //ESurnameA.setText(surnameA);

            EEducMethB.setText(educMethB);
            EFormOfClassB.setText(formOfClassB);
            ENumberOfHoursB.setText(numberOfHoursB);
            ENameB.setText(teacherB);
            //ESurnameB.setText(surnameB);

            EEducMethC.setText(educMethC);
            EFormOfClassC.setText(formOfClassC);
            ENumberOfHoursC.setText(numberOfHoursC);
            ENameC.setText(teacherC);
            //ESurnameC.setText(surnameC);

            EEducMethD.setText(educMethD);
            EFormOfClassD.setText(formOfClassD);
            ENumberOfHoursD.setText(numberOfHoursD);
            ENameD.setText(nameD);
            ESurnameD.setText(surnameD);


            EEducMethE.setText(educMethE);
            EFormOfClassE.setText(formOfClassE);
            ENumberOfHoursE.setText(numberOfHoursE);
            ENameE.setText(nameE);
            ESurnameE.setText(surnameE);

        }





        if (numberOfModules ==4){


            educMethA = data.get(0);
            formOfClassA = data.get(1);
            numberOfHoursA = data.get(2);
            nameA = data.get(3);
            surnameA = data.get(4);
            teacherA=nameA+space+surnameA;


            educMethB = data.get(5);
            formOfClassB = data.get(6);
            numberOfHoursB = data.get(7);
            nameB = data.get(8);
            surnameB = data.get(9);
            teacherB=nameB+space+surnameB;

            educMethC = data.get(10);
            formOfClassC = data.get(11);
            numberOfHoursC = data.get(12);
            nameC = data.get(13);
            surnameC = data.get(14);
            teacherC=nameC+space+surnameC;

            educMethD = data.get(15);
            formOfClassD = data.get(16);
            numberOfHoursD = data.get(17);
            nameD = data.get(18);
            surnameD = data.get(19);
            teacherD=nameD+space+surnameD;

            EEducMethA.setText(educMethA);
            EFormOfClassA.setText(formOfClassA);
            ENumberOfHoursA.setText(numberOfHoursA);
            ENameA.setText(teacherA);
           // ESurnameA.setText(surnameA);

            EEducMethB.setText(educMethB);
            EFormOfClassB.setText(formOfClassB);
            ENumberOfHoursB.setText(numberOfHoursB);
            ENameB.setText(teacherB);
            //ESurnameB.setText(surnameB);

            EEducMethC.setText(educMethC);
            EFormOfClassC.setText(formOfClassC);
            ENumberOfHoursC.setText(numberOfHoursC);
            ENameC.setText(teacherC);
            //ESurnameC.setText(surnameC);

            EEducMethD.setText(educMethD);
            EFormOfClassD.setText(formOfClassD);
            ENumberOfHoursD.setText(numberOfHoursD);
            ENameD.setText(teacherD);
            //ESurnameD.setText(surnameD);


            EEducMethE.setText(educMethE);
            EFormOfClassE.setText(formOfClassE);
            ENumberOfHoursE.setText(numberOfHoursE);
            ENameE.setText(nameE);
            ESurnameE.setText(surnameE);


        }



        if (numberOfModules ==5){

            educMethA = data.get(0);
            formOfClassA = data.get(1);
            numberOfHoursA = data.get(2);
            nameA = data.get(3);
            surnameA = data.get(4);
            teacherA=nameA+space+surnameA;

            educMethB = data.get(5);
            formOfClassB = data.get(6);
            numberOfHoursB = data.get(7);
            nameB = data.get(8);
            surnameB = data.get(9);
            teacherB=nameB+space+surnameB;

            educMethC = data.get(10);
            formOfClassC = data.get(11);
            numberOfHoursC = data.get(12);
            nameC = data.get(13);
            surnameC = data.get(14);
            teacherC=nameC+space+surnameC;

            educMethD = data.get(15);
            formOfClassD = data.get(16);
            numberOfHoursD = data.get(17);
            nameD = data.get(18);
            surnameD = data.get(19);
            teacherD=nameD+space+surnameD;



            educMethE = data.get(20);
            formOfClassE = data.get(21);
            numberOfHoursE = data.get(22);
            nameE = data.get(23);
            surnameE = data.get(24);
            teacherE=nameE+space+surnameE;

            EEducMethA.setText(educMethA);
            EFormOfClassA.setText(formOfClassA);
            ENumberOfHoursA.setText(numberOfHoursA);
            ENameA.setText(teacherA);
         //   ESurnameA.setText(surnameA);

            EEducMethB.setText(educMethB);
            EFormOfClassB.setText(formOfClassB);
            ENumberOfHoursB.setText(numberOfHoursB);
            ENameB.setText(teacherB);
            //ESurnameB.setText(surnameB);

            EEducMethC.setText(educMethC);
            EFormOfClassC.setText(formOfClassC);
            ENumberOfHoursC.setText(numberOfHoursC);
            ENameC.setText(teacherC);
            //ESurnameC.setText(surnameC);

            EEducMethD.setText(educMethD);
            EFormOfClassD.setText(formOfClassD);
            ENumberOfHoursD.setText(numberOfHoursD);
            ENameD.setText(teacherD);
            //ESurnameD.setText(surnameD);


            EEducMethE.setText(educMethE);
            EFormOfClassE.setText(formOfClassE);
            ENumberOfHoursE.setText(numberOfHoursE);
            ENameE.setText(teacherE);
            //ESurnameE.setText(surnameE);




        }




        return viewE;
    }

}
