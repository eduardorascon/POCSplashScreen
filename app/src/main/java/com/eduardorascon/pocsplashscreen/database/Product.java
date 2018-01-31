package com.eduardorascon.pocsplashscreen.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "products")
public class Product {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "product_name")
    private String mProduct;

    public Product(String product) {
        this.mProduct = product;
    }

    public String getProduct() {
        return mProduct;
    }
}
