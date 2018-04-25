package android.fascup.com.fascup;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;

public class FormIVActivity extends AppCompatActivity {

    //Variables CheckBox
    CheckBox CheckboxCaminoHerradura, CheckboxVíaCarreteable, CheckboxApie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_iv);

        //Oculta el Action Bar
        ActionBar actionBar = getSupportActionBar(); //o en su caso getSupportActionBar();
        actionBar.hide();


        //Definimos CheckBox Pregunta 4
        CheckboxCaminoHerradura = (CheckBox) findViewById(R.id.idCheckboxCaminoHerradura);
        CheckboxVíaCarreteable = (CheckBox) findViewById(R.id.idCheckboxVíaCarreteable);
        CheckboxApie = (CheckBox) findViewById(R.id.idCheckboxApie);
    }
}
