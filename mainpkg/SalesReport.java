/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Asus
 */
public class SalesReport {
   private String productName;
    private float unitPrice;
    private int vat;
    private int quantity;

    public SalesReport(String productName, float unitPrice, int vat, int quantity) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.vat = vat;
        this.quantity = quantity;
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
public float getTotalvat(){
    float totalvat=(this.unitPrice*this.vat)/100f;
    return totalvat*quantity;
}
    
 public float getTotalAmount(){
     float totalAmount=(unitPrice*quantity) +  getTotalvat();
     return totalAmount;
 }   
    @Override
    public String toString() {
        return "SalesReport{" + "productName=" + productName + ", unitPrice=" + unitPrice + ", vat=" + vat + ", quantity=" + quantity + '}';
    }

    
}
