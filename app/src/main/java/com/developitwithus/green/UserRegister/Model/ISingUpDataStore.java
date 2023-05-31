package com.developitwithus.green.UserRegister.Model;

import com.developitwithus.green.Entities.User;
import com.developitwithus.green.UserLogin.Model.Result;

public interface ISingUpDataStore {
    
    Result<User> createUser(String name, String phone, String email, String password);

    Result<User> getUser(int id);
}
