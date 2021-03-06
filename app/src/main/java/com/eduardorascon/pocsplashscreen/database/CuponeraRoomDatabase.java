package com.eduardorascon.pocsplashscreen.database;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.support.annotation.NonNull;

import java.nio.file.attribute.PosixFilePermissions;

@Database(entities = {Product.class, Category.class}, version = 1)
public abstract class CuponeraRoomDatabase extends RoomDatabase {
    private static CuponeraRoomDatabase INSTANCE;
    public abstract ProductDao productDao();
    public abstract CategoryDao categoryDao();

    public static CuponeraRoomDatabase getDatabase(final Context context) {
        if (INSTANCE != null)
            return INSTANCE;

        synchronized (CuponeraRoomDatabase.class) {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                        context.getApplicationContext(),
                        CuponeraRoomDatabase.class, "cuponera_database")
                        .addCallback(sRoomDatabaseCallback)
                        .build();
            }
        }

        return INSTANCE;
    }

    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onOpen(@NonNull SupportSQLiteDatabase db) {
            super.onOpen(db);
            new PopulateDatabaseAsync(INSTANCE).execute();
        }
    };
}
