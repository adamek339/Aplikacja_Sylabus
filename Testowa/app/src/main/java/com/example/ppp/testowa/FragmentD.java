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
public class FragmentD extends Fragment {


    public FragmentD() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewD = inflater.inflate(R.layout.fragment_d, container, false);
        int numberOfModule;

        ArrayList<String> data = new ArrayList<String>();
        ArrayList<Integer> number = new ArrayList<Integer>();




        data = getArguments().getStringArrayList("listaFragD");
        number =getArguments().getIntegerArrayList("ileFragD");

        numberOfModule = number.get(0);

        String courseA ="";
        String descContentsA ="";
        String basicLitA ="";
        String exteLitA ="";


        String courseB ="";
        String descContentsB ="";
        String basicLitB ="";
        String exteLitB ="";

        String courseC ="";
        String descContentsC ="";
        String basicLitC ="";
        String exteLitC ="";

        String courseD ="";
        String descContentsD ="";
        String basicLitD ="";
        String exteLitD ="";

        String courseE ="";
        String descContentsE ="";
        String basicLitE ="";
        String exteLitE ="";



        TextView ECourseA = (TextView) viewD.findViewById(R.id.CourseAB);
        TextView EDescContentsA = (TextView) viewD.findViewById(R.id.descContentsAB);
        TextView EBasicLitA = (TextView) viewD.findViewById(R.id.basicLitAB);
        TextView EExteLitA = (TextView) viewD.findViewById(R.id.exteLitAB);

        TextView ECourseB = (TextView) viewD.findViewById(R.id.CourseBB);
        TextView EDescContentsB = (TextView) viewD.findViewById(R.id.descContentsBB);
        TextView EBasicLitB = (TextView) viewD.findViewById(R.id.basicLitBB);
        TextView EExteLitB = (TextView) viewD.findViewById(R.id.exteLitBB);

        TextView ECourseC = (TextView) viewD.findViewById(R.id.CourseCB);
        TextView EDescContentsC = (TextView) viewD.findViewById(R.id.descContentsCB);
        TextView EBasicLitC = (TextView) viewD.findViewById(R.id.basicLitCB);
        TextView EExteLitC = (TextView) viewD.findViewById(R.id.exteLitCB);

        TextView ECourseD = (TextView) viewD.findViewById(R.id.CourseDB);
        TextView EDescContentsD = (TextView) viewD.findViewById(R.id.descContentsDB);
        TextView EBasicLitD = (TextView) viewD.findViewById(R.id.basicLitDB);
        TextView EExteLitD = (TextView) viewD.findViewById(R.id.exteLitDB);

        TextView ECourseE = (TextView) viewD.findViewById(R.id.CourseEB);
        TextView EDescContentsE = (TextView) viewD.findViewById(R.id.descContentsEB);
        TextView EBasicLitE = (TextView) viewD.findViewById(R.id.basicLitEB);
        TextView EExteLitE = (TextView) viewD.findViewById(R.id.exteLitEB);



        if(numberOfModule ==1){

            courseA = data.get(0);
            descContentsA = data.get(1);
            basicLitA = data.get(2);
            exteLitA = data.get(3);

            ECourseA.setText(courseA);
            EDescContentsA.setText(descContentsA);
            EBasicLitA.setText(basicLitA);
            EExteLitA.setText(exteLitA);

            ECourseB.setText(courseB);
            EDescContentsB.setText(descContentsB);
            EBasicLitB.setText(basicLitB);
            EExteLitB.setText(exteLitB);

            ECourseC.setText(courseC);
            EDescContentsC.setText(descContentsC);
            EBasicLitC.setText(basicLitC);
            EExteLitC.setText(exteLitC);

            ECourseD.setText(courseD);
            EDescContentsD.setText(descContentsD);
            EBasicLitD.setText(basicLitD);
            EExteLitD.setText(exteLitD);

            ECourseE.setText(courseE);
            EDescContentsE.setText(descContentsE);
            EBasicLitE.setText(basicLitE);
            EExteLitE.setText(exteLitE);



        }



        if(numberOfModule ==2){

            courseA = data.get(0);
            descContentsA = data.get(1);
            basicLitA = data.get(2);
            exteLitA = data.get(3);


            courseB = data.get(4);
            descContentsB = data.get(5);
            basicLitB = data.get(6);
            exteLitB = data.get(7);

            ECourseA.setText(courseA);
            EDescContentsA.setText(descContentsA);
            EBasicLitA.setText(basicLitA);
            EExteLitA.setText(exteLitA);

            ECourseB.setText(courseB);
            EDescContentsB.setText(descContentsB);
            EBasicLitB.setText(basicLitB);
            EExteLitB.setText(exteLitB);

            ECourseC.setText(courseC);
            EDescContentsC.setText(descContentsC);
            EBasicLitC.setText(basicLitC);
            EExteLitC.setText(exteLitC);

            ECourseD.setText(courseD);
            EDescContentsD.setText(descContentsD);
            EBasicLitD.setText(basicLitD);
            EExteLitD.setText(exteLitD);

            ECourseE.setText(courseE);
            EDescContentsE.setText(descContentsE);
            EBasicLitE.setText(basicLitE);
            EExteLitE.setText(exteLitE);



        }




