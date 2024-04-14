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
    private String ProductName;
    private float UnitPrice;
    private int Vat;
    private int Quantity;
    private float TotalVat;
    private float TotalAmount;

    public DummySalesReport(String ProductName, float UnitPrice, int Vat, int Quantity, float TotalVat, float TotalAmount) {
        this.ProductName = ProductName;
        this.UnitPrice = UnitPrice;
        this.Vat = Vat;
        this.Quantity = Quantity;
        this.TotalVat = TotalVat;
        this.TotalAmount = TotalAmount;
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

    public float getTotalVat() {
        return TotalVat;
    }

    public float getTotalAmount() {
        return TotalAmount;
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

    public void setTotalVat(float TotalVat) {
        this.TotalVat = TotalVat;
    }

    public void setTotalAmount(float TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    @Override
    public String toString() {
        return "DummySalesReport{" + "ProductName=" + ProductName + ", UnitPrice=" + UnitPrice + ", Vat=" + Vat + ", Quantity=" + Quantity + ", TotalVat=" + TotalVat + ", TotalAmount=" + TotalAmount + '}';
    }
    
}
    