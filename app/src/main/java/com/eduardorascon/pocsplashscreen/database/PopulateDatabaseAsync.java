package com.eduardorascon.pocsplashscreen.database;

import android.os.AsyncTask;

public class PopulateDatabaseAsync extends AsyncTask<Void, Void, Void> {
    private final ProductDao mProductsDao;

    public PopulateDatabaseAsync(CuponeraRoomDatabase db) {
        mProductsDao = db.productDao();
    }

    @Override
    protected Void doInBackground(Void... voids) {
        return null;
    }
}
