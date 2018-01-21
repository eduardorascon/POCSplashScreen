package com.eduardorascon.pocsplashscreen;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements MainActivityView {

    private ActionBar toolbar;
    private MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = getSupportActionBar();
        toolbar.setTitle("Test");

        presenter = new MainActivityPresenter(this);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                        switch (item.getItemId()) {
                            case R.id.action_products:
                                toolbar.setTitle(getString(R.string.title_products));
                                break;
                            case R.id.action_chat:
                                toolbar.setTitle(getString(R.string.hello_chat_fragment));
                                break;
                            case R.id.action_map:
                                presenter.showMap();
                                break;
                        }

                        return true;
                    }
                }
        );

    }

    @Override
    public void showMap() {
        toolbar.setTitle(getString(R.string.hello_map_fragment));
        MapFragment mapFragment = new MapFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.frame_container, mapFragment).commit();
    }

    @Override
    public void showProducts() {

    }

    @Override
    public void showChat() {

    }
}
