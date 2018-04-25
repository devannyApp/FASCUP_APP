package android.fascup.com.fascup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VistaFormVII extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_form_vii);
    }

    public void onClick(View view){
        Intent miIntent= new Intent(VistaFormVII.this,FormVIActivity.class);
        startActivity(miIntent);
    }
}
