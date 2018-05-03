package android.fascup.com.fascup;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;


public class FormNueveActivity extends AppCompatActivity  {

    //Variables CheckBox pregunta 1
    CheckBox CheckboxRastrojo,CheckboxPendientes,CheckboxRiesgoDerumbes, CheckboxRiesgosHundimiento,
            CheckboxRiesgoCreciente, CheckboxRiesgoAgrietamiento, CheckboxRiesgoErosion, CheckboxConservacion;
    //Variable btn;
    Button  btnAyuda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_nueve);

        //Oculta el Action Bar
        ActionBar actionBar = getSupportActionBar(); //o en su caso getSupportActionBar();
        actionBar.hide();



        //Referenciamos CheckBox Pregunta 1
        CheckboxRastrojo = (CheckBox) findViewById(R.id.idCheckboxRastrojo);
        CheckboxPendientes = (CheckBox) findViewById(R.id.idCheckboxPendientes);
        CheckboxRiesgoDerumbes = (CheckBox) findViewById(R.id.idCheckboxRiesgoDerumbes);
        CheckboxRiesgosHundimiento = (CheckBox) findViewById(R.id.idCheckboxRiesgosHundimiento);
        CheckboxRiesgoCreciente = (CheckBox) findViewById(R.id.idCheckboxRiesgoCreciente);
        CheckboxRiesgoAgrietamiento = (CheckBox) findViewById(R.id.idCheckboxRiesgoAgrietamiento);
        CheckboxRiesgoErosion = (CheckBox) findViewById(R.id.idCheckboxRiesgoErosion);
        CheckboxConservacion = (CheckBox) findViewById(R.id.idCheckboxConservacion);
    }
    public void onClick(View view){
        // Pasamos al siguiente formulario
        Intent miIntent= new Intent(FormNueveActivity.this,FormXActivity.class);
        startActivity(miIntent);
    }
    public void onClickAyuda(View view){
        // Pasamos al siguiente formulario
        Intent miIntent= new Intent(FormNueveActivity.this,VistaFormX.class);
        startActivity(miIntent);
    }
}
