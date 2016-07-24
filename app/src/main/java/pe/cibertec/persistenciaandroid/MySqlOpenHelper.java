package pe.cibertec.persistenciaandroid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Android-SAB-PM on 23/07/2016.
 */
public class MySqlOpenHelper extends SQLiteOpenHelper {


    private static final String nameBD="myDB.db";
    private static final int versionDB=1;

    public MySqlOpenHelper(Context context) {
        super(context, nameBD, null, versionDB);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d("Persistencia","oncreate-DB");
        String sql="create table myTabla (id integer primary key, nombre string not null)";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int
            newVersion) {
        Log.d("Persistencia","onUpgrade-DB");

    }
}
