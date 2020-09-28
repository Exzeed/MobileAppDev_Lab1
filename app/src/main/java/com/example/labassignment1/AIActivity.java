package com.example.labassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class AIActivity extends AppCompatActivity
{
    TextView tvAICreate, tvAIStart, tvAIStop, tvAIDestroy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_i);

        tvAICreate= findViewById(R.id.tvaiCreate);
        tvAICreate.setText(R.string.aiCreate);
    }

    @Override
    public void onStart()
    {
        super.onStart();
        tvAIStart= findViewById(R.id.tvaiStart);
        tvAIStart.setText(R.string.aiStart);
    }

    @Override
    public void onStop()
    {
        super.onStop();
        tvAIStop= findViewById(R.id.tvaiStop);
        tvAIStop.setText(R.string.aiStop);
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        tvAIDestroy= findViewById(R.id.tvaiDestroy);
        tvAIDestroy.setText(R.string.aiDestroy);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        final TextView tvAIDestroy= findViewById(R.id.tvaiDestroy);
        CharSequence userText = tvAIDestroy.getText();
        outState.putCharSequence("savedText", userText);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        final TextView tvAIDestroy= findViewById(R.id.tvaiDestroy);
        CharSequence userText = savedInstanceState.getCharSequence("savedText");
        tvAIDestroy.setText(userText);
    }
}