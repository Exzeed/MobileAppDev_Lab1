package com.example.labassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class VRActivity extends AppCompatActivity
{
    TextView tvVRCreate, tvVRStart, tvVRStop, tvVRDestroy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_r);

        tvVRCreate= findViewById(R.id.tvvrCreate);
        tvVRCreate.setText(R.string.vrCreate);
    }

    @Override
    public void onStart()
    {
        super.onStart();
        tvVRStart= findViewById(R.id.tvvrStart);
        tvVRStart.setText(R.string.vrStart);
    }

    @Override
    public void onStop()
    {
        super.onStop();
        tvVRStop= findViewById(R.id.tvvrStop);
        tvVRStop.setText(R.string.vrStop);
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        tvVRDestroy= findViewById(R.id.tvvrDestroy);
        tvVRDestroy.setText(R.string.vrDestroy);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        final TextView tvVRDestroy= findViewById(R.id.tvvrDestroy);
        CharSequence userText = tvVRDestroy.getText();
        outState.putCharSequence("savedText", userText);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        final TextView tvVRDestroy= findViewById(R.id.tvvrDestroy);
        CharSequence userText = savedInstanceState.getCharSequence("savedText");
        tvVRDestroy.setText(userText);
    }
}