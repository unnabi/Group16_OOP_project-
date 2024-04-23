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
     private String ProductName;
    private float UnitPrice;
    private int  Quantity;
    private int PercentageDiscount;    
    private float TotalPrice;

    public DiscountPolicy(String ProductName, float UnitPrice, int Quantity, int PercentageDiscount, float TotalPrice) {
        this.ProductName = ProductName;
        this.UnitPrice = UnitPrice;
        this.Quantity = Quantity;
        this.PercentageDiscount = PercentageDiscount;
        this.TotalPrice = TotalPrice;
    }

    public String getProductName() {
        return ProductName;
    }

    public float getUnitPrice() {
        return UnitPrice;
    }

    public int getQuantity() {
        return Quantity;
    }

    public int getPercentageDiscount() {
        return PercentageDiscount;
    }

    public float getTotalPrice() {
        return TotalPrice;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public void setUnitPrice(float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public void setPercentageDiscount(int PercentageDiscount) {
        this.PercentageDiscount = PercentageDiscount;
    }

    public void setTotalPrice(float TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    @Override
    public String toString() {
        return "DiscountPolicy{" + "ProductName=" + ProductName + ", UnitPrice=" + UnitPrice + ", Quantity=" + Quantity + ", PercentageDiscount=" + PercentageDiscount + ", TotalPrice=" + TotalPrice + '}';
    }

}   