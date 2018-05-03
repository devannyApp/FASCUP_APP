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

public class FormXActivity extends AppCompatActivity {

    //Variables CheckBox
    CheckBox CheckboxLugunas, CheckboxReUbicado;

    //Varibles radios
    RadioButton r1, r2 , r3, r4;

    //Variables del Spinner
    Spinner comboUsoPredio; //Pregunta 4
    Spinner comboActividadArea; //Pregunta 5


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_x);

        //Oculta el Action Bar
        ActionBar actionBar = getSupportActionBar(); //o en su caso getSupportActionBar();
        actionBar.hide();

        //Definimos CheckBox Pregunta 9
        CheckboxLugunas = (CheckBox) findViewById(R.id.idLugunas);
        //Definimos CheckBox Pregunta 10
        CheckboxReUbicado = (CheckBox) findViewById(R.id.idReUbicado);

        //Referenciamnos los radios Pregunta 2
        r1= (RadioButton) findViewById(R.id.idRadioAreaProtegidaSi);
        r2= (RadioButton) findViewById(R.id.idRadioAreaProtegidaNo);

        //Referenciamnos los radios Pregunta 3
        r3= (RadioButton) findViewById(R.id.idRadioAreaIntervenidaSi);
        r4= (RadioButton) findViewById(R.id.idRadioAreaIntervenidaNo);


        //Definimos Spinner Pregunta 4
        comboUsoPredio = findViewById(R.id.idSpinnerUsoPredio);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.combo_usoPredio,android.R.layout.simple_spinner_item);

        comboUsoPredio.setAdapter(adapter1);

        //Definimos Spinner Pregunta 5
        comboActividadArea = findViewById(R.id.idSpinnerActividadArea);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.combo_actividadArea,android.R.layout.simple_spinner_item);

        comboActividadArea.setAdapter(adapter2);
    }
    public void onClickAyuda(View view){

        // Pasamos al siguiente formulario
        Intent miIntent= new Intent(FormXActivity.this,VistaFormX.class);
        startActivity(miIntent);

    }
    public void onClick(View view){

        // Pasamos al siguiente formulario
        Intent miIntent= new Intent(FormXActivity.this,FormXIActivity.class);
        startActivity(miIntent);

    }
}
