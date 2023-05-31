package com.developitwithus.green.UserRegister.Model;

import android.util.Log;

import com.developitwithus.green.Entities.User;
import com.developitwithus.green.UserLogin.Model.Result;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SingUpRemoteDataStore implements ISingUpDataStore{
    FirebaseDatabase database = FirebaseDatabase.getInstance("https://green-37e25-default-rtdb.firebaseio.com/");
    DatabaseReference myRef = database.getReference("/user/newUser");

    @Override
    public Result<User> createUser(String name, String phone, String email, String password) {

        myRef.setValue("Hello World! Cristian");

        Log.i("LogInfo: ", "createUser: User Created");
        return null;
    }

    @Override
    public Result<User> getUser(int id) {
        return null;
    }




}
