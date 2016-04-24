package com.trial.chiutsui.speakeasy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Speaker[] speakers = {new Human(), new Dog(), new Cat()};
        saySomething(speakers);
    }

    private void saySomething(Speaker[] speakers) {
        for (Speaker speaker : speakers) {
            Log.d(TAG,speaker.speak());
        }
    }
}
