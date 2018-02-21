package com.eduardorascon.pocsplashscreen.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface CategoryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Category category);

    @Query("DELETE from categories")
    void deleteAll();

    @Delete
    void delete(Category category);

    @Query("SELECT * FROM categories ORDER BY category_name ASC")
    List<Category> getAllCategories();
}
