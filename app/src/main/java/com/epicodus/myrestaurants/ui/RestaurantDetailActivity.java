package com.epicodus.myrestaurants.ui;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.epicodus.myrestaurants.Adapters.RestaurantPagerAdapter;

import org.parceler.Parcels;

import java.util.ArrayList;

import butterknife.Bind;

public class RestaurantDetailActivity extends AppCompatActivity {
    @Bind(R.id.viewPager)
    ViewPager mViewPager;
    private RestaurantPagerAdapter adapterViewPager;
    ArrayList<Restaurants> mRestaurants = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_detail);
        Butterknife.bind(this);

        mRestaurants = Parcels.unwrap(getIntent().get.ParcelableExtra("restaurants"));
        int startingPosition = getIntent().getIntExtra("position",0);
        adapterViewPager = new RestaurantPagerAdapter(getSupportFragmentManager(), mRestaurants);
        mViewpager.setAdapter(adapterViewPager);
        mViewPager.setCurrentItem(startingPosition);

    }
}
