package android.fascup.com.fascup;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;

public class FormIIActivity extends AppCompatActivity {


    //Variables del Spinner
    Spinner comboActividadEconomica; //Pregunta 1

    //Variables CheckBox
    CheckBox CheckboxAgricultura,CheckboxGanaderia,CheckboxPiscicultura,CheckboxForestal,CheckboxMineria,CheckboxComercio,
            CheckboxArtesania,CheckBoxJornaleroAgricola,CheckBoxJornaleroConstruccion,CheckBoxAsalariado,CheckBoxServicioMecanicoAtomotores,
            CheckBoxServicioPersonal,CheckBoxTransporte,CheckBoxRestaurante,CheckBoxManufacturaProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_ii);

        //Oculta el Action Bar
        ActionBar actionBar = getSupportActionBar(); //o en su caso getSupportActionBar();
        actionBar.hide();

        //Definimos Spinner Pregunta 1
        comboActividadEconomica = findViewById(R.id.idSpinnerActividadEconomica);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.combo_actividad_economica,android.R.layout.simple_spinner_item);

        comboActividadEconomica.setAdapter(adapter1);


        //Definimos CheckBox Pregunta 2
        CheckboxAgricultura = (CheckBox) findViewById(R.id.idCheckboxAgricultura);
        CheckboxGanaderia = (CheckBox) findViewById(R.id.idCheckboxGanaderia);
        CheckboxPiscicultura = (CheckBox) findViewById(R.id.idCheckboxPiscicultura);
        CheckboxForestal = (CheckBox) findViewById(R.id.idCheckboxForestal);
        CheckboxMineria = (CheckBox) findViewById(R.id.idCheckboxMineria);
        CheckboxComercio = (CheckBox) findViewById(R.id.idCheckboxComercio);
        CheckboxArtesania = (CheckBox) findViewById(R.id.idCheckboxArtesania);
        CheckBoxJornaleroAgricola = (CheckBox) findViewById(R.id.idCheckBoxJornaleroAgricola);
        CheckBoxJornaleroConstruccion = (CheckBox) findViewById(R.id.idCheckBoxJornaleroConstruccion);
        CheckBoxAsalariado = (CheckBox) findViewById(R.id.idCheckBoxAsalariado);
        CheckBoxServicioMecanicoAtomotores = (CheckBox) findViewById(R.id.idCheckBoxServicioMecanicoAtomotores);
        CheckBoxServicioPersonal = (CheckBox) findViewById(R.id.idCheckBoxServicioPersonal);
        CheckBoxTransporte = (CheckBox) findViewById(R.id.idCheckBoxTransporte);
        CheckBoxRestaurante = (CheckBox) findViewById(R.id.idCheckBoxRestaurante);
        CheckBoxManufacturaProductos = (CheckBox) findViewById(R.id.idCheckBoxManufacturaProductos);


    }
}
