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
public class FragmentC extends Fragment {


    public FragmentC() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewC = inflater.inflate(R.layout.fragment_c, container, false);


        ArrayList<String> skills = new ArrayList<String>();
        ArrayList<String> knowledge = new ArrayList<String>();
        ArrayList<String> competences = new ArrayList<String>();
        ArrayList<Integer> number = new ArrayList<Integer>();



        knowledge = getArguments().getStringArrayList("listaWiedz");
        skills = getArguments().getStringArrayList("listaUmiej");
        competences = getArguments().getStringArrayList("listaKomp");
        number =getArguments().getIntegerArrayList("ileFragC");

        int counterKnowledge;
        int counterSkills;
        int counterCompetences;


        counterKnowledge = number.get(0);
        counterSkills = number.get(1);
        counterCompetences = number.get(2);

        String knowledge1 ="";
        String symEffecModK1 ="";
        String symEffecEducK1 ="";

        String symEffecModK2 ="";
        String knowledge2 ="";
        String symEffecEducK2 ="";

        String symEffecModK3 ="";
        String knowledge3 ="";
        String symEffecEducK3 ="";
///////////////////////////////////////////////////////////////////////////////

        String symEffecModS1 ="";
        String skills1 ="";
        String symEffecEducS1 ="";

        String symEffecModS2 ="";
        String skills2 ="";
        String symEffecEducS2 ="";

        String symEffecModS3 ="";
        String skills3 ="";
        String symEffecEducS3 ="";


//////////////////////////////////////////////////////////////////////////////////
        String symEffecModC1 ="";
        String competences1 ="";
        String symEffecEducC1 ="";

        String symEffecModC2 ="";
        String competences2 ="";
        String symEffecEducC2 ="";

        String symEffecModC3 ="";
        String competences3 ="";
        String symEffecEducC3 ="";






        TextView EKnowledge1 = (TextView) viewC.findViewById(R.id.Knowledge1);

        TextView ESymEffecModK1 = (TextView) viewC.findViewById(R.id.SymEffecModK1);
        TextView ESymEffecEducK1 = (TextView) viewC.findViewById(R.id.SymbEffecEducK1);

        TextView ESymEffecModK2 = (TextView) viewC.findViewById(R.id.SymEffecModK2);
        TextView ESymEffecEducK2 = (TextView) viewC.findViewById(R.id.SymbEffecEducK2);
        TextView EKnowledge2 = (TextView) viewC.findViewById(R.id.Knowledge2);


        TextView ESymEffecModK3 = (TextView) viewC.findViewById(R.id.SymEffecModK3);
        TextView ESymEffecEducK3 = (TextView) viewC.findViewById(R.id.SymbEffecEducK3);
        TextView EKnowledge = (TextView) viewC.findViewById(R.id.Knowledge3);


        ////////////////////////////////////////////////////////////////////////////////////////


        TextView ESymEffecModS1 = (TextView) viewC.findViewById(R.id.SymEffecModS1);
        TextView ESymEffecEducS1 = (TextView) viewC.findViewById(R.id.SymbEffecEducS1);
        TextView ESkills1 = (TextView) viewC.findViewById(R.id.Skills1);

        TextView ESymEffecModS2 = (TextView) viewC.findViewById(R.id.SymEffecModS2);
        TextView ESymEffecEducS2 = (TextView) viewC.findViewById(R.id.SymbEffecEducS2);
        TextView ESkills2 = (TextView) viewC.findViewById(R.id.Skills2);

        TextView ESymEffecModS3 = (TextView) viewC.findViewById(R.id.SymEffecModS3);
        TextView ESymEffecEducS3 = (TextView) viewC.findViewById(R.id.SymbEffecEducS3);
        TextView ESkills3 = (TextView) viewC.findViewById(R.id.Skills3);




                                       // Kompetencje//
        /////////////////////////////////////////////////////////////////////////////////



        TextView ESymEffecModC1 = (TextView) viewC.findViewById(R.id.SymEffecModC1);
        TextView ESymEffecEducC1 = (TextView) viewC.findViewById(R.id.SymbEffecEducC1);
        TextView ECompetences1 = (TextView) viewC.findViewById(R.id.Competences1);


        TextView ESymEffecModC2 = (TextView) viewC.findViewById(R.id.SymEffecModC2);
        TextView ESymEffecEducC2 = (TextView) viewC.findViewById(R.id.SymbEffecEducC2);
        TextView ECompetences2 = (TextView) viewC.findViewById(R.id.Competences2);


