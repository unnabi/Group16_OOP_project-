/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Asus
 */
public class DummySalesReport {
    private String productName;
    private float unitPrice;
    private int vat;
    private int quantity;
    private float totalvat;
    private float totalAmount;

    public DummySalesReport(String productName, float unitPrice, int vat, int quantity, float totalvat, float totalAmount) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.vat = vat;
        this.quantity = quantity;
        this.totalvat = totalvat;
        this.totalAmount = totalAmount;
    }

    public String getProductName() {
        return productName;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public int getVat() {
        return vat;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getTotalvat() {
        return totalvat;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTotalvat(float totalvat) {
        this.totalvat = totalvat;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "DummySalesReport{" + "productName=" + productName + ", unitPrice=" + unitPrice + ", vat=" + vat + ", quantity=" + quantity + ", totalvat=" + totalvat + ", totalAmount=" + totalAmount + '}';
    }
    
}
