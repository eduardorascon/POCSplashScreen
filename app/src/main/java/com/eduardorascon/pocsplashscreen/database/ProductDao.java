package com.eduardorascon.pocsplashscreen.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface ProductDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Product product);

    @Query("DELETE FROM products")
    void deleteAll();

    @Delete
    void delete(Product product);

    @Query("SELECT * FROM products ORDER BY product_name ASC")
    List<Product> getAllProducts();
}
