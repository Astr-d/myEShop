package com.example.myeshop.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String productname;
    private String productline;
    private String productscale;
    private String productvendor;
    private String productdescription;
    private String quantityinstock;
    private double buyprice;
    private double msrp;

    public String getId() {
        return id;
    }

    public void setId(String productCode) {
        this.id = productCode;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productName) {
        this.productname = productName;
    }

    public String getProductline() {
        return productline;
    }

    public void setProductline(String productLine) {
        this.productline = productLine;
    }

    public String getProductscale() {
        return productscale;
    }

    public void setProductscale(String productScale) {
        this.productscale = productScale;
    }

    public String getProductvendor() {
        return productvendor;
    }

    public void setProductvendor(String productVendor) {
        this.productvendor = productVendor;
    }

    public String getProductdescription() {
        return productdescription;
    }

    public void setProductdescription(String productDescription) {
        this.productdescription = productDescription;
    }

    public String getQuantityinstock() {
        return quantityinstock;
    }

    public void setQuantityinstock(String quantityInStock) {
        this.quantityinstock = quantityInStock;
    }

    public double getBuyprice() {
        return buyprice;
    }

    public void setBuyprice(double buyPrice) {
        this.buyprice = buyPrice;
    }

    public double getMsrp() {
        return msrp;
    }

    public void setMsrp(double msrp) {
        this.msrp = msrp;
    }
}
