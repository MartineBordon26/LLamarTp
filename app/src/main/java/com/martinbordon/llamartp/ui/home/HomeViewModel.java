package com.martinbordon.llamartp.ui.home;

import android.Manifest;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends AndroidViewModel {

    private MutableLiveData<String> mText;
    private static final int REQUEST_PHONE_CALL = 1;
    Intent llamadaIntent = new Intent(Intent.ACTION_CALL);

    private Context context;
    public HomeViewModel(@NonNull Application application) {
        super(application);
        this.context = application.getApplicationContext();
    }

    public LiveData<String> getText() {
        if(mText == null) {
            mText = new MutableLiveData<>();
        }
        return mText;
    }
    public void hacerLlamada(String numeroTel) {
            llamadaIntent.setData(Uri.parse("tel:" + numeroTel));
            llamadaIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(llamadaIntent);
    }
}