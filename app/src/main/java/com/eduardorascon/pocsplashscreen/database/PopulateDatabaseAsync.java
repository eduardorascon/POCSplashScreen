package com.eduardorascon.pocsplashscreen.database;

import android.os.AsyncTask;

public class PopulateDatabaseAsync extends AsyncTask<Void, Void, Void> {
    private final ProductDao mProductsDao;
    private final CategoryDao mCategoryDao;

    public PopulateDatabaseAsync(CuponeraRoomDatabase db) {
        mProductsDao = db.productDao();
        mCategoryDao = db.categoryDao();
    }

    @Override
    protected Void doInBackground(Void... voids) {
        return null;
    }
}
