package android.fascup.com.fascup;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by GIOVANNY on 13/03/2018.
 */

public class FormIIIActivity extends AppCompatActivity {


    //Variables del Spinner
    Spinner comboTendenciaVivienda; //Pregunta 7
    Spinner comboMaterialParedes;  //Pregunta 8
    Spinner comboMaterialTechos; //Pregunta 9
    Spinner comboMaterialPisos; //Pregunta 10
    Spinner comboAguaConsumo; //Pregunta 12
    Spinner comboAccesoAguaConsumo; //Pregunta 13
    Spinner comboAlmacenaAguaConsumo; //Pregunta 14
    Spinner comboAguaDesperdicie; //Pregunta 15
    Spinner comboHierbenAgua; //Pregunta 16
    Spinner comboLugarPreparacionAlimentos; //Pregunta 17
    Spinner comboCosinaUso; //Pregunta 18
    Spinner comboAlumbradoVivienda; //Pregunta 20
    Spinner comboServicioSanitario; //Pregunta 21
    Spinner comboTipoServicioSanitario; //Pregunta 22
    Spinner comboHubicacionServicioSanitario; //Pregunta 23
    Spinner comboEliminarBasuras; //Pregunta 24
    Spinner comboViertenAguas; //pregunta 26
    Spinner comboHierbenAguaServidas; //27

    //Variables CheckBox
    CheckBox CheckboxEnergiaElectrica, CheckboxTelevisorPorCable, CheckboxAlcantarillado,
             CheckboxRecoleccionBasuras, CheckboxAcueducto, CheckboxGas, CheckboxLeña,
             CheckboxEnergia, CheckBoxOtro, CheckboxOjoAgua, CheckboxQuebrada, CheckboxRio, CheckboxCienaga, CheckboxHumedal,
             CheckboxLaguna, CheckboxNinguno;

