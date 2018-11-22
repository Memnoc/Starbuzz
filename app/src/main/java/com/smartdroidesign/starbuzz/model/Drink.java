package com.smartdroidesign.starbuzz.model;

import android.support.annotation.NonNull;

import com.smartdroidesign.starbuzz.R;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;


    // Drink constructor
    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of Espresso shots with milk",
                    R.drawable.latte),
            new Drink("Cappuccino", "Espresso, hot milk, and steamed milk foam",
                    R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roastd and brewed fresh",
                    R.drawable.filter)
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }


    @NonNull
    @Override
    public String toString() {
        return this.name;
    }
}
