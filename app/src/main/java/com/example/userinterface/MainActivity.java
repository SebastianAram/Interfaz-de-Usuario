package com.example.userinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText usuario, clave;
    private Button ingresar, registrarse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.txtUsuario);
        clave = findViewById(R.id.txtClave);
        ingresar = findViewById(R.id.btnIngresar);
        registrarse = findViewById(R.id.btnRegister);

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = usuario.getText().toString();
                String pass = clave.getText().toString();
                if(user.isEmpty() || pass.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Usuario o Contraseña estan vacios.", Toast.LENGTH_SHORT).show();

                }else if(user.equals("sebas") && pass.equals("iudigital")){
                    Toast.makeText(getApplicationContext(),"Iniciando sesión...", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(getApplicationContext(),"Usuario o Contraseña incorrectos.", Toast.LENGTH_SHORT).show();

                }


            }
        });
    }
}