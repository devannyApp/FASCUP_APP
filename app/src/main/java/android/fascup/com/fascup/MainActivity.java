package android.fascup.com.fascup;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    //Varibles del menu
    private CardView CardViewForm_I, CardViewForm_II, CardViewForm_III, CardViewForm_IV, CardViewForm_VI, CardViewForm_V;   //Declaraciones de varibales para botones


    //METODO
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Oculta el Action Bar
        ActionBar actionBar = getSupportActionBar(); //o en su caso getSupportActionBar();
        actionBar.hide();


        //Definición de Cards
        CardViewForm_I = (CardView) findViewById(R.id.CardViewForm_I);
        CardViewForm_II = (CardView) findViewById(R.id.CardViewForm_II);
        CardViewForm_III = (CardView) findViewById(R.id.CardViewForm_III);
        CardViewForm_IV = (CardView) findViewById(R.id.CardViewForm_IV);
        CardViewForm_VI = (CardView) findViewById(R.id.CardViewForm_VI);
        CardViewForm_V = (CardView) findViewById(R.id.CardViewForm_V);

        //Agregar Click listenrer a los CardsView de Formulario
        CardViewForm_I.setOnClickListener(this);
        CardViewForm_II.setOnClickListener(this);
        CardViewForm_III.setOnClickListener(this);
        CardViewForm_IV.setOnClickListener(this);
        CardViewForm_VI.setOnClickListener(this);
        CardViewForm_V.setOnClickListener(this);
    }


    //Metdo cuando se presiona para abrir un formulario
    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
           case R.id.CardViewForm_I: i = new Intent(this,FormIActivity.class);startActivity(i); break;
           case R.id.CardViewForm_II: i = new Intent(this,FormIIIActivity.class);startActivity(i); break;
            case R.id.CardViewForm_III: i = new Intent(this,FormIIActivity.class);startActivity(i); break;
            case R.id.CardViewForm_IV: i = new Intent(this,FormVIActivity.class);startActivity(i); break;
            case R.id.CardViewForm_V: i = new Intent(this,FromVIIActivity.class);startActivity(i); break;
            case R.id.CardViewForm_VI: i = new Intent(this,FormIVActivity.class);startActivity(i); break;
           default:break;

        }
    }
}
