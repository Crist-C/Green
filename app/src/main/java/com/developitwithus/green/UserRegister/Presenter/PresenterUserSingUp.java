package com.developitwithus.green.UserRegister.Presenter;

import com.developitwithus.green.Entities.User;
import com.developitwithus.green.UserLogin.Model.Result;
import com.developitwithus.green.UserRegister.IUserSingUp;
import com.developitwithus.green.UserRegister.Iterator.IteratorSingUp;
import com.developitwithus.green.UserRegister.Model.SingUpRemoteDataStore;
import com.developitwithus.green.UserRegister.Model.SingUpRepository;
import com.developitwithus.green.UserRegister.View.UserSingUp;

public class PresenterUserSingUp implements IUserSingUp.Presenter {

    private IUserSingUp.View view;
    private IUserSingUp.Iterator iterator;
    private IUserSingUp.Model model;

    public PresenterUserSingUp(IUserSingUp.View view) {
        this.view = view;
        iterator = new IteratorSingUp(this);
        model = SingUpRepository.getInstance(new SingUpRemoteDataStore(),this);
    }

    @Override
    public void sendToLoginOptions() {
        view.sendToLoginOptions();
    }

    @Override
    public void createUser(String name, String phone, String email, String password, String passwordAssert) {
        User user = new User(null, name, phone, email);
        if(iterator.validarName(name) && iterator.validarPhone(phone) && iterator.validarEmail(email)
            && iterator.validarContraseñas(password, passwordAssert)){

            model.createNewUser(user, password);
        }
    }

    @Override
    public void resultadoSingUp(Result result) {

    }
}
