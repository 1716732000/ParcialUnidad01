package com.example.parcialunidad01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class claseCalculoIMC extends Activity {

    EditText Peso;
    EditText Estatura;
    TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculoimc);

        Peso = findViewById(R.id.txtPeso);
        Estatura = findViewById(R.id.txtEstatura);
        Resultado = findViewById(R.id.txtIMC);
    }

    public void CalculandoIMC(View Calculando)
    {
        String P1 = Peso.getText().toString();
        String E1 = Estatura.getText().toString();

        double P2 = Double.parseDouble(P1);
        double E2 = Double.parseDouble(E1);

        double PK = (P2 / 2.2);

        double IMC = PK / (E2 * E2);

        if (IMC > 50){
            Resultado.setText("Obesidad Clase 3 Criticamente Obeso");
        }else if(IMC > 40)
        {
            Resultado.setText("Obesidad Clase 2 Severamente Obeso");
        }else if(IMC > 35)
        {
            Resultado.setText("Obesidad Clase 1 Moderadamente Obeso");
        }else if(IMC > 30)
        {
            Resultado.setText("Sobrepeso");
        }else if(IMC > 25)
        {
            Resultado.setText("Normal Saludable");
        }else if(IMC > 18.5)
        {
            Resultado.setText("Bajo peso");
        }else if(IMC > 15.9)
        {
            Resultado.setText("severamente bajo peso");
        }else if(IMC > 10.5)
        {
            Resultado.setText("Criticamente bajo peso");
        }



    }

}
