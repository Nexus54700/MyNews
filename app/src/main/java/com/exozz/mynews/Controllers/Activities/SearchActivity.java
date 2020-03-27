package com.exozz.mynews.Controllers.Activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;

import com.exozz.mynews.R;

public class SearchActivity extends AppCompatActivity  {

   public Switch swNotif = findViewById(R.id.switch1);
   public Button buttonSearch = findViewById(R.id.button);
   public EditText textToSearch = findViewById(R.id.textToSearch);
   public EditText beginDate = findViewById(R.id.BeginDate);
   public EditText endDate = findViewById(R.id.EndDate);
   public CheckBox arts = findViewById(R.id.checkBoxArts);
   public CheckBox buisness = findViewById(R.id.checkBoxBuisness);
   public CheckBox entrepreneurs = findViewById(R.id.checkBoxEntrepreneurs);
   public CheckBox politics = findViewById(R.id.checkBoxPolitics);
   public CheckBox sports = findViewById(R.id.checkBoxSports);
   public CheckBox travel = findViewById(R.id.checkBoxTravel);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        buttonSearch.setVisibility(View.VISIBLE);
        swNotif.setVisibility(View.INVISIBLE);

        this.configureToolbar();


        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent resultActivity = new Intent(SearchActivity.this, ResultActivity.class);
                startActivity(resultActivity);

            }
        });
    }



    private void configureToolbar(){
        //Get the toolbar (Serialise)
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.search_articles);
        //Set the toolbar
        setSupportActionBar(toolbar);
        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();
        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);
    }

    public Switch getSwNotif() {
        return swNotif;
    }

    public void setSwNotif(Switch swNotif) {
        this.swNotif = swNotif;
    }

    public Button getButtonSearch() {
        return buttonSearch;
    }

    public void setButtonSearch(Button buttonSearch) {
        this.buttonSearch = buttonSearch;
    }

    public EditText getTextToSearch() {
        return textToSearch;
    }

    public void setTextToSearch(EditText textToSearch) {
        this.textToSearch = textToSearch;
    }

    public EditText getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(EditText beginDate) {
        this.beginDate = beginDate;
    }

    public EditText getEndDate() {
        return endDate;
    }

    public void setEndDate(EditText endDate) {
        this.endDate = endDate;
    }

    public CheckBox getArts() {
        return arts;
    }

    public void setArts(CheckBox arts) {
        this.arts = arts;
    }

    public CheckBox getBuisness() {
        return buisness;
    }

    public void setBuisness(CheckBox buisness) {
        this.buisness = buisness;
    }

    public CheckBox getEntrepreneurs() {
        return entrepreneurs;
    }

    public void setEntrepreneurs(CheckBox entrepreneurs) {
        this.entrepreneurs = entrepreneurs;
    }

    public CheckBox getPolitics() {
        return politics;
    }

    public void setPolitics(CheckBox politics) {
        this.politics = politics;
    }

    public CheckBox getSports() {
        return sports;
    }

    public void setSports(CheckBox sports) {
        this.sports = sports;
    }

    public CheckBox getTravel() {
        return travel;
    }

    public void setTravel(CheckBox travel) {
        this.travel = travel;
    }
}
