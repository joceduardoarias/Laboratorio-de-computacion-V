package com.example.class01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textSaludo = super.findViewById(R.id.txtSaludo);
        textSaludo.setText("Hola desde java!!!");
        EditText ed = super.findViewById(R.id.edNombre);

        ed.setText("Juan Perez");
        Button btn = super.findViewById(R.id.btn);

        View.OnClickListener onClickListener = new ClickButton(this);
        btn.setOnClickListener(onClickListener);
    }
}