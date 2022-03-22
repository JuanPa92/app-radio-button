package com.example.appradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;
    private RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txtValue1);
        et2 = (EditText) findViewById(R.id.txtValue2);
        tv1 = (TextView) findViewById(R.id.txtResult);
        rb1 = (RadioButton) findViewById(R.id.rbSumar);
        rb2 = (RadioButton) findViewById(R.id.rbRestar);
    }

    //Metodo para el boton calcular
}