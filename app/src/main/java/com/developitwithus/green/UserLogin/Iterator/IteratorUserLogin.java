package com.developitwithus.green.UserLogin.Iterator;


import com.developitwithus.green.UserLogin.IUserLogin;

public class IteratorUserLogin implements IUserLogin.Iterator {

    IUserLogin.Presenter presenterUserLogin;

    public IteratorUserLogin(IUserLogin.Presenter presenterUserLogin) {
        this.presenterUserLogin = presenterUserLogin;
    }

}
