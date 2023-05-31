package com.developitwithus.green.UserRegister;

import com.developitwithus.green.Entities.User;
import com.developitwithus.green.UserLogin.Model.Result;

import java.net.UnknownServiceException;

public interface IUserSingUp {

    interface View{
        void sendToLoginOptions();
        void showSuccessSingUp(User user);
        void showErrorOnSingUp(String error);
    }

    interface Presenter{
        void sendToLoginOptions();
        void createUser(String name, String phone, String email, String pasword, String passwordAssert);
        void resultadoSingUp(Result result);
    }

    interface Iterator{
        boolean validarContraseñas(String password, String passwordAssert);
        boolean validarEmail(String email);
        boolean validarPhone(String phone);
        boolean validarName(String name);
    }

    interface Model{
        void createNewUser(User user, String password);
    }

}
