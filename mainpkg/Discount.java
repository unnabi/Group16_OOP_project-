/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import javafx.scene.control.ComboBox;

/**
 *
 * @author Asus
 */
public class Discount {
 private String productName;
    private float unitPrice;
    private int  quantity;
    private int percentageDiscount;

    public Discount(String productName, float unitPrice, int quantity, int percentageDiscount) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.percentageDiscount = percentageDiscount;
    }

    public String getProductName() {
        return productName;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPercentageDiscount(int percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }
    public float getTotalPrice(){
    float totalPrice=(this.unitPrice*this.percentageDiscount)/100f;
    return totalPrice*quantity;
}
    

    @Override
    public String toString() {
        return "Discount{" + "productName=" + productName + ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", percentageDiscount=" + percentageDiscount + '}';
    }

   
    
    
}