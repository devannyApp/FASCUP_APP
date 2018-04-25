package android.fascup.com.fascup;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class FromVIIActivity extends AppCompatActivity {

    //Variables del Spinner
    Spinner comboAccesoTierra; //Pregunta 4
    Spinner comboClima; //Pregunta 6
    Spinner comboFuenteHidricas; //Pregunta 9
    Spinner comboLugaresNoAptos; //Pregunta 10
    Spinner comboPredioCordilleras; //Pregunta 11
    Spinner comboTieneCercas; //Pregunta 12
    Spinner comboZonasParamos; //Pregunta 13
    Spinner comboAreaPiscicultura; //Pregunta 14
    Spinner comboVivieros; //Pregunta 15
    Spinner comboHuerta; //Pregunta 16
    Spinner comboSistemaP; //Pregunta 17


    //Varibles radios
    RadioButton r4, r5, r6, r7; //Pregunta 7 y 8

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_vii);


        //Oculta el Action Bar
        ActionBar actionBar = getSupportActionBar(); //o en su caso getSupportActionBar();
        actionBar.hide();

        //Definimos Spinner Pregunta 4
        comboAccesoTierra = findViewById(R.id.idSpinnerAccesoTierra);
        ArrayAdapter<CharSequence> adapter0 = ArrayAdapter.createFromResource(this,R.array.combo_acceso_tierra,android.R.layout.simple_spinner_item);

        comboAccesoTierra.setAdapter(adapter0);

        //Definimos Spinner Pregunta 6
        comboClima = findViewById(R.id.idSpinnerClima);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.combo_clima,android.R.layout.simple_spinner_item);

        comboClima.setAdapter(adapter1);

        //Definimos Spinner Pregunta 9
        comboFuenteHidricas = findViewById(R.id.idSpinnerFuenteHidricas);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.combo_fuentes_hidricas,android.R.layout.simple_spinner_item);

        comboFuenteHidricas.setAdapter(adapter2);

        //Definimos Spinner Pregunta 10
        comboLugaresNoAptos = findViewById(R.id.idSpinnerLugaresNoAptos);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.combo_lugare_no_aptos,android.R.layout.simple_spinner_item);

        comboLugaresNoAptos.setAdapter(adapter3);

        //Definimos Spinner Pregunta 11
        comboPredioCordilleras = findViewById(R.id.idSpinnerPredioCordilleras);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,R.array.combo_predio_cordillera,android.R.layout.simple_spinner_item);

        comboPredioCordilleras.setAdapter(adapter4);

        //Definimos Spinner Pregunta 12
        comboTieneCercas = findViewById(R.id.idSpinnerTieneCercas);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,R.array.combo_cerca,android.R.layout.simple_spinner_item);

        comboTieneCercas.setAdapter(adapter5);

        //Definimos Spinner Pregunta 13
        comboZonasParamos = findViewById(R.id.idSpinnerZonasParamos);
        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this,R.array.combo_paramos,android.R.layout.simple_spinner_item);

        comboZonasParamos.setAdapter(adapter6);

        //Definimos Spinner Pregunta 14
        comboAreaPiscicultura = findViewById(R.id.idSpinnerAreaPiscicultura);
        ArrayAdapter<CharSequence> adapter7 = ArrayAdapter.createFromResource(this,R.array.combo_piscicultura,android.R.layout.simple_spinner_item);

        comboAreaPiscicultura.setAdapter(adapter7);

        //Definimos Spinner Pregunta 15
        comboVivieros = findViewById(R.id.idSpinnerVivieros);
        ArrayAdapter<CharSequence> adapter8 = ArrayAdapter.createFromResource(this,R.array.combo_vivieros,android.R.layout.simple_spinner_item);

        comboVivieros.setAdapter(adapter8);

        //Definimos Spinner Pregunta 16
        comboHuerta = findViewById(R.id.idSpinnerHuerta);
        ArrayAdapter<CharSequence> adapter9 = ArrayAdapter.createFromResource(this,R.array.combo_huerta,android.R.layout.simple_spinner_item);

        comboHuerta.setAdapter(adapter9);

        //Definimos Spinner Pregunta 17
        comboSistemaP = findViewById(R.id.idSpinnerSistemaP);
        ArrayAdapter<CharSequence> adapter10 = ArrayAdapter.createFromResource(this,R.array.combo_sistemap,android.R.layout.simple_spinner_item);

        comboSistemaP.setAdapter(adapter10);


        //Referenciamnos los radios Pregunta 7
        r4= (RadioButton) findViewById(R.id.idRadiosSiSuelo);
        r5= (RadioButton) findViewById(R.id.idRadiosNoSuelo);

        //Referenciamnos los radios Pregunta 8
        r6= (RadioButton) findViewById(R.id.idRadiosNoSuelo);
        r7= (RadioButton) findViewById(R.id.idRadiosNoPredio);

    }

    //Metodo1 radios
    public void onClick(View view){

        //NOTA: con el boton de registrar valida los radios button
        if(view.getId()==R.id.btn_registrar ){ //ID del botton .btn_registrar
            validar();
        }

        // Pasamos al siguiente formulario
        Intent miIntent= new Intent(FromVIIActivity.this,FormIXActivity.class);
        startActivity(miIntent);

    }
    //Metodo2 radios
    public void validar(){
        String cad="analisis de suelo: \n";

        if(r4.isChecked()==true){
            cad+="Si\n";
        }
        if(r5.isChecked()){
            cad+="No";
        }
        Toast.makeText(getApplicationContext(),cad,Toast.LENGTH_SHORT).show();
    }

}
