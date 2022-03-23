package com.example.appradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;
    private RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txtValue1);
        et2 = (EditText) findViewById(R.id.txtValue2);
        tv1 = (TextView) findViewById(R.id.txtResult);
        rb1 = (RadioButton) findViewById(R.id.rbSumar);
        rb2 = (RadioButton) findViewById(R.id.rbRestar);
        rb3 = (RadioButton) findViewById(R.id.rbMultiplicar);
        rb4 = (RadioButton) findViewById(R.id.rbDividir);
    }

    //Metodo para el boton calcular
    public void calcular(View view){
        String valor1String = et1.getText().toString();
        String valor2String = et2.getText().toString();

        int valor1Int = Integer.parseInt(valor1String);
        int valor2Int = Integer.parseInt(valor2String);
        int result = 0;
        String resultado;

        if (rb1.isChecked()){
            result = valor1Int + valor2Int;
        } else if (rb2.isChecked()){
            result = valor1Int - valor2Int;
        } else if (rb3.isChecked()){
            result = valor1Int * valor2Int;
        } else if (rb4.isChecked() && valor2Int != 0){
            result = valor1Int / valor2Int;
        } else if (valor2Int == 0 && rb4.isChecked()){
            Toast.makeText(this, "No se puede dividir entre cero", Toast.LENGTH_LONG).show();
        }

        resultado = String.valueOf(result);
        tv1.setText(resultado);
    }
}