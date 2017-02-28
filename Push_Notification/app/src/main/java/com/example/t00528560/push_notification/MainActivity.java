package com.example.t00528560.push_notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            if (getIntent().getExtras() != null) {
                for (String key : getIntent().getExtras().keySet()) {
                    Object value = getIntent().getExtras().get(key);
                    Log.d(TAG, "Key: " + key + " Value: " + value);
                }
            }
            // [END handle_data_extras]

            Button subscribeButton = (Button) findViewById(R.id.ab);
            subscribeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // [START subscribe_topics]
                    FirebaseMessaging.getInstance().subscribeToTopic("news");
                    // [END subscribe_topics]

                    // Log and toast


                }
            });


                }


    }

