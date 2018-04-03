package android.fascup.com.fascup;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class FormIActivity extends AppCompatActivity {

    //Variables del Spinner Municipio
    Spinner comboMunicipio;
    Spinner comboReguardo;
    Spinner comboVereda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_i);

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


        //Muestra el boton para volver
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


    }

    //Cierra la actividad al presionar el boton
    @Override
    public  boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==android.R.id.home){
            finish();
        }
        return  super.onOptionsItemSelected(item);
    }
}
