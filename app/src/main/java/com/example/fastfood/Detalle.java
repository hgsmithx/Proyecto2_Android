package com.example.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class Detalle extends AppCompatActivity {
    private TextView txtNombre,txtDescripcion,txtPrecio;
    private String nombre, nombre1, precio;
    private int rutaImage,descripcion;
    private ImageView imgSandwich;
    final int[] imagenes = {
            R.drawable.chacarero,
            R.drawable.barros_luco,
            R.drawable.chemilico,
            R.drawable.italiano,
            R.drawable.lomito
    };
    final int[] Detalle ={
            R.string.DetalleChacarero,
            R.string.DetalleChemilico,
            R.string.DetalleBarrosluco,
            R.string.DetalleItaliano,
            R.string.DetalleLomito

        };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent RecibirSandwich = getIntent();
        //Para colocar en el action bar el nombre del sandwich
        nombre = ("Detalle Sandwich ") + RecibirSandwich.getStringExtra("nombre");
        getSupportActionBar().setTitle(nombre);


        // Descriptores en el activity
        imgSandwich = findViewById(R.id.imgSandwich);
        txtDescripcion = findViewById(R.id.txtDescripcion);
        txtNombre = findViewById(R.id.txtNombre);
        txtPrecio = findViewById(R.id.txtPrecio);

       //Recepción de los datos del sandwich
        nombre1 = ("SANDWICH ") + RecibirSandwich.getStringExtra("nombre");
        descripcion = RecibirSandwich.getIntExtra("descripcion",0);
        precio = RecibirSandwich.getStringExtra("precio");
        rutaImage = RecibirSandwich.getIntExtra("id", 0);

        // Se asignan los datos recibidos en los view
        imgSandwich.setImageResource(imagenes[rutaImage]);
        txtNombre.setText(nombre1);
        txtDescripcion.setText(Detalle[descripcion]);
        txtPrecio.setText(precio);


       }
    }

