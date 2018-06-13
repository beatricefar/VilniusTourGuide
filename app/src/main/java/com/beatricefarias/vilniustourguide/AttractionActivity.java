package com.beatricefarias.vilniustourguide;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class AttractionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction);
        setCurrentAttraction();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void setCurrentAttraction(){
        Intent attractionIntent = getIntent();
        Attraction selectedAttraction = (Attraction) attractionIntent.getParcelableExtra("attraction");

        ImageView attractionHeader = (ImageView) findViewById(R.id.attraction_header);
        attractionHeader.setImageResource(selectedAttraction.getImageId());

        TextView attractionName = (TextView) findViewById(R.id.attraction_name);
        attractionName.setText(selectedAttraction.getAttractionName());

        TextView attractionLocation = (TextView) findViewById(R.id.attraction_location);
        attractionLocation.setText(selectedAttraction.getLocation());

        TextView attractionFee = (TextView) findViewById(R.id.attraction_fee);
        if (selectedAttraction.getPrice()){
            attractionFee.setText("Admission: Free");
        } else {
            attractionFee.setText("Admission: Paid");
        }

        TextView attractionDescription = (TextView) findViewById(R.id.attraction_description);
        attractionDescription.setText(selectedAttraction.getDescription());

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
