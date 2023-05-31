package com.developitwithus.green.UserLogin.Model;

import com.developitwithus.green.Entities.User;

public interface ILoginDataStore {

    Result<User> getUser();
    Result<User> LoginFromGoogle(String email, String pasword);
    Result<User> LoginFromFacebook(String email, String pasword);
    Result<User> LoginFromEmail(String email, String pasword);

    public void Logout();
}
