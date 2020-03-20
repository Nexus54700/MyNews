package com.exozz.mynews.Controllers.Activities;

import android.content.Intent;
import android.os.Bundle;

import com.exozz.mynews.Controllers.Models.TopStories;
import com.exozz.mynews.R;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;

import com.exozz.mynews.ui.main.SectionsPagerAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        this.configureToolbar();

      /*   FloatingActionButton fab = findViewById(R.id.fab);

        // Button for mail
       fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

        }); }*/
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //3 - Handle actions on menu items
        switch (item.getItemId()) {
            case R.id.menu_activity_main_search:
                Intent searchActivity = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchActivity);
                return true;
            case R.id.menu_notifs:
                Intent notifsActivity = new Intent(MainActivity.this, notificationsActivity.class);
                startActivity(notifsActivity);
                return true;

            default:
                return super.onOptionsItemSelected(item);



        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //2 - Inflate the menu and add it to the Toolbar
        getMenuInflater().inflate(R.menu.menu_activity_main, menu);
        return true;
    }

    private void configureToolbar(){
        // Get the toolbar view inside the activity layout
        Toolbar toolbar = findViewById(R.id.toolbar);
        // Sets the Toolbar
        setSupportActionBar(toolbar);
    }






    // 3 - Update UI showing only name of users
    private void updateUIWithListOfUsers(List<TopStories> section){
        StringBuilder stringBuilder = new StringBuilder();
        for (TopStories user : section){
            stringBuilder.append("-"+user.getSection()+"\n");
        }
        updateUIWhenStopingHTTPRequest(stringBuilder.toString());
    }


    private void updateUIWhenStartingHTTPRequest(){

    }

    private void updateUIWhenStopingHTTPRequest(String response){

    }
}