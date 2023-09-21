package com.example.class01;
import  android.app.Activity;
import  android.util.Log;
import  android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ClickButton implements View.OnClickListener{
    private  TextView tv;
    private  EditText ed;
    private Activity activity;
    ClickButton(Activity activity){
        this.activity = activity;
    }
    @Override
    public void onClick(View view){
        Log.d("Click","Se hizo click!!!");

        if(ed == null){
            ed = activity.findViewById(R.id.edNombre);
            tv = activity.findViewById(R.id.txtSaludo);
        }

        tv.setText("Hola " + ed.getText());

    }
}
