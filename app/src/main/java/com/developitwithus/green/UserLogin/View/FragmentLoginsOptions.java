package com.developitwithus.green.UserLogin.View;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.developitwithus.green.UserLogin.IUserLogin;
import com.developitwithus.green.databinding.FragmentLoginsOptionsBinding;

public class FragmentLoginsOptions extends Fragment{

    private FragmentLoginsOptionsBinding binding;
    private IUserLogin.Presenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLoginsOptionsBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle bundle = getArguments();
        if(bundle != null){
            presenter = (IUserLogin.Presenter) bundle.getSerializable("presenter");
        }

        binding.emailLoginButton.setOnClickListener(view1 -> presenter.showEmailLoginFragment());
        binding.createAccountButton.setOnClickListener(view12 -> presenter.sendUserToCreateAcount());

    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }

}