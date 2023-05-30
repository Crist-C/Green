package com.developitwithus.green.UserLogin.Presenter;

import static androidx.core.content.ContextCompat.startActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.developitwithus.green.R;
import com.developitwithus.green.UserLogin.IUserLogin;
import com.developitwithus.green.UserLogin.Iterator.IteratorUserLogin;
import com.developitwithus.green.UserLogin.View.FragmentLoginFromEmail;
import com.developitwithus.green.UserLogin.View.FragmentLoginsOptions;
import com.developitwithus.green.UserLogin.View.UserLogin;
import com.developitwithus.green.UserRegister.UserRegister;

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
        viewUserLogin.changeActivity(UserRegister.class);
    }


}
