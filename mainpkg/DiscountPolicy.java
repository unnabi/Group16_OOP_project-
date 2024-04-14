/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Asus
 */
public class DiscountPolicy {
     private String productName;
    private float unitPrice;
    private int  quantity;
    private int percentageDiscount;    
     private float totalPrice;

    public DiscountPolicy(String productName, float unitPrice, int quantity, int percentageDiscount, float totalPrice) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.percentageDiscount = percentageDiscount;
        this.totalPrice = totalPrice;
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

    public float getTotalPrice() {
        return totalPrice;
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

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Dummy{" + "productName=" + productName + ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", percentageDiscount=" + percentageDiscount + ", totalPrice=" + totalPrice + '}';
    }
    
}