        TextView ESymEffecModC3 = (TextView) viewC.findViewById(R.id.SymEffecModC3);
        TextView ESymEffecEducC3 = (TextView) viewC.findViewById(R.id.SymbEffecEducC3);
        TextView ECompetences3 = (TextView) viewC.findViewById(R.id.Competences3);



        if( counterKnowledge ==0){


            ESymEffecModK1.setText(symEffecModK1);
            EKnowledge1.setText(knowledge1);
            ESymEffecEducK1.setText(symEffecEducK1);

            ESymEffecModK2.setText(symEffecModK2);
            EKnowledge2.setText(knowledge2);
            ESymEffecEducK2.setText(symEffecEducK2);

            ESymEffecModK3.setText(symEffecModK3);
            EKnowledge.setText(knowledge3);
            ESymEffecEducK3.setText(symEffecEducK3);



        }


        if(counterKnowledge ==1){


            knowledge1 = knowledge.get(1);
            symEffecModK1 = knowledge.get(0);
            symEffecEducK1 = knowledge.get(2);


            ESymEffecModK1.setText(symEffecModK1);
            EKnowledge1.setText(knowledge1);
            ESymEffecEducK1.setText(symEffecEducK1);

            ESymEffecModK2.setText(symEffecModK2);
            EKnowledge2.setText(knowledge2);
            ESymEffecEducK2.setText(symEffecEducK2);

            ESymEffecModK3.setText(symEffecModK3);
            EKnowledge.setText(knowledge3);
            ESymEffecEducK3.setText(symEffecEducK3);


        }




        if(counterKnowledge ==2){


            knowledge1 = knowledge.get(1);
            symEffecModK1 = knowledge.get(0);
            symEffecEducK1 = knowledge.get(2);

            symEffecModK2 = knowledge.get(3);
            knowledge2 = knowledge.get(4);
            symEffecEducK2 = knowledge.get(5);


            ESymEffecModK1.setText(symEffecModK1);
            EKnowledge1.setText(knowledge1);
            ESymEffecEducK1.setText(symEffecEducK1);

            ESymEffecModK2.setText(symEffecModK2);
            EKnowledge2.setText(knowledge2);
            ESymEffecEducK2.setText(symEffecEducK2);

            ESymEffecModK3.setText(symEffecModK3);
            EKnowledge.setText(knowledge3);
            ESymEffecEducK3.setText(symEffecEducK3);


        }




        if(counterKnowledge ==3){


            knowledge1 = knowledge.get(1);
            symEffecModK1 = knowledge.get(0);
            symEffecEducK1 = knowledge.get(2);

            symEffecModK2 = knowledge.get(3);
            knowledge2 = knowledge.get(4);
            symEffecEducK2 = knowledge.get(5);


            symEffecModK3 = knowledge.get(6);
            knowledge3 = knowledge.get(7);
            symEffecEducK3 = knowledge.get(8);


            ESymEffecModK1.setText(symEffecModK1);
            EKnowledge1.setText(knowledge1);
            ESymEffecEducK1.setText(symEffecEducK1);

            ESymEffecModK2.setText(symEffecModK2);
            EKnowledge2.setText(knowledge2);
            ESymEffecEducK2.setText(symEffecEducK2);

            ESymEffecModK3.setText(symEffecModK3);
            EKnowledge.setText(knowledge3);
            ESymEffecEducK3.setText(symEffecEducK3);


        }


        if (counterSkills == 0) {

            ESymEffecModS1.setText(symEffecModS1);
            ESymEffecEducS1.setText(symEffecEducS1);
            ESkills1.setText(skills1);

            ESymEffecModS2.setText(symEffecModS2);
            ESymEffecEducS2.setText(symEffecEducS2);
            ESkills2.setText(skills2);

            ESymEffecModS3.setText(symEffecModS3);
            ESymEffecEducS3.setText(symEffecEducS3);
            ESkills3.setText(skills3);






        }




        if (counterSkills == 1) {


            symEffecModS1 = skills.get(0);
            skills1 = skills.get(1);
            symEffecEducS1 = skills.get(2);



            ESymEffecModS1.setText(symEffecModS1);
            ESymEffecEducS1.setText(symEffecEducS1);
            ESkills1.setText(skills1);

            ESymEffecModS2.setText(symEffecModS2);
            ESymEffecEducS2.setText(symEffecEducS2);
            ESkills2.setText(skills2);

            ESymEffecModS3.setText(symEffecModS3);
            ESymEffecEducS3.setText(symEffecEducS3);
            ESkills3.setText(skills3);






        }







