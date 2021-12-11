package com.example.reto1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnProductos, btnServicios, btnSucursales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_comida);

        setContentView(R.layout.activity_main);

        btnProductos = (Button) findViewById(R.id.btnProductos);
        btnProductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"La función del boton Productos se implementará en la siguiente versión (Reto 2)",Toast.LENGTH_SHORT).show();
            }
        });

        btnServicios = (Button) findViewById(R.id.btnServices);
        btnServicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"La función del boton Servicios se implementará en la siguiente versión (Reto 2)",Toast.LENGTH_SHORT).show();
            }
        });

        btnSucursales = (Button) findViewById(R.id.btnSucursales);
        btnSucursales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"La función del boton Sucursales se implementará en la siguiente versión (Reto 2)",Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return super.onCreateOptionsMenu(menu);
    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.productos:
                Toast.makeText(getApplicationContext(),"La función del menu Productos se implementará en la siguiente versión (Reto 2)",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.servicios:
                Toast.makeText(getApplicationContext(),"La función del menu Servicios se implementará en la siguiente versión (Reto 2)",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sucursales:
                Toast.makeText(getApplicationContext(),"La función del menu Sucursales se implementará en la siguiente versión (Reto 2)",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}