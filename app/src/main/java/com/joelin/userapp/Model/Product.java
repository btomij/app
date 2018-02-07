package com.joelin.userapp.Model;

/**
 * Created by joelin on 2018/2/7.
 */

public class Product {

    private long id;
    private String productname;
    private int price;
    private int qty;
    private String description;


    public Product(long id, String productname, int price, int qty, String description) {
        this.id = id;
        this.productname = productname;
        this.price = price;
        this.qty = qty;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
