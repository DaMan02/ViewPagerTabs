package com.example.dayal.coordinatorapp;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class CollapsingToolbarFab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar_fab);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab=(FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,"My Action",Snackbar.LENGTH_SHORT).setAction("Action",null).show();

            }
        });
        ViewPager mVPager=(ViewPager)findViewById(R.id.viewpager);
        ViewPagerAdapter mVPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
        mVPagerAdapter.addFragment(DemoFragment.newInstance(),"Tab 1");
        mVPagerAdapter.addFragment(DemoFragment.newInstance(),"Tab 2");
        mVPagerAdapter.addFragment(DemoFragment.newInstance(),"Tab 3");
        mVPager.setAdapter(mVPagerAdapter);
        TabLayout mTLayout=(TabLayout)findViewById(R.id.tabs);
        mTLayout.setupWithViewPager(mVPager);
    }
}
