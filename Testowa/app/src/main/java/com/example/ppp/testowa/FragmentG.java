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
public class FragmentG extends Fragment {


    public FragmentG() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewG = inflater.inflate(R.layout.fragment_g, container, false);


        ArrayList<String> data = new ArrayList<String>();
        data = getArguments().getStringArrayList("ListaFragG");

        String methotOfAsessment;


        methotOfAsessment = data.get(0);


        TextView EmethotOfAsessment = (TextView) viewG.findViewById(R.id.methotOfAsessmentB);


        EmethotOfAsessment.setText(methotOfAsessment);





        return viewG;
    }

}
