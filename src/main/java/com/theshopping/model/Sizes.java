package com.theshopping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


public class Sizes {
    public Sizes() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private String name;
    private int quantity;
}