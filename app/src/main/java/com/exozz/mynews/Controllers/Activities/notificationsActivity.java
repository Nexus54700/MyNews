package com.exozz.mynews.Controllers.Activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import com.exozz.mynews.R;

public class notificationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Switch swNotif = findViewById(R.id.switch1);
        Button buttonSearch = findViewById(R.id.button);

        buttonSearch.setVisibility(View.GONE);
        swNotif.setVisibility(View.VISIBLE);
        this.configureToolbar();
    }

    private void configureToolbar(){
        //Get the toolbar (Serialise)
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.Notifications);
        //Set the toolbar
        setSupportActionBar(toolbar);
        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();
        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);
    }
}
