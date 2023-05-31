package com.developitwithus.green.UserLogin.Model;

import com.developitwithus.green.Entities.User;

public class LoginRemoteDataStore implements ILoginDataStore{
    @Override
    public Result<User> getUser() {
        return null;
    }

    @Override
    public Result<User> LoginFromGoogle(String email, String pasword) {
        return null;
    }

    @Override
    public Result<User> LoginFromFacebook(String email, String pasword) {
        return null;
    }

    @Override
    public Result<User> LoginFromEmail(String email, String pasword) {
        return null;
    }

    @Override
    public void Logout() {

    }
}
