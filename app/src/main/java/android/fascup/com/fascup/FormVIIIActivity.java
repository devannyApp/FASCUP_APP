package android.fascup.com.fascup;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;

public class FormVIIIActivity extends AppCompatActivity {

    //Variables del Spinner
    Spinner comboEspecie; //Pregunta 1
    Spinner comboProposito; //Pregunta 8

    //Varibles radios
    RadioButton r1, r2 , r3, r4;  // pregunta 5

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_viii);


        //Oculta el Action Bar
        ActionBar actionBar = getSupportActionBar(); //o en su caso getSupportActionBar();
        actionBar.hide();

        //Definimos Spinner Pregunta 1
        comboEspecie = findViewById(R.id.idSpinnerEspecie);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.combo_especie,android.R.layout.simple_spinner_item);

        comboEspecie.setAdapter(adapter1);

        //Definimos Spinner Pregunta 8
        comboProposito = findViewById(R.id.idSpinnerProposito);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.combo_proposito,android.R.layout.simple_spinner_item);

        comboProposito.setAdapter(adapter2);


        //Referenciamnos los radios Pregunta 5
        r1= (RadioButton) findViewById(R.id.idRadioAutoconsumoSi);
        r2= (RadioButton) findViewById(R.id.idRadioAutoconsumoNo);

        //Referenciamnos los radios Pregunta 6
        r3= (RadioButton) findViewById(R.id.idRadioVentaSi);
        r4= (RadioButton) findViewById(R.id.idRadioVentaNo);
    }


    public void onClick(View view){

        // Pasamos al siguiente formulario
        Intent miIntent= new Intent(FormVIIIActivity.this,FormIVActivity.class);
        startActivity(miIntent);

    }
}
