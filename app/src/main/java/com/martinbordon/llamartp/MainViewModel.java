package com.martinbordon.llamartp;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainViewModel extends AndroidViewModel {
    private Context context;
    public MainViewModel(@NonNull Application application) {
        super(application);
        context=application.getApplicationContext();
    }
    public void login(String mail, String password) {
        if (mail.equals("mm") && password.equals("123")) {
            Intent intent = new Intent(context, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        } else{
            Toast.makeText(context,"Usuario y/o contraseña incorrecto",Toast.LENGTH_LONG).show();
        }
    }
}
