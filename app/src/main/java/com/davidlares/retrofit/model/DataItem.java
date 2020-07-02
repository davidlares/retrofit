package com.davidlares.retrofit.model;

import java.text.NumberFormat;

public class DataItem {

    public String itemName;
    public double price;

    public DataItem() {}


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        return itemName + "( " + numberFormat.format(price) + ")";
    }
}
