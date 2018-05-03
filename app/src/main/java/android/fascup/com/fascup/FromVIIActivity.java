package android.fascup.com.fascup;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class FromVIIActivity extends AppCompatActivity {

    //Variables del edidText
    EditText NombrePredio, NombreVereda, Tamano;

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
    RadioButton r1, r2, r3, r4; //Pregunta 7 y 8

    //Varibles del boton de Dialogo alerta
    Button simpleDialogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_vii);


        //Oculta el Action Bar
        ActionBar actionBar = getSupportActionBar(); //o en su caso getSupportActionBar();
        actionBar.hide();

        //Referenciamos los EdidText
        NombrePredio = (EditText) findViewById(R.id.idNombrePropietario);
        NombreVereda = (EditText) findViewById(R.id.idNombreVereda);
        Tamano = (EditText) findViewById(R.id.idTamano);

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
        r1= (RadioButton) findViewById(R.id.idRadioSiSuelo);
        r2= (RadioButton) findViewById(R.id.idRadioNoSuelo);

        //Referenciamnos los radios Pregunta 8
        r3= (RadioButton) findViewById(R.id.idRadioSiPredio);
        r4= (RadioButton) findViewById(R.id.idRadioNoPredio);



        //Referenciamos el boton
        simpleDialogo  = (Button) findViewById(R.id.id_btn_predio);

        simpleDialogo.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View v){
                AlertDialog.Builder builder = new AlertDialog.Builder(FromVIIActivity.this);

                //Constructor
                builder.setIcon(R.drawable.userlogin).
                        setTitle("Hola!").
                        setMessage("Para finalizar ¿Deseas agregar otro grupo de IDENTIFICACIÓN DEL PREDIO y sus características generales?").
                        setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(FromVIIActivity.this, "Haz agregado un nuevo grupo de Identificación del predio", Toast.LENGTH_SHORT).show();

                                //Limpiamos el formulario
                                LimpiarForm();

                            }
                        }).
                        setNegativeButton("No gracias deseo continuar!", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //dialog.dismiss();

                                // Pasamos al siguiente formulario
                                Intent miIntent= new Intent(FromVIIActivity.this,FormNueveActivity.class);
                                startActivity(miIntent);

                            }
                        });



                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }

        });

    }

    //Metodo btn ayuda
    public void onClickAyuda(View view){
        Intent miIntent= new Intent(FromVIIActivity.this,VistaFormIV.class);
        startActivity(miIntent);
    }


    public void  LimpiarForm(){

        NombrePredio.setText(null);
        NombreVereda.setText(null);
        Tamano.setText(null);

    }


}