        if (counterSkills == 2) {


            symEffecModS1 = skills.get(0);
            skills1 = skills.get(1);
            symEffecEducS1 = skills.get(2);



            symEffecModS2 = skills.get(3);
            skills2 = skills.get(4);
            symEffecEducS2 = skills.get(5);



            ESymEffecModS1.setText(symEffecModS1);
            ESymEffecEducS1.setText(symEffecEducS1);
            ESkills1.setText(skills1);

            ESymEffecModS2.setText(symEffecModS2);
            ESymEffecEducS2.setText(symEffecEducS2);
            ESkills2.setText(skills2);

            ESymEffecModS3.setText(symEffecModS3);
            ESymEffecEducS3.setText(symEffecEducS3);
            ESkills3.setText(skills3);






        }



        if (counterSkills == 3) {


            symEffecModS1 = skills.get(0);
            skills1 = skills.get(1);
            symEffecEducS1 = skills.get(2);



            symEffecModS2 = skills.get(3);
            skills2 = skills.get(4);
            symEffecEducS2 = skills.get(5);


            symEffecModS3 = skills.get(6);
            skills3 = skills.get(7);
            symEffecEducS3 = skills.get(8);



            ESymEffecModS1.setText(symEffecModS1);
            ESymEffecEducS1.setText(symEffecEducS1);
            ESkills1.setText(skills1);

            ESymEffecModS2.setText(symEffecModS2);
            ESymEffecEducS2.setText(symEffecEducS2);
            ESkills2.setText(skills2);

            ESymEffecModS3.setText(symEffecModS3);
            ESymEffecEducS3.setText(symEffecEducS3);
            ESkills3.setText(skills3);






        }



        if(counterCompetences ==0){

            ESymEffecModC1.setText(symEffecModC1);
            ESymEffecEducC1.setText(symEffecEducC1);
            ECompetences1.setText(competences1);

            ESymEffecModC2.setText(symEffecModC2);
            ESymEffecEducC2.setText(symEffecEducC2);
            ECompetences2.setText(competences2);

            ESymEffecModC3.setText(symEffecModC3);
            ESymEffecEducC3.setText(symEffecEducC3);
            ECompetences3.setText(competences3);



        }






        if(counterCompetences ==1){

            symEffecModC1 = competences.get(0);
            competences1 = competences.get(1);
            symEffecEducC1 = competences.get(2);


            ESymEffecModC1.setText(symEffecModC1);
            ESymEffecEducC1.setText(symEffecEducC1);
            ECompetences1.setText(competences1);

            ESymEffecModC2.setText(symEffecModC2);
            ESymEffecEducC2.setText(symEffecEducC2);
            ECompetences2.setText(competences2);

            ESymEffecModC3.setText(symEffecModC3);
            ESymEffecEducC3.setText(symEffecEducC3);
            ECompetences3.setText(competences3);



        }


        if(counterCompetences ==2){

            symEffecModC1 = competences.get(0);
            competences1 = competences.get(1);
            symEffecEducC1 = competences.get(2);

            symEffecModC2 = competences.get(3);
            competences2 = competences.get(4);
            symEffecEducC2 = competences.get(5);


            ESymEffecModC1.setText(symEffecModC1);
            ESymEffecEducC1.setText(symEffecEducC1);
            ECompetences1.setText(competences1);

            ESymEffecModC2.setText(symEffecModC2);
            ESymEffecEducC2.setText(symEffecEducC2);
            ECompetences2.setText(competences2);

            ESymEffecModC3.setText(symEffecModC3);
            ESymEffecEducC3.setText(symEffecEducC3);
            ECompetences3.setText(competences3);



        }


        if(counterCompetences ==3){

            symEffecModC1 = competences.get(0);
            competences1 = competences.get(1);
            symEffecEducC1 = competences.get(2);

            symEffecModC2 = competences.get(3);
            competences2 = competences.get(4);
            symEffecEducC2 = competences.get(5);

            symEffecModC3 = competences.get(6);
            competences3 = competences.get(7);
            symEffecEducC3 = competences.get(8);


            ESymEffecModC1.setText(symEffecModC1);
            ESymEffecEducC1.setText(symEffecEducC1);
            ECompetences1.setText(competences1);

            ESymEffecModC2.setText(symEffecModC2);
            ESymEffecEducC2.setText(symEffecEducC2);
            ECompetences2.setText(competences2);

            ESymEffecModC3.setText(symEffecModC3);
            ESymEffecEducC3.setText(symEffecEducC3);
            ECompetences3.setText(competences3);



        }
















        return viewC;
        //return inflater.inflate(R.layout.fragment_c, container, false);
    }

}
