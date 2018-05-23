package com.example.comp1.androidtestgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private TextView vista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        vista = (TextView)findViewById(R.id.vista);
    }

    public void sum(View view){
        String valor1 = num1.getText().toString();
        String valor2 = num2.getText().toString();
        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);
        int res = numero1 + numero2;
        String resultado = String.valueOf(res);
        vista.setText(resultado);

    }

    public void res(View view){
        String valor1 = num1.getText().toString();
        String valor2 = num2.getText().toString();
        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);
        int res = numero1 - numero2;
        String resultado = String.valueOf(res);
        vista.setText(resultado);

    }

    public void mult(View view){
        String valor1 = num1.getText().toString();
        String valor2 = num2.getText().toString();
        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);
        int res = numero1 * numero2;
        String resultado = String.valueOf(res);
        vista.setText(resultado);

    }

    public void div(View view){
        String valor1 = num1.getText().toString();
        String valor2 = num2.getText().toString();
        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);
        if(numero2 == 0) {
            Toast toast1 = Toast.makeText(getApplicationContext(), "No es posible dividir por cero", Toast.LENGTH_SHORT);
            toast1.show();
        }else{

                int res = numero1 / numero2;
                String resultado = String.valueOf(res);
                vista.setText(resultado);
            }
    }

}

