package android.fascup.com.fascup;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class FormXIActivity extends AppCompatActivity {

    //Variables CheckBox
    CheckBox CheckboxTilapia, CheckboxCarpa, CheckboxCachama, CheckboxTrucha, CheckboxOtro;

    //Varibles radios
    RadioButton r1, r2 , r3, r4 , r5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_xi);

        //Oculta el Action Bar
        ActionBar actionBar = getSupportActionBar(); //o en su caso getSupportActionBar();
        actionBar.hide();

        //Definimos CheckBox Pregunta 1
        CheckboxTilapia = (CheckBox) findViewById(R.id.idTilapia);
        CheckboxCarpa = (CheckBox) findViewById(R.id.idCarpa);
        CheckboxCachama = (CheckBox) findViewById(R.id.idCachama);
        CheckboxTrucha = (CheckBox) findViewById(R.id.idTrucha);
        CheckboxOtro= (CheckBox) findViewById(R.id.idOtro);

        //Referenciamnos los radios Pregunta 4
        r1= (RadioButton) findViewById(R.id.idRadioRio);
        r2= (RadioButton) findViewById(R.id.idRadioQuebrada);
        r3= (RadioButton) findViewById(R.id.idRadioCampoAbierto);
        r4= (RadioButton) findViewById(R.id.idRadioFozaFiltracion);
        r5= (RadioButton) findViewById(R.id.idRadioOtro);

    }

    public void onClick(View view){

        // Pasamos al siguiente formulario
        Intent miIntent= new Intent(FormXIActivity.this,FormVIIIActivity.class);
        startActivity(miIntent);

    }
}
