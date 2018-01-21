package com.eduardorascon.pocsplashscreen;

public class MainActivityPresenter {

    private MainActivityView view;

    public MainActivityPresenter(MainActivityView view) {
        this.view = view;
    }

    public void showMap() {
        view.showMap();
    }
}
