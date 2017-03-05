package com.example.t00528560.myapplication;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by T00528560 on 3/4/2017.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private  static final String TAG = "MyFirevaseInsIDService";

    public void onTokenRefresh(){
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "New Token: " + refreshedToken);


    }

}
