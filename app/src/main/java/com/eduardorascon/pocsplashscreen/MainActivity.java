package com.eduardorascon.pocsplashscreen;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements MainActivityView,
        ChatFragment.OnFragmentInteractionListener, ProductsFragment.OnFragmentInteractionListener {

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
                                presenter.showProducts();
                                break;
                            case R.id.action_chat:
                                presenter.showChat();
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
        toolbar.setTitle(getString(R.string.hello_products_fragment));
        ProductsFragment productsFragment = new ProductsFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.frame_container, productsFragment).commit();
    }

    @Override
    public void showChat() {
        toolbar.setTitle(getString(R.string.hello_chat_fragment));
        ChatFragment chatFragment = new ChatFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.frame_container, chatFragment).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
