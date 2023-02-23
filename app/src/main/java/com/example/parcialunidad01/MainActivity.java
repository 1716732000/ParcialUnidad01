package com.example.parcialunidad01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUser;
    EditText txtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUser = findViewById(R.id.txtUsuario);
        txtPass = findViewById(R.id.txtPass);
    }

    public void MostarCalculoIMC(View IMC)
    {
        String user = "parcialETps1";
        String pass = "p4rC14l#tp$";

        //String user = "p1"; //Para pruebas.
        //String pass = "p1";

        String us = txtUser.getText().toString();
        String pa = txtPass.getText().toString();

        if(us.compareTo(user)==0 && pa.compareTo(pass)==0)
        {
            Intent imc = new Intent(this, claseCalculoIMC.class);
            startActivity(imc);
        }
        else
        {
            Toast error01 =
                    Toast.makeText(getApplicationContext(),
                            "Usuario o password erroneo", Toast.LENGTH_SHORT);

            error01.show();
        }
    }


}