package com.eduardorascon.pocsplashscreen.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(
        tableName = "products",
        foreignKeys = @ForeignKey(
                entity = Category.class,
                childColumns = "category_id",
                parentColumns = "category_id",
                onDelete = ForeignKey.SET_NULL))
public class Product {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "product_id")
    public long id;

    @NonNull
    @ColumnInfo(name = "product_name")
    private String productName;

    @NonNull
    @ColumnInfo(name = "product_description")
    private String productDescription;

    @ColumnInfo(name = "category_id")
    private long categoryId;

    public Product(String productName, String productDescription, long categoryId) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.categoryId = categoryId;
    }

    public Product(String productName) {
        this.productName = productName;
    }

    @NonNull
    public String getProductName() {
        return productName;
    }

    @NonNull
    public String getProductDescription() {
        return productDescription;
    }

    public long getCategoryId() {
        return categoryId;
    }

}
