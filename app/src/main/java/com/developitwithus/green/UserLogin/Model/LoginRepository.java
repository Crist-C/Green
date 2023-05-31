package com.developitwithus.green.UserLogin.Model;

import android.util.Log;

/***
 * Clase singleton:
 * 1. contiene una instancia propia de la misma clase del tipo private static volatile.
 * 2. Tiene su contructor privado y solo es usado por un método de la clase. es decir solo
 *    se crea a si mismo.
 * 3. Contiene un método en donde retorna la única instancia de el mismo (la del paso 1)
 *    en caso de ser null (es decir no se ha creado antes) entonces usa su propio constructor
 *    para instanciarlo.
 *  De esta manera se garantiza tener acceso siempre a la misma instancia.
 */

public class LoginRepository {

    // Instancia única de la clase en toda la aplicación,
    // y que puede ser modificada desde varios hilos de ejecución
    // manteniendo su integridad
    private static volatile LoginRepository instance;

    // Fuente de datos
    private ILoginDataStore dataSource;

    private LoginRepository(ILoginDataStore dataSource) {
        this.dataSource = dataSource;
    }

    public LoginRepository getInstance(ILoginDataStore dataStore){
        if (instance == null){
            instance = new LoginRepository(dataStore);
        }
        return instance;
    }
}
