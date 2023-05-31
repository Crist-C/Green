package com.developitwithus.green.Utils;

import android.app.Activity;
import android.widget.Toast;

public class Utils {

    public static void mostrarMensaje(String mensaje, Activity activity) {

        activity.runOnUiThread(new Runnable() {
            public void run() {
                Toast.makeText(activity.getApplicationContext(), mensaje, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
