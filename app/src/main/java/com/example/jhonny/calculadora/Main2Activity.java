package com.example.jhonny.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{


    RadioGroup container;
    EditText numero1;
    EditText numero2;
    EditText resultado;
    float num1;
    float num2;
    float res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        numero1 = (EditText) findViewById(R.id.numero1);
        numero2 = (EditText) findViewById(R.id.numero2);
        resultado = (EditText) findViewById(R.id.resultado);
        container = (RadioGroup) findViewById(R.id.radiog);
        container.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.suma){
                    num1 = Float.parseFloat(numero1.getText().toString());
                    num2 = Float.parseFloat(numero2.getText().toString());
                    res = num1 + num2;
                    resultado.setText(String.valueOf(res));
                }else if(checkedId == R.id.resta){
                    num1 = Float.parseFloat(numero1.getText().toString());
                    num2 = Float.parseFloat(numero2.getText().toString());
                    res = num1 - num2;
                    resultado.setText(String.valueOf(res));
                }else if(checkedId == R.id.multiplicacion){
                    num1 = Float.parseFloat(numero1.getText().toString());
                    num2 = Float.parseFloat(numero2.getText().toString());
                    res = num1 * num2;
                    resultado.setText(String.valueOf(res));
                }else if(checkedId == R.id.division){
                    num1 = Float.parseFloat(numero1.getText().toString());
                    num2 = Float.parseFloat(numero2.getText().toString());
                    res = num1 / num2;
                    resultado.setText(String.valueOf(res));
                }
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