        if(numberOfModule ==3){

            courseA = data.get(0);
            descContentsA = data.get(1);
            basicLitA = data.get(2);
            exteLitA = data.get(3);


            courseB = data.get(4);
            descContentsB = data.get(5);
            basicLitB = data.get(6);
            exteLitB = data.get(7);


            courseC = data.get(8);
            descContentsC = data.get(9);
            basicLitC = data.get(10);
            exteLitC = data.get(11);

            ECourseA.setText(courseA);
            EDescContentsA.setText(descContentsA);
            EBasicLitA.setText(basicLitA);
            EExteLitA.setText(exteLitA);

            ECourseB.setText(courseB);
            EDescContentsB.setText(descContentsB);
            EBasicLitB.setText(basicLitB);
            EExteLitB.setText(exteLitB);

            ECourseC.setText(courseC);
            EDescContentsC.setText(descContentsC);
            EBasicLitC.setText(basicLitC);
            EExteLitC.setText(exteLitC);

            ECourseD.setText(courseD);
            EDescContentsD.setText(descContentsD);
            EBasicLitD.setText(basicLitD);
            EExteLitD.setText(exteLitD);

            ECourseE.setText(courseE);
            EDescContentsE.setText(descContentsE);
            EBasicLitE.setText(basicLitE);
            EExteLitE.setText(exteLitE);



        }




        if(numberOfModule ==4){

            courseA = data.get(0);
            descContentsA = data.get(1);
            basicLitA = data.get(2);
            exteLitA = data.get(3);


            courseB = data.get(4);
            descContentsB = data.get(5);
            basicLitB = data.get(6);
            exteLitB = data.get(7);


            courseC = data.get(8);
            descContentsC = data.get(9);
            basicLitC = data.get(10);
            exteLitC = data.get(11);



            courseD = data.get(12);
            descContentsD = data.get(13);
            basicLitD = data.get(14);
            exteLitD = data.get(15);

            ECourseA.setText(courseA);
            EDescContentsA.setText(descContentsA);
            EBasicLitA.setText(basicLitA);
            EExteLitA.setText(exteLitA);

            ECourseB.setText(courseB);
            EDescContentsB.setText(descContentsB);
            EBasicLitB.setText(basicLitB);
            EExteLitB.setText(exteLitB);

            ECourseC.setText(courseC);
            EDescContentsC.setText(descContentsC);
            EBasicLitC.setText(basicLitC);
            EExteLitC.setText(exteLitC);

            ECourseD.setText(courseD);
            EDescContentsD.setText(descContentsD);
            EBasicLitD.setText(basicLitD);
            EExteLitD.setText(exteLitD);

            ECourseE.setText(courseE);
            EDescContentsE.setText(descContentsE);
            EBasicLitE.setText(basicLitE);
            EExteLitE.setText(exteLitE);



        }



        if(numberOfModule ==5){

            courseA = data.get(0);
            descContentsA = data.get(1);
            basicLitA = data.get(2);
            exteLitA = data.get(3);


            courseB = data.get(4);
            descContentsB = data.get(5);
            basicLitB = data.get(6);
            exteLitB = data.get(7);


            courseC = data.get(8);
            descContentsC = data.get(9);
            basicLitC = data.get(10);
            exteLitC = data.get(11);



            courseD = data.get(12);
            descContentsD = data.get(13);
            basicLitD = data.get(14);
            exteLitD = data.get(15);

            courseE = data.get(16);
            descContentsE = data.get(17);
            basicLitE = data.get(18);
            exteLitE = data.get(19);

            ECourseA.setText(courseA);
            EDescContentsA.setText(descContentsA);
            EBasicLitA.setText(basicLitA);
            EExteLitA.setText(exteLitA);

            ECourseB.setText(courseB);
            EDescContentsB.setText(descContentsB);
            EBasicLitB.setText(basicLitB);
            EExteLitB.setText(exteLitB);

            ECourseC.setText(courseC);
            EDescContentsC.setText(descContentsC);
            EBasicLitC.setText(basicLitC);
            EExteLitC.setText(exteLitC);

            ECourseD.setText(courseD);
            EDescContentsD.setText(descContentsD);
            EBasicLitD.setText(basicLitD);
            EExteLitD.setText(exteLitD);

            ECourseE.setText(courseE);
            EDescContentsE.setText(descContentsE);
            EBasicLitE.setText(basicLitE);
            EExteLitE.setText(exteLitE);


            ECourseE.setText(courseE);
            EDescContentsE.setText(descContentsE);
            EBasicLitE.setText(basicLitE);
            EExteLitE.setText(exteLitE);



        }










       // return inflater.inflate(R.layout.fragment_d, container, false);
        return viewD;
    }

}
