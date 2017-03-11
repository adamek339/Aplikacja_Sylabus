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
public class FragmentF extends Fragment {


    public FragmentF() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewF = inflater.inflate(R.layout.fragment_f, container, false);
        int numbersOfModule;

        ArrayList<String> data = new ArrayList<String>();
        ArrayList<Integer> number = new ArrayList<>();
        data = getArguments().getStringArrayList("ListaFragF");
        number =getArguments().getIntegerArrayList("IleFragF");
        numbersOfModule = number.get(0);

        String ratMethotsA ="";
        String ratedEffecModA ="";
        String scalingRatA ="";


        String ratMethotsB ="";
        String ratedEffecModB ="";
        String scalingRatB ="";


        String ratMethotsC ="";
        String ratedEffecModC ="";
        String scalingRatC ="";


        String ratMethotsD ="";
        String ratedEffecModD ="";
        String scalingRatD ="";


        String ratMethotsE ="";
        String ratedEffecModE ="";
        String scalingRatE ="";


        TextView ERatMethotsA = (TextView) viewF.findViewById(R.id.ratedMethotsAB);
        TextView ERatedEffecModA = (TextView) viewF.findViewById(R.id.ratedEffecModAB);
        TextView EScalingRatA = (TextView) viewF.findViewById(R.id.scalingRatAB);

        TextView ERatMethotsB = (TextView) viewF.findViewById(R.id.ratedMethotsBB);
        TextView ERatedEffecModB = (TextView) viewF.findViewById(R.id.ratedEffecModBB);
        TextView EScalingRatB = (TextView) viewF.findViewById(R.id.scalingRatBB);

        TextView ERatMethotsC = (TextView) viewF.findViewById(R.id.ratedMethotsCB);
        TextView ERatedEffecModC = (TextView) viewF.findViewById(R.id.ratedEffecModCB);
        TextView EScalingRatC = (TextView) viewF.findViewById(R.id.scalingRatCB);

        TextView ERatMethotsD = (TextView) viewF.findViewById(R.id.ratedMethotsDB);
        TextView ERatedEffecModD = (TextView) viewF.findViewById(R.id.ratedEffecModDB);
        TextView EScalingRatD = (TextView) viewF.findViewById(R.id.scalingRatDB);

        TextView ERatMethotsE = (TextView) viewF.findViewById(R.id.ratedMethotsEB);
        TextView ERatedEffecModE = (TextView) viewF.findViewById(R.id.ratedEffecModEB);
        TextView EScalingRatE = (TextView) viewF.findViewById(R.id.scalingRatEB);





if(numbersOfModule ==1){
    ratMethotsA = data.get(0);
    ratedEffecModA = data.get(1);
    scalingRatA = data.get(2);


    ERatMethotsA.setText(ratMethotsA);
    ERatedEffecModA.setText(ratedEffecModA);
    EScalingRatA.setText(scalingRatA);


    ERatMethotsB.setText(ratMethotsB);
    ERatedEffecModB.setText(ratedEffecModB);
    EScalingRatB.setText(scalingRatB);

    ERatMethotsC.setText(ratMethotsC);
    ERatedEffecModC.setText(ratedEffecModC);
    EScalingRatC.setText(scalingRatC);


    ERatMethotsD.setText(ratMethotsD);
    ERatedEffecModD.setText(ratedEffecModD);
    EScalingRatD.setText(scalingRatD);


    ERatMethotsE.setText(ratMethotsE);
    ERatedEffecModE.setText(ratedEffecModE);
    EScalingRatE.setText(scalingRatE);



}



        if (numbersOfModule ==2){



            ratMethotsA = data.get(0);
            ratedEffecModA = data.get(1);
            scalingRatA = data.get(2);



            ratMethotsB = data.get(3);
            ratedEffecModB = data.get(4);
            scalingRatB = data.get(5);

            ERatMethotsA.setText(ratMethotsA);
            ERatedEffecModA.setText(ratedEffecModA);
            EScalingRatA.setText(scalingRatA);


            ERatMethotsB.setText(ratMethotsB);
            ERatedEffecModB.setText(ratedEffecModB);
            EScalingRatB.setText(scalingRatB);

            ERatMethotsC.setText(ratMethotsC);
            ERatedEffecModC.setText(ratedEffecModC);
            EScalingRatC.setText(scalingRatC);


            ERatMethotsD.setText(ratMethotsD);
            ERatedEffecModD.setText(ratedEffecModD);
            EScalingRatD.setText(scalingRatD);


            ERatMethotsE.setText(ratMethotsE);
            ERatedEffecModE.setText(ratedEffecModE);
            EScalingRatE.setText(scalingRatE);


        }



