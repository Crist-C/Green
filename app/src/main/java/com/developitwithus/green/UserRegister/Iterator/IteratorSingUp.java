package com.developitwithus.green.UserRegister.Iterator;

import com.developitwithus.green.UserRegister.IUserSingUp;
import com.developitwithus.green.UserRegister.Presenter.PresenterUserSingUp;

public class IteratorSingUp implements IUserSingUp.Iterator {

    IUserSingUp.Presenter presenter;

    public IteratorSingUp(IUserSingUp.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public boolean validarContraseñas(String password, String passwordAssert) {
        return true;
    }

    @Override
    public boolean validarEmail(String email) {
        return true;
    }

    @Override
    public boolean validarPhone(String phone) {
        return true;
    }

    @Override
    public boolean validarName(String name) {
        return true;
    }
}
