package com.example.practice_frome_widgets.view.activities;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.practice_frome_widgets.R;
import com.example.practice_frome_widgets.controller.FormController;
import com.example.practice_frome_widgets.model.Person;
import com.example.practice_frome_widgets.view.interfaces.IFormView;

public class FormActivity extends AppCompatActivity implements IFormView {
//region FIELDS
    private EditText edtName;
    private EditText edtLastName;
    private EditText edtDni;
    private String gender;
    private RadioGroup radioGroupGender;
    private Button btnSave;
    private FormController frmController;
//endregion
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_form);

        // Inicializar vistas y eventos aquí
        initViews();

        // Inicializar el controlador
        frmController = new FormController(this);
    }
    private void initViews() {
        edtName = findViewById(R.id.edtName);
        edtLastName = findViewById(R.id.edtLastName);
        edtDni = findViewById(R.id.edtDni);
        radioGroupGender = findViewById(R.id.radioGroupGender);

        btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(v -> savePersonData());
    }
    private void savePersonData() {

        Person person = new Person();
        person.setName(edtName.getText().toString());
        person.setLastName(edtLastName.getText().toString());
        person.setDni(edtDni.getText().toString());

        int selectedId = radioGroupGender.getCheckedRadioButtonId();
        if (selectedId != -1) {
            RadioButton selectedRadioButton = findViewById(selectedId);
            String gender = selectedRadioButton.getTag().toString();
            person.setGender(gender);
        }

        frmController.savePersonData(person);
    }
    public void showDataInConsole(Person person) {
        // Mostrar datos en consola
        Log.d("FormActivity", "Name: " + person.getName());
        Log.d("FormActivity", "Last Name: " + person.getLastName());
        Log.d("FormActivity", "Gender: " + person.getGender());
        Log.d("FormActivity", "DNI: " + person.getDni());
        // Mostrar otros datos...
    }
}
