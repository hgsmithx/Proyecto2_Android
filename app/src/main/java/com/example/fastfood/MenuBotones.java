package com.example.fastfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Space;

import java.util.ArrayList;


public class MenuBotones extends AppCompatActivity {

    LinearLayout contenedor;
    //int width, height, margin;
    public ArrayList<Sandwich> lista;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_botones);
        getSupportActionBar().setTitle("Sandwiches");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        lista = new ArrayList<Sandwich>();
        lista.add(new Sandwich(0,"Chacarero","$2.600",0));
        lista.add(new Sandwich(1,"Chemilico", "$2.350", 1));
        lista.add(new Sandwich(2,"Barros Luco","$2.100",2));
        lista.add(new Sandwich(3,"Italiano","$2.400",3));
        lista.add(new Sandwich(4,"Lomito","$2.000",4));
        LinearLayout.LayoutParams parametros = new LinearLayout.LayoutParams(700,160);
        parametros.setMargins(200,100,200,0);


            contenedor = findViewById(R.id.idContenedor);
            for(final Sandwich s:lista){

                final Button btn = new Button(getApplicationContext());

                //estilos para el boton

                btn.setText(s.nombre);
                btn.setId(s.idImagen);
                btn.setTextSize(16);
                btn.setTextColor(Color.WHITE);
                btn.setBackgroundColor(Color.rgb(215,35,35));
                btn.setLayoutParams(parametros);
                contenedor.addView(btn);

                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // no pude implementar serializable profe, se me caia como le escribí en el corre
                        // asi que lo hice por parametros.
                        Intent intentDetalle = new Intent(MenuBotones.this,Detalle.class);
                        intentDetalle.putExtra("id", s.idImagen);
                        intentDetalle.putExtra("nombre", s.nombre);
                        intentDetalle.putExtra("descripcion", s.descripcion);
                        intentDetalle.putExtra("precio", s.precio);
                        startActivity(intentDetalle);
                       // overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                    }
                });
            }


    }

    class Sandwich{

        public int idImagen,descripcion;
        public String nombre,precio;


        public Sandwich(int idImagen, String nombre,String precio,int descripcion) {
            this.idImagen = idImagen;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.precio = precio;
        }


    }
}






