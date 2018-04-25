package android.fascup.com.fascup;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Calendar;



public class FormVIActivity extends AppCompatActivity {

   //Varibles radios
   RadioButton r1, r2;

  //Varibles Switch
    TextView txtEti;
    Switch switchE;

    //Varibles de Fecha
   private int año;
   private int mes;
   private int dia;
   private EditText campoFecha;
   private Button botonFecha;
   private static final int TIPO_DIALOGO = 0;
   private static  DatePickerDialog.OnDateSetListener oyenteSelectorFecha;


    //Variables del Spinner
    Spinner comboParentesco; //Pregunta 3
    Spinner comboEnfermedad; //Pregunta 6

    //Variables CheckBox
    CheckBox CheckboxIndigenaNasa,CheckboxIndigena,CheckboxGuanbiano,CheckboxAbro,CheckboxMulato,CheckboxMestiso,
            CheckboxBlanco,CheckBoxOtro,CheckBoxHabla,CheckBoxEntiende,CheckBoxNinguno;

    @Override //MEtODO DEL CICLO DE VIDA DE UNA ACTIVIDAD
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_vi);

            //Oculta el Action Bar
            ActionBar actionBar = getSupportActionBar(); //o en su caso getSupportActionBar();
            actionBar.hide();

            //Referenciamos la fecha

                //Obtener una instancia de los controles GUI dentro del layout
                campoFecha = (EditText) findViewById(R.id.campoFecha);
                botonFecha = (Button) findViewById(R.id.buttonFecha);
                Calendar calendario = Calendar.getInstance();
                año = calendario.get(Calendar.YEAR);
                mes = calendario.get(Calendar.MONTH)+1;
                dia = calendario.get(Calendar.DAY_OF_MONTH);
                mostrarFecha();
                oyenteSelectorFecha = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        año = year;
                        mes = monthOfYear;
                        dia = dayOfMonth;
                        mostrarFecha();
                    }
                };

            //Definimos Spinner Pregunta 3
            comboParentesco = findViewById(R.id.idSpinnerParentesco);
            ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.combo_parentezco,android.R.layout.simple_spinner_item);

            comboParentesco.setAdapter(adapter1);

            //Definimos Spinner Pregunta 4
            comboEnfermedad = findViewById(R.id.idSpinnerEnfermedad);
            ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.combo_enfermedad,android.R.layout.simple_spinner_item);

            comboEnfermedad.setAdapter(adapter2);

            //Referenciamnos los radios
            r1= (RadioButton) findViewById(R.id.idRadioMasculino);
            r2= (RadioButton) findViewById(R.id.idRadioFemenino);

            //Referenciamos los Switch
            txtEti= (TextView) findViewById(R.id.etiSeleccion);
            switchE= (Switch) findViewById(R.id.idSwitchTerritorio);

            //Referenciamos CheckBox Pregunta 7
            CheckboxIndigenaNasa = (CheckBox) findViewById(R.id.idCheckboxIndigenaNasa);
            CheckboxIndigena = (CheckBox) findViewById(R.id.idCheckboxIndigena);
            CheckboxGuanbiano = (CheckBox) findViewById(R.id.idCheckboxGuanbiano);
            CheckboxAbro = (CheckBox) findViewById(R.id.idCheckboxAfro);
            CheckboxMulato = (CheckBox) findViewById(R.id.idCheckboxMulato);
            CheckboxMestiso = (CheckBox) findViewById(R.id.idCheckboxMestizo);
            CheckboxBlanco = (CheckBox) findViewById(R.id.idCheckBoxBlanco);
            CheckBoxOtro = (CheckBox) findViewById(R.id.idCheckBoxOtro);
            CheckBoxHabla = (CheckBox) findViewById(R.id.idCheckboxHabla);
            CheckBoxEntiende = (CheckBox) findViewById(R.id.idCheckBoxSoloEntiende);
            CheckBoxNinguno= (CheckBox) findViewById(R.id.idCheckBoxNinguno);



    }

    //Metodo que invoca el Dialogo de la Fecha
    @Override
    protected Dialog onCreateDialog(int id) {
        //return super.onCreateDialog(id);

        switch (id){
            case 0:
                return new DatePickerDialog(this,oyenteSelectorFecha,año,mes,dia);

        }
        return  null;
    }

    //Metodo del boton que muestra el calendario
    public void mostrarCalendario(View control){
        showDialog(TIPO_DIALOGO);
    }


    //Metodo fecha
    public void mostrarFecha(){
        campoFecha.setText(año+"/"+mes+"/"+dia);
    }


   //Metodo1 radios
    public void onClick(View view){

        //NOTA: con el boton de registrar valida los radios button
        if(view.getId()==R.id.btn_registrar ){ //ID del botton .btn_registrar
            validar();
        }

    }
    //Metodo2 radios
    public void validar(){
        String cad="Sexo de la persona: \n";

        if(r1.isChecked()==true){
            cad+="Masculino\n";
        }
        if(r2.isChecked()){
            cad+="Femenino";
        }
        Toast.makeText(getApplicationContext(),cad,Toast.LENGTH_SHORT).show();
    }

    //METODO onclick Switch
    public void onclick(View view){

        //Valida Switch
        if(view.getId()==R.id.idSwitchTerritorio){
            if(switchE.isChecked()){
                txtEti.setText("Si");
            }else{
                txtEti.setText("No");
            }
        }


    }
}
