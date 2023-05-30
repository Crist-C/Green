package com.developitwithus.green.UserLogin.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.developitwithus.green.R;
import com.developitwithus.green.UserLogin.IUserLogin;
import com.developitwithus.green.UserLogin.Presenter.PresenterUserLogin;
import com.developitwithus.green.databinding.ActivityUserLoginBinding;

public class UserLogin extends AppCompatActivity implements IUserLogin.view {

    private ActivityUserLoginBinding binding;
    private IUserLogin.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityUserLoginBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        presenter = new PresenterUserLogin(this);

        presenter.showLoginOptionsFragment();
    }

    @Override
    public void remplaceFragment(Class clase, Bundle bundle) {
        getSupportFragmentManager()
                .beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.fragmentContainerView, clase, bundle)
                .commit();
    }

    @Override
    public void changeActivity(Class clase) {
        Intent intent = new Intent(this, clase);
        startActivity(intent);
        finish();
    }
}