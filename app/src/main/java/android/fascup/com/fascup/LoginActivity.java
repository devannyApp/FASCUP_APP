package android.fascup.com.fascup;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;


public class LoginActivity extends AppCompatActivity {
    EditText campoUsuario, campoPassword;
    Button btnLogin;
    JSONArray ja;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Ocultamos el Action Bar
        ActionBar actionBar = getSupportActionBar(); //o en su caso getSupportActionBar();
        actionBar.hide();

        //Obtiene valor de preferencia (la primera ocasión es por default true).
        boolean muestra = getValuePreference(getApplicationContext());

        //Valida si muestra o no LicenseActivity.
        if(muestra){
            Intent myIntent = new Intent(LoginActivity.this, LicenseActivity.class);
            startActivity(myIntent);
            saveValuePreference(getApplicationContext(), false);
        }


        //Validar login
        setContentView(R.layout.activity_login);

        campoUsuario =(EditText)  findViewById(R.id.txtUsuario);
        campoPassword =(EditText)  findViewById(R.id.txtPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        //Se inicia seción al presionar el boton
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ConsultaPass("http://192.168.1.102:8080/Fastcup/consultarusuario.php?user="+campoUsuario.getText().toString());
                //Llamar MainActivity
                Intent i =new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);

            }
        });
    }


    //Metodo de ininiciar Licencia Activity
    private String PREFS_KEY = "mispreferencias";
    public void saveValuePreference(Context context, Boolean mostrar) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_KEY, MODE_PRIVATE);
        SharedPreferences.Editor editor;
        editor = settings.edit();
        editor.putBoolean("license", mostrar);
        editor.commit();
    }
    //Metodo de ininiciar Licencia Activity
    public boolean getValuePreference(Context context) {
        SharedPreferences preferences = context.getSharedPreferences(PREFS_KEY, MODE_PRIVATE);
        return  preferences.getBoolean("license", true);
    }


    //Iniciar Sesion
    private void ConsultaPass(String URL) {

        Log.i("url",""+URL);

        RequestQueue queue = Volley.newRequestQueue(this);
        StringRequest stringRequest =  new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                try {
                    ja = new JSONArray(response);
                    String contra = ja.getString(0);
                    if(contra.equals(campoPassword.getText().toString())){

                        Toast.makeText(getApplicationContext(),"Bienvenido",Toast.LENGTH_SHORT).show();
                        //Llamar MainActivity
                        Intent i =new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(i);

                    }else{
                        Toast.makeText(getApplicationContext(),"verifique su contraseña",Toast.LENGTH_SHORT).show();

                    }

                } catch (JSONException e) {
                    e.printStackTrace();

                    Toast.makeText(getApplicationContext(),"El usuario no existe en la base de datos",Toast.LENGTH_LONG).show();
                }


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        queue.add(stringRequest);



    }
}
