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
public class FragmentB extends Fragment {


    public FragmentB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View viewB = inflater.inflate(R.layout.fragment_b, container, false);
        ArrayList<String> data = new ArrayList<String>();
        String scope;
        String requirements;
        TextView EScope;

        EScope = (TextView) viewB.findViewById(R.id.ScopeB);


        TextView ERequirements = (TextView) viewB.findViewById(R.id.RequirementsB);


        data = getArguments().getStringArrayList("listaFragB");
        scope = data.get(0);
        requirements = data.get(1);

        EScope.setText(scope);
        ERequirements.setText(requirements);



        return viewB;

    }

}
