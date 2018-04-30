package android.fascup.com.fascup;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class FormIActivity extends AppCompatActivity {

    //Variables del Spinner Municipio
    Spinner comboMunicipio;
    Spinner comboReguardo;
    Spinner comboVereda;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_i);


        //Oculta el Action Bar
        ActionBar actionBar = getSupportActionBar(); //o en su caso getSupportActionBar();
        actionBar.hide();


        //Definimos Spinner municipio
        comboMunicipio = findViewById(R.id.idSpinnerMunicipio);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.combo_municipio,android.R.layout.simple_spinner_item);
        comboMunicipio.setAdapter(adapter);


        //Definimos Spinner Reguardo
        comboReguardo = findViewById(R.id.idSpinnerResguardo);
        ArrayAdapter<CharSequence> adapterR = ArrayAdapter.createFromResource(this,R.array.combo_resguardo,android.R.layout.simple_spinner_item);
        comboReguardo.setAdapter(adapterR);

        //Definimos Spinner Vereda
        comboVereda = findViewById(R.id.idSpinnerVereda);
        ArrayAdapter<CharSequence> adapterV = ArrayAdapter.createFromResource(this,R.array.combo_vereda,android.R.layout.simple_spinner_item);
        comboVereda.setAdapter(adapterV);
        /*comboVereda.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(parent.getContext(), "Seleccionado: "+parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?>parent){

            }
        });*/


    }

    //Metodo btn ayuda
    public void onClickAyuda(View view){
        Intent miIntent= new Intent(FormIActivity.this,VistaFormI.class);
        startActivity(miIntent);
    }

    //Metodo btn enviar formulario
    public void onClick(View view){
        Intent miIntent= new Intent(FormIActivity.this,MainActivity.class);
        startActivity(miIntent);
    }


}
