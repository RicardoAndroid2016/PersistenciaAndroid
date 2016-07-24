package pe.cibertec.persistenciaandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BDActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bd);
    }

    public void procesar(View view) {

        MyDao myDao = new MyDaoSQlite(this);

        int id = view.getId();
        switch (id) {
            case R.id.rb1:
                Objeto objeto= new Objeto();
                objeto.setNombre("Wilder");
                myDao.insertarObjeto(objeto);
                break;
            case R.id.rb2:
                break;
            case R.id.rb3:
                break;
        }
    }
}
