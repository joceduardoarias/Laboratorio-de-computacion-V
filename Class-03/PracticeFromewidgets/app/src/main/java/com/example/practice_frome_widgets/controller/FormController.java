package com.example.practice_frome_widgets.controller;

import android.util.Log;

import com.example.practice_frome_widgets.model.Person;
import com.example.practice_frome_widgets.view.activities.FormActivity;
import com.example.practice_frome_widgets.view.interfaces.IFormView;

public class FormController {
    private IFormView view;

    public FormController(IFormView view) {

        this.view = view;
    }

    public void savePersonData(Person person){
        Log.d("FormController", "savePersonData called");
        //Validar valores u otras operaciones
        view.showDataInConsole(person);
    }
}
