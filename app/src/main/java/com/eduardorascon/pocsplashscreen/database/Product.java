package com.eduardorascon.pocsplashscreen.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "products")
public class Product {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "product_id")
    private long mId;

    @NonNull
    @ColumnInfo(name = "product_name")
    private String mProductName;

    public Product(String productName) {
        this.mProductName = productName;
    }

    public String getProduct() {
        return mProductName;
    }

    public long getId() {
        return mId;
    }
}
