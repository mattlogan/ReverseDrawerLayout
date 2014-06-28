package com.matthewlogan.reversedrawerlayout;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;

import com.matthewlogan.reversedrawerlayout.library.ReverseDrawerLayout;

/**
 * Created by matthewlogan on 6/28/14.
 */
public class SampleActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, new SampleFragment())
                .commit();

        ReverseDrawerLayout reverseDrawerLayout = (ReverseDrawerLayout) findViewById(R.id.reverse_drawer_layout);
        reverseDrawerLayout.setScrimColor(0);
    }
}
