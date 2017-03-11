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
public class FragmentH extends Fragment {


    public FragmentH() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View viewH = inflater.inflate(R.layout.fragment_h, container, false);
        ArrayList<String> data = new ArrayList<String>();
        data = getArguments().getStringArrayList("ListaFragH");



        String hoursA ="";
        String ectsA ="";

        String hoursA1 ="";
        String ectsA1 ="";

        String hoursB ="";
        String ectsB ="";

        String hoursB1 ="";
        String ectsB1 ="";

        String hoursC ="";
        String ectsC ="";

        String hoursD ="";
        String ectsD ="";


        TextView EHoursA = (TextView) viewH.findViewById(R.id.hoursAB);
        TextView EEctsA = (TextView) viewH.findViewById(R.id.ECTSABase);

        TextView EHoursA1 = (TextView) viewH.findViewById(R.id.hourseA1B);
        TextView EEctsA1 = (TextView) viewH.findViewById(R.id.ECTSA1B);

        TextView EHoursB = (TextView) viewH.findViewById(R.id.hourseBB);
        TextView EEctsB = (TextView) viewH.findViewById(R.id.ECTSBB);

        TextView EHoursB1 = (TextView) viewH.findViewById(R.id.hourseB1B);
        TextView EEctsB1 = (TextView) viewH.findViewById(R.id.ECTSB1B);

        TextView EHoursC = (TextView) viewH.findViewById(R.id.hourseCB);
        TextView EEctsC = (TextView) viewH.findViewById(R.id.ECTSCCB);

        TextView EHoursD = (TextView) viewH.findViewById(R.id.HourseDB);
        TextView EEctsD = (TextView) viewH.findViewById(R.id.ECTSDB);



        hoursA = data.get(0);
        ectsA = data.get(1);

        hoursA1 = data.get(2);
        ectsA1 = data.get(3);

        hoursB = data.get(4);
        ectsB = data.get(5);

        hoursB1 = data.get(6);
        ectsB1 = data.get(7);

        hoursC = data.get(8);
        ectsC = data.get(9);

        hoursD = data.get(10);
        ectsD = data.get(11);


        EHoursA.setText(hoursA);
        EEctsA.setText(ectsA);

        EHoursA1.setText(hoursA1);
        EEctsA1.setText(ectsA1);

        EHoursB.setText(hoursB);
        EEctsB.setText(ectsB);


        EHoursB1.setText(hoursB1);
        EEctsB1.setText(ectsB1);


        EHoursC.setText(hoursC);
        EEctsC.setText(ectsC);

        EHoursD.setText(hoursD);
        EEctsD.setText(ectsD);



        return viewH;
    }

}
