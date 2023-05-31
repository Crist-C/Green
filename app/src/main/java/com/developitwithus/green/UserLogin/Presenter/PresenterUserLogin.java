package com.developitwithus.green.UserLogin.Presenter;

import android.os.Bundle;

import com.developitwithus.green.UserLogin.IUserLogin;
import com.developitwithus.green.UserLogin.Iterator.IteratorUserLogin;
import com.developitwithus.green.UserLogin.View.FragmentLoginFromEmail;
import com.developitwithus.green.UserLogin.View.FragmentLoginsOptions;
import com.developitwithus.green.UserRegister.View.UserSingUp;

public class PresenterUserLogin implements IUserLogin.Presenter {

    IUserLogin.Iterator iteratorUserLogin;
    IUserLogin.view viewUserLogin;

    public PresenterUserLogin(IUserLogin.view viewUserLogin) {
        this.viewUserLogin = viewUserLogin;
        this.iteratorUserLogin = new IteratorUserLogin(this);
    }

    @Override
    public void showEmailLoginFragment() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("presenter", this);

        viewUserLogin.remplaceFragment(FragmentLoginFromEmail.class, bundle);
    }

    @Override
    public void showLoginOptionsFragment() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("presenter", this);

        viewUserLogin.remplaceFragment(FragmentLoginsOptions.class, bundle);
    }

    @Override
    public void sendUserToCreateAcount() {
        viewUserLogin.changeActivity(UserSingUp.class);
    }


}