    //METODO PRINCIPAL
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_iii);

        //Definimos Spinner Pregunta 7
        comboTendenciaVivienda = findViewById(R.id.idSpinnerTendenciaVivienda);
        ArrayAdapter<CharSequence> adapter7 = ArrayAdapter.createFromResource(this,R.array.combo_tendencia_vivienda,android.R.layout.simple_spinner_item);

        comboTendenciaVivienda.setAdapter(adapter7);


        //Definimos Spinner Pregunta 8
        comboMaterialParedes = findViewById(R.id.idSpinnerMaterialParedes);
        ArrayAdapter<CharSequence> adapter8 = ArrayAdapter.createFromResource(this,R.array.combo_material_paredes,android.R.layout.simple_spinner_item);

        comboMaterialParedes.setAdapter(adapter8);



        //Definimos Spinner Pregunta 9
        comboMaterialTechos = findViewById(R.id.idSpinnerMaterialTechos);
        ArrayAdapter<CharSequence> adapter9 = ArrayAdapter.createFromResource(this,R.array.combo_material_techos,android.R.layout.simple_spinner_item);

        comboMaterialTechos.setAdapter(adapter9);


        //Definimos Spinner Pregunta 10
        comboMaterialPisos = findViewById(R.id.idSpinnerMaterialPisos);
        ArrayAdapter<CharSequence> adapter10 = ArrayAdapter.createFromResource(this,R.array.combo_material_pisos,android.R.layout.simple_spinner_item);

        comboMaterialPisos.setAdapter(adapter10);


        //Definimos Spinner Pregunta 12
        comboAguaConsumo = findViewById(R.id.idSpinnerAguaConsumo);
        ArrayAdapter<CharSequence> adapter12 = ArrayAdapter.createFromResource(this,R.array.combo_agua_consumo,android.R.layout.simple_spinner_item);

        comboAguaConsumo.setAdapter(adapter12);



        //Definimos Spinner Pregunta 13
        comboAccesoAguaConsumo = findViewById(R.id.idSpinnerLlegaAguaConsumo);
        ArrayAdapter<CharSequence> adapter13 = ArrayAdapter.createFromResource(this,R.array.combo_llega_agua_consumo,android.R.layout.simple_spinner_item);

        comboAccesoAguaConsumo.setAdapter(adapter13);



        //Definimos Spinner Pregunta 14
        comboAlmacenaAguaConsumo = findViewById(R.id.idSpinnerAguaParaConsumo);
        ArrayAdapter<CharSequence> adapter14 = ArrayAdapter.createFromResource(this,R.array.combo_agua_para_consumo,android.R.layout.simple_spinner_item);

        comboAlmacenaAguaConsumo.setAdapter(adapter14);


        //Definimos Spinner Pregunta 15
        comboAguaDesperdicie = findViewById(R.id.idSpinnerAguaDesperdicie);
        ArrayAdapter<CharSequence> adapter15 = ArrayAdapter.createFromResource(this,R.array.combo_agua_desperdicie,android.R.layout.simple_spinner_item);

        comboAguaDesperdicie.setAdapter(adapter15);


        //Definimos Spinner Pregunta 16
        comboHierbenAgua = findViewById(R.id.idSpinnerHierveAgua);
        ArrayAdapter<CharSequence> adapter16 = ArrayAdapter.createFromResource(this,R.array.combo_hierve_agua,android.R.layout.simple_spinner_item);

        comboHierbenAgua.setAdapter(adapter16);


        //Definimos Spinner Pregunta 17
        comboLugarPreparacionAlimentos  = findViewById(R.id.idSpinnerPreparacionAlimentos);
        ArrayAdapter<CharSequence> adapter17 = ArrayAdapter.createFromResource(this,R.array.combo_preparacion_alimentos,android.R.layout.simple_spinner_item);

        comboLugarPreparacionAlimentos.setAdapter(adapter17);



        //Definimos Spinner Pregunta 18
        comboCosinaUso  = findViewById(R.id.idSpinnerCosinaUso);
        ArrayAdapter<CharSequence> adapter18 = ArrayAdapter.createFromResource(this,R.array.combo_cosina_uso,android.R.layout.simple_spinner_item);

        comboCosinaUso.setAdapter(adapter18);


        //Definimos Spinner Pregunta 20
        comboAlumbradoVivienda = findViewById(R.id.idSpinnerAlumbradoVivienda);
        ArrayAdapter<CharSequence> adapter20 = ArrayAdapter.createFromResource(this,R.array.combo_alumbrado_vivienda,android.R.layout.simple_spinner_item);

        comboAlumbradoVivienda.setAdapter(adapter20);



        //Definimos Spinner Pregunta 21
        comboServicioSanitario = findViewById(R.id.idSpinnerServicioSanitarioEs);
        ArrayAdapter<CharSequence> adapter21 = ArrayAdapter.createFromResource(this,R.array.combo_servicio_sanitario_es,android.R.layout.simple_spinner_item);

        comboServicioSanitario.setAdapter(adapter21);


        //Definimos Spinner Pregunta 22
        comboTipoServicioSanitario = findViewById(R.id.idSpinnerTipoServicioSanitarioEs);
        ArrayAdapter<CharSequence> adapter22 = ArrayAdapter.createFromResource(this,R.array.combo_tipo_servicio_sanitario,android.R.layout.simple_spinner_item);

        comboTipoServicioSanitario.setAdapter(adapter22);



        //Definimos Spinner Pregunta 23
        comboHubicacionServicioSanitario= findViewById(R.id.idSpinnerHubicadoServicioSanitario);
        ArrayAdapter<CharSequence> adapter23 = ArrayAdapter.createFromResource(this,R.array.combo_hubicado_servicio_sanitario,android.R.layout.simple_spinner_item);

        comboHubicacionServicioSanitario.setAdapter(adapter23);



        //Definimos Spinner Pregunta 24
        comboEliminarBasuras = findViewById(R.id.idSpinnerEliminanBasuras);
        ArrayAdapter<CharSequence> adapter24 = ArrayAdapter.createFromResource(this,R.array.combo_eliminan_basuras,android.R.layout.simple_spinner_item);

        comboEliminarBasuras.setAdapter(adapter24);



        //Definimos Spinner Pregunta 26
        comboViertenAguas = findViewById(R.id.idSpinnerViertenAguasDomestica);
        ArrayAdapter<CharSequence> adapter26 = ArrayAdapter.createFromResource(this,R.array.combo_vierten_aguas_domestica,android.R.layout.simple_spinner_item);

        comboViertenAguas.setAdapter(adapter26);


        //Definimos Spinner Pregunta 27
        comboHierbenAguaServidas = findViewById(R.id.idSpinnerViertenAguasDomesticaServidas);
        ArrayAdapter<CharSequence> adapter27 = ArrayAdapter.createFromResource(this,R.array.combo_vierten_aguas_domestica_servidas,android.R.layout.simple_spinner_item);

        comboHierbenAguaServidas.setAdapter(adapter27);


        //Definimos CheckBox Pregunta 11
        CheckboxEnergiaElectrica = (CheckBox) findViewById(R.id.idCheckboxEnergiaElectrica);
        CheckboxTelevisorPorCable = (CheckBox) findViewById(R.id.idCheckboxTelevisorPorCable);
        CheckboxAlcantarillado = (CheckBox) findViewById(R.id.idCheckboxAlcantarillado);
        CheckboxRecoleccionBasuras = (CheckBox) findViewById(R.id.idCheckboxRecoleccionBasuras);
        CheckboxAcueducto = (CheckBox) findViewById(R.id.idCheckboxAcueducto);



        //Definimos CheckBox Pregunta 19
        CheckboxGas = (CheckBox) findViewById(R.id.idCheckboxGas);
        CheckboxLeña = (CheckBox) findViewById(R.id.idCheckboxLeña);
        CheckboxEnergiaElectrica = (CheckBox) findViewById(R.id.idCheckboxEnergiaElectrica);
        CheckBoxOtro = (CheckBox) findViewById(R.id.idCheckboxOtro);


        //Definimos CheckBox Pregunta 25
        CheckboxOjoAgua  = (CheckBox) findViewById(R.id.idCheckboxOjoAgua);
        CheckboxQuebrada  = (CheckBox) findViewById(R.id.idCheckboxQuebrada);
        CheckboxRio  = (CheckBox) findViewById(R.id.idCheckboxRio);
        CheckboxCienaga  = (CheckBox) findViewById(R.id.idCheckboxCienaga);
        CheckboxHumedal  = (CheckBox) findViewById(R.id.idCheckboxHumedal);
        CheckboxLaguna  = (CheckBox) findViewById(R.id.idCheckboxLaguna);
        CheckboxNinguno  = (CheckBox) findViewById(R.id.idCheckboxNinguno);


        //Muestra el boton para volver
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }


    //METODO CheckBox
    public void onclick(View view){

        if(view.getId()==R.id.idSubmitForm3){

            validarServiciosBasicos();
            validarCosinanAlimentos();
            validarViviendaCerca();
        }
    }

    //METODO PARA VALIDAR ServiciosBasicos CheckBox
    private void validarServiciosBasicos(){

        String mensajeServiciosBasicos="Selecionado: \n";

        if(CheckboxEnergiaElectrica.isChecked()== true){
            mensajeServiciosBasicos+="Energia eléctrica";
        }

        if(CheckboxTelevisorPorCable.isChecked()== true){
            mensajeServiciosBasicos+="Televisor con clable";
        }

        if(CheckboxAlcantarillado.isChecked()== true){
            mensajeServiciosBasicos+="Cantarillado";
        }

        if(CheckboxRecoleccionBasuras.isChecked()== true){
            mensajeServiciosBasicos+="Recoleccion de basura";
        }

        if(CheckboxAcueducto.isChecked()== true){
            mensajeServiciosBasicos+="Acueducto";
        }

        Toast.makeText(getApplicationContext(),mensajeServiciosBasicos, Toast.LENGTH_SHORT).show();
    }

    //METODO PARA VALIDAR Cosinan Alimentos CheckBox
    private void validarCosinanAlimentos(){

        String mensajeCosinanAlimentos="Selecionado: \n";

        if(CheckboxGas.isChecked() == true){

        }

        if(CheckboxLeña.isChecked() == true){

        }

        if(CheckboxEnergiaElectrica.isChecked() == true){

        }

        if(CheckBoxOtro.isChecked() == true){

        }

    }


    //METODO PARA VALIDAR vivienda cerca CheckBox
    private void validarViviendaCerca(){

        String mensajeViviendaCerca="Selecionado: \n";

        if(CheckboxOjoAgua.isChecked() == true){

        }

        if(CheckboxQuebrada.isChecked() == true){

        }

        if(CheckboxRio.isChecked() == true){

        }

        if(CheckboxCienaga.isChecked() == true){

        }

        if(CheckboxHumedal.isChecked() == true){

        }

        if(CheckboxLaguna.isChecked() == true){

        }

        if( CheckboxNinguno.isChecked() == true){

        }
    }

    //Cierra la actividad al presionar el boton...
    @Override
    public  boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==android.R.id.home){
            finish();
        }
        return  super.onOptionsItemSelected(item);
    }
}
