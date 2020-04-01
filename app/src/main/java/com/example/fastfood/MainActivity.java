package com.example.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Fast Food");

    }

    public void Sandwiches (View view){
        Intent Activity1 = new Intent(this,MenuBotones.class);
        startActivity(Activity1);
    }

    public void SobreNosotros(View view){
        Intent Activity2 = new Intent(this,SobreNosotros.class);
        startActivity(Activity2);
    }
}
