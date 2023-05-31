package com.developitwithus.green.UserRegister.Model;

import com.developitwithus.green.Entities.User;
import com.developitwithus.green.UserLogin.Model.Result;
import com.developitwithus.green.UserRegister.IUserSingUp;

public class SingUpRepository implements IUserSingUp.Model {

    private static volatile SingUpRepository instance;

    private ISingUpDataStore registerDataStore;
    private IUserSingUp.Presenter presenter;

    private SingUpRepository(ISingUpDataStore registerDataStore, IUserSingUp.Presenter presenter) {
        this.registerDataStore = registerDataStore;
        this.presenter = presenter;
    }

    public static SingUpRepository getInstance(ISingUpDataStore registerDataStore, IUserSingUp.Presenter presenter){
        if(instance == null){
            instance = new SingUpRepository(registerDataStore, presenter);
        }
        return instance;
    }


    @Override
    public void createNewUser(User user, String password) {
        Result<User> result = registerDataStore.createUser(user.getName(),
                user.getPhone(),
                user.getEmail(),
                password);

        if(result instanceof Result.Success){
            registerDataStore.getUser(user.getId());
        }

    }
}
