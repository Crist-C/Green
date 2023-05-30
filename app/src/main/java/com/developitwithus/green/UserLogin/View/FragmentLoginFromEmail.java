package com.developitwithus.green.UserLogin.View;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.developitwithus.green.UserLogin.IUserLogin;
import com.developitwithus.green.databinding.FragmentUserLoginFromEmailBinding;

public class FragmentLoginFromEmail extends Fragment {

    private FragmentUserLoginFromEmailBinding binding;
    private IUserLogin.Presenter presenter;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentLoginFromEmail() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static FragmentLoginFromEmail newInstance(String param1, String param2) {
        FragmentLoginFromEmail fragment = new FragmentLoginFromEmail();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Bundle bundle = getArguments();
        if(bundle != null){
            presenter = (IUserLogin.Presenter) bundle.getSerializable("presenter");
        }

        // Inflate the layout for this fragment
        binding = FragmentUserLoginFromEmailBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.loginOptionsButton.setOnClickListener(view1 -> presenter.showLoginOptionsFragment());
    }
}