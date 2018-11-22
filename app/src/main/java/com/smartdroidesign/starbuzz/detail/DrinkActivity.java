package com.smartdroidesign.starbuzz.detail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.smartdroidesign.starbuzz.R;
import com.smartdroidesign.starbuzz.model.Drink;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKNO = "drinkno";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        // Get the drink from the intent, making sure the object null pointer is handled
        Bundle bundle = getIntent().getExtras();
        int drinkNo = -1;
        if (bundle != null) {
            drinkNo = bundle.getInt(EXTRA_DRINKNO);
        }
        Drink drink = Drink.drinks[drinkNo];

        // Populate the drink image
        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());

        // Populate the drink name
        TextView name = findViewById(R.id.name);
        name.setText(drink.getName());

        // Populate the drink description
        TextView description = findViewById(R.id.description);
        description.setText(drink.getDescription());
    }
}
