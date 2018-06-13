package com.beatricefarias.vilniustourguide.activities;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.beatricefarias.vilniustourguide.Attraction;
import com.beatricefarias.vilniustourguide.Constants;
import com.beatricefarias.vilniustourguide.R;

public class AttractionActivity extends AppCompatActivity {

    private String attractionIsCalled = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction);
        setCurrentAttraction();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle(attractionIsCalled);
    }

    /**
     * Method which sets information for attraction activity.
     */

    public void setCurrentAttraction(){

        Intent attractionIntent = getIntent();
        Attraction selectedAttraction = (Attraction) attractionIntent.getParcelableExtra(Constants.ATTRACTION_PARCEABLE);

        attractionIsCalled = selectedAttraction.getAttractionName();

        ImageView attractionHeader = (ImageView) findViewById(R.id.attraction_header);
        attractionHeader.setImageResource(selectedAttraction.getImageId());

        TextView attractionName = (TextView) findViewById(R.id.attraction_name);
        attractionName.setText(selectedAttraction.getAttractionName());

        TextView attractionLocation = (TextView) findViewById(R.id.attraction_location);
        attractionLocation.setText(selectedAttraction.getLocation());

        TextView attractionFee = (TextView) findViewById(R.id.attraction_fee);
        if (selectedAttraction.getPrice()){
            attractionFee.setText(getString(R.string.admission_free));
        } else {
            attractionFee.setText(R.string.admission_paid);
        }

        TextView attractionDescription = (TextView) findViewById(R.id.attraction_description);
        attractionDescription.setText(selectedAttraction.getDescription());
    }

    /**
     * Method to set up back button
     * @param item
     * @return selected item
     */

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
