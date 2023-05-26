package com.example.mockupapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_home);

    }
    public void Profile(View view) {
        startActivity(new Intent(this, FriendsScreen.class));
    }

    public void Notefication(View view) {
        startActivity(new Intent(this, NotificationScreen.class));
    }
}