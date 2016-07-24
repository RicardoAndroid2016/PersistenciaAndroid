package pe.cibertec.persistenciaandroid;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences sharedPreferences = getSharedPreferences(getString(R.string.nombre_preferencia),MODE_PRIVATE);

        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("Usuario","Wilder");
        editor.commit();


        String nombreUsuario=sharedPreferences.getString("Usuario","Default");
        Log.d("Preferencia",nombreUsuario);

    }
}
