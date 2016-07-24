package pe.cibertec.persistenciaandroid;

import android.content.Context;

/**
 * Created by Android-SAB-PM on 23/07/2016.
 */
public interface MyDao {

    public long insertarObjeto(Objeto objeto);
    public int actualizarObjeto(Objeto objeto);
    public int eliminarObjeto(int id);
    public int consultarObjetoxId(int id);
    public int consultarObjetos();


}
