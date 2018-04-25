package android.fascup.com.fascup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FormVActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_v);
    }

    public void onClick(View view){

        Intent miIntent=null;

        switch (view.getId()){
            case R.id.btn_regresar:
                finish();
                break;
            case R.id.btn_agregar:
                miIntent= new Intent(FormVActivity.this,FormVIActivity.class);
                break;
        }
        startActivity(miIntent);
    }
}
