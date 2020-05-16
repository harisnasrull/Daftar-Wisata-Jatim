package com.example.submissionwisatajatim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ProfileView extends AppCompatActivity {

    public String title = "Profile";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_view);

        setActionBar(title);
    }

    private void setActionBar(String title) {
        if (getSupportActionBar()!=null){
            getSupportActionBar().setTitle(title);
        }
    }
}
