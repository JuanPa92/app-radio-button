package com.example.appradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
    public void calcular(View view){
        String valor1String = et1.getText().toString();
        String valor2String = et2.getText().toString();

        int valor1Int = Integer.parseInt(valor1String);
        int valor2Int = Integer.parseInt(valor2String);

        if (rb1.isChecked()){
            int suma = valor1Int + valor2Int;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        } else if (rb2.isChecked()){
            int resta = valor1Int - valor2Int;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        }
    }
}