        if (numbersOfModule ==3){


            ratMethotsA = data.get(0);
            ratedEffecModA = data.get(1);
            scalingRatA = data.get(2);



            ratMethotsB = data.get(3);
            ratedEffecModB = data.get(4);
            scalingRatB = data.get(5);


            ratMethotsC = data.get(6);
            ratedEffecModC = data.get(7);
            scalingRatC = data.get(8);

            ERatMethotsA.setText(ratMethotsA);
            ERatedEffecModA.setText(ratedEffecModA);
            EScalingRatA.setText(scalingRatA);


            ERatMethotsB.setText(ratMethotsB);
            ERatedEffecModB.setText(ratedEffecModB);
            EScalingRatB.setText(scalingRatB);

            ERatMethotsC.setText(ratMethotsC);
            ERatedEffecModC.setText(ratedEffecModC);
            EScalingRatC.setText(scalingRatC);


            ERatMethotsD.setText(ratMethotsD);
            ERatedEffecModD.setText(ratedEffecModD);
            EScalingRatD.setText(scalingRatD);


            ERatMethotsE.setText(ratMethotsE);
            ERatedEffecModE.setText(ratedEffecModE);
            EScalingRatE.setText(scalingRatE);




        }







        if (numbersOfModule ==4){

            ratMethotsA = data.get(0);
            ratedEffecModA = data.get(1);
            scalingRatA = data.get(2);



            ratMethotsB = data.get(3);
            ratedEffecModB = data.get(4);
            scalingRatB = data.get(5);


            ratMethotsC = data.get(6);
            ratedEffecModC = data.get(7);
            scalingRatC = data.get(8);



            ratMethotsD = data.get(9);
            ratedEffecModD = data.get(10);
            scalingRatD = data.get(11);

            ERatMethotsA.setText(ratMethotsA);
            ERatedEffecModA.setText(ratedEffecModA);
            EScalingRatA.setText(scalingRatA);


            ERatMethotsB.setText(ratMethotsB);
            ERatedEffecModB.setText(ratedEffecModB);
            EScalingRatB.setText(scalingRatB);

            ERatMethotsC.setText(ratMethotsC);
            ERatedEffecModC.setText(ratedEffecModC);
            EScalingRatC.setText(scalingRatC);


            ERatMethotsD.setText(ratMethotsD);
            ERatedEffecModD.setText(ratedEffecModD);
            EScalingRatD.setText(scalingRatD);


            ERatMethotsE.setText(ratMethotsE);
            ERatedEffecModE.setText(ratedEffecModE);
            EScalingRatE.setText(scalingRatE);



        }




        if (numbersOfModule ==5){



            ratMethotsA = data.get(0);
            ratedEffecModA = data.get(1);
            scalingRatA = data.get(2);



            ratMethotsB = data.get(3);
            ratedEffecModB = data.get(4);
            scalingRatB = data.get(5);


            ratMethotsC = data.get(6);
            ratedEffecModC = data.get(7);
            scalingRatC = data.get(8);



            ratMethotsD = data.get(9);
            ratedEffecModD = data.get(10);
            scalingRatD = data.get(11);

            ratMethotsE = data.get(12);
            ratedEffecModE = data.get(13);
            scalingRatE = data.get(14);

            ERatMethotsA.setText(ratMethotsA);
            ERatedEffecModA.setText(ratedEffecModA);
            EScalingRatA.setText(scalingRatA);


            ERatMethotsB.setText(ratMethotsB);
            ERatedEffecModB.setText(ratedEffecModB);
            EScalingRatB.setText(scalingRatB);

            ERatMethotsC.setText(ratMethotsC);
            ERatedEffecModC.setText(ratedEffecModC);
            EScalingRatC.setText(scalingRatC);


            ERatMethotsD.setText(ratMethotsD);
            ERatedEffecModD.setText(ratedEffecModD);
            EScalingRatD.setText(scalingRatD);


            ERatMethotsE.setText(ratMethotsE);
            ERatedEffecModE.setText(ratedEffecModE);
            EScalingRatE.setText(scalingRatE);






        }




        return viewF;

    }

}
