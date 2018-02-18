package com.eduardorascon.pocsplashscreen.database;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import java.util.List;

public class CategoryAllProducts {
    @Embedded
    private Category category;

    @Relation(parentColumn = "category_id", entityColumn = "category_id", entity = Product.class)
    private List<Product> products;
}