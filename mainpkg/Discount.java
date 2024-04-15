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
  private String ProductName;
    private float UnitPrice;
    private int  Quantity;
    private int PercentageDiscount; 

    public Discount(String ProductName, float UnitPrice, int Quantity, int PercentageDiscount) {
        this.ProductName = ProductName;
        this.UnitPrice = UnitPrice;
        this.Quantity = Quantity;
        this.PercentageDiscount = PercentageDiscount;
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
public float getTotalPrice() {
        float totalDiscount = (this.UnitPrice * this.PercentageDiscount) / 100f;
        float totalPrice = (this.UnitPrice - totalDiscount) * this.Quantity;
        return totalPrice;
    }
    @Override
    public String toString() {
        return "Discount{" + "ProductName=" + ProductName + ", UnitPrice=" + UnitPrice + ", Quantity=" + Quantity + ", PercentageDiscount=" + PercentageDiscount + '}';
    }

} 