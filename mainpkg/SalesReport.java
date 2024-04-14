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
    private String ProductName;
    private float UnitPrice;
    private int Vat;
    private int Quantity;

    public SalesReport(String ProductName, float UnitPrice, int Vat, int Quantity) {
        this.ProductName = ProductName;
        this.UnitPrice = UnitPrice;
        this.Vat = Vat;
        this.Quantity = Quantity;
    }

    public String getProductName() {
        return ProductName;
    }

    public float getUnitPrice() {
        return UnitPrice;
    }

    public int getVat() {
        return Vat;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public void setUnitPrice(float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    public void setVat(int Vat) {
        this.Vat = Vat;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
   public float getTotalvat(){
    float totalvat=(this.UnitPrice*this.Vat)/100f;
    return totalvat*Quantity;
}
    
 public float getTotalAmount(){
     float totalAmount=(UnitPrice*Quantity) +  getTotalvat();
     return totalAmount;
 }   

    @Override
    public String toString() {
        return "SalesReport{" + "ProductName=" + ProductName + ", UnitPrice=" + UnitPrice + ", Vat=" + Vat + ", Quantity=" + Quantity + '}';
    }
    
}
    