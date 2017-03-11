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
public class FragmentA extends Fragment {


    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {





        ArrayList<String> data = new ArrayList<String>();
        View viewA = inflater.inflate(R.layout.fragment_a, container,false);


        String moduleName ="";
        String department ="";
        String field ="";
        String moduleCode ="";
        String profile ="";
        String form ="";
        String moduleCategory ="";
        String semester ="";
        String langLecture ="";
        String SISCD="";
        String name="";
        String surname="";
        String space=" ";
        String Steacher="";




        TextView teacher = (TextView) viewA.findViewById(R.id.TeacherB);

        TextView EModuleName = (TextView) viewA.findViewById(R.id.ModuleNameB);
        TextView EDepartment = (TextView) viewA.findViewById(R.id.DepartmentB);
        TextView EField = (TextView) viewA.findViewById(R.id.FieldB);
        TextView EModuleCode = (TextView) viewA.findViewById(R.id.KodModuluB);
        TextView EProfile = (TextView) viewA.findViewById(R.id.ProfileB);
        TextView EForm = (TextView) viewA.findViewById(R.id.FormB);
        TextView KategoriaModulu= (TextView) viewA.findViewById(R.id.ModuleCategoryB);
        TextView EModuleCategory = (TextView) viewA.findViewById(R.id.SemesterB);
        TextView ELangLecture = (TextView) viewA.findViewById(R.id.LangLectB);
        TextView ISCD= (TextView) viewA.findViewById(R.id.ISCEDESAXB);
        TextView Koordynator= (TextView) viewA.findViewById(R.id.TeacherB);

        data = getArguments().getStringArrayList("listaFragA");



        moduleName= data.get(0);
        department = data.get(1);
        field = data.get(2);
        moduleCode = data.get(3);
        profile = data.get(4);
        form = data.get(5);
        moduleCategory = data.get(6);
        semester = data.get(7);
        langLecture = data.get(8);
        SISCD= data.get(9);
        name=data.get(10);
        surname=data.get(11);
        Steacher=name+space+surname;



         EModuleName.setText(moduleName);
         EDepartment.setText(department);
         EField.setText(field);
         EModuleCode.setText(moduleCode);

         EProfile.setText(profile);
         EForm.setText(form);
         KategoriaModulu.setText(moduleCategory);
         EModuleCategory.setText(semester);
         ELangLecture.setText(langLecture);
         ISCD.setText(SISCD);
        teacher.setText(Steacher);


        return viewA;
    }

}
