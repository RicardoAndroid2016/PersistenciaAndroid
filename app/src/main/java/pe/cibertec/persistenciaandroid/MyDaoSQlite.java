package pe.cibertec.persistenciaandroid;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Android-SAB-PM on 23/07/2016.
 */
public class MyDaoSQlite implements MyDao {

    Context context;
    public MyDaoSQlite(Context contexto) {
        this.context=contexto;
    }

    @Override
    public long insertarObjeto(Objeto objeto) {
         MySqlOpenHelper mySqlOpenHelper= new MySqlOpenHelper(context);
        SQLiteDatabase sqLiteDatabase=mySqlOpenHelper.getWritableDatabase();

        ContentValues contentValues= new ContentValues();
        //contentValues.put("",objeto.getId());
        contentValues.put("nombre",objeto.getNombre());

        long id= sqLiteDatabase.insert("myTabla",null,contentValues);
        sqLiteDatabase.close();


        return id;
    }

    @Override
    public int actualizarObjeto(Objeto objeto) {
        return 0;
    }

    @Override
    public int eliminarObjeto(int id) {
        return 0;
    }

    @Override
    public int consultarObjetoxId(int id) {
        return 0;
    }

    @Override
    public int consultarObjetos() {
        return 0;
    }
}
