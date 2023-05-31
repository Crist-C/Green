package com.developitwithus.green.UserRegister.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.developitwithus.green.Entities.User;
import com.developitwithus.green.R;
import com.developitwithus.green.UserLogin.View.UserLogin;
import com.developitwithus.green.UserRegister.IUserSingUp;
import com.developitwithus.green.UserRegister.Presenter.PresenterUserSingUp;
import com.developitwithus.green.Utils.Utils;
import com.developitwithus.green.databinding.UserRegisterBinding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UserSingUp extends AppCompatActivity implements IUserSingUp.View{

    private UserRegisterBinding binding;
    private Intent intent;
    private IUserSingUp.Presenter presenter;

    FirebaseDatabase database = FirebaseDatabase.getInstance("https://green-37e25-default-rtdb.firebaseio.com/");
    DatabaseReference myRef = database.getReference("/message");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = new PresenterUserSingUp(this);

        binding = UserRegisterBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        binding.loginButton.setOnClickListener(view1 -> presenter.sendToLoginOptions());


        binding.singUpButton.setOnClickListener(view12 -> presenter.createUser(
                binding.userNameInputText.getText().toString(),
                binding.phoneInputText.getText().toString(),
                binding.emailInputText.getText().toString(),
                binding.passwordInputText.getText().toString(),
                binding.passwordCofirmInputText.getText().toString()
        ));


        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                Log.d("Info: ", "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("Info: ", "Failed to read value.", error.toException());
            }
        });

    }

    @Override
    public void sendToLoginOptions() {
        intent = new Intent(getApplicationContext(), UserLogin.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void showSuccessSingUp(User user) {
        Utils.mostrarMensaje("You are a new user :D", this);
    }

    @Override
    public void showErrorOnSingUp(String error) {
        Utils.mostrarMensaje(error, this);
    }
}