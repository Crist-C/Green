package com.developitwithus.green.UserLogin;

import android.os.Bundle;
import android.view.View;

import java.io.Serializable;

public interface IUserLogin {

    interface view {
        void remplaceFragment(Class clase, Bundle bundle);
        void changeActivity(Class clase);
    }


    interface Presenter extends Serializable {
        // Métodos que llamará la vista
        void showLoginOptionsFragment();
        void showEmailLoginFragment();
        void sendUserToCreateAcount();

        // Métodos que llamará el Iterator
    }

    interface Iterator {
    }
}
