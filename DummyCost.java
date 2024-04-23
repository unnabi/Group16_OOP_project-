/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Asus
 */
public class DummyCost {
    private String MaterialName;
    private float Price;
    private int Vat;
    private int Quantity;
    private float TotalVat;
    private float TotalCost;

    public DummyCost(String MaterialName, float Price, int Vat, int Quantity, float TotalVat, float TotalCost) {
        this.MaterialName = MaterialName;
        this.Price = Price;
        this.Vat = Vat;
        this.Quantity = Quantity;
        this.TotalVat = TotalVat;
        this.TotalCost = TotalCost;
    }

    public String getMaterialName() {
        return MaterialName;
    }

    public float getPrice() {
        return Price;
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

    public float getTotalCost() {
        return TotalCost;
    }

    public void setMaterialName(String MaterialName) {
        this.MaterialName = MaterialName;
    }

    public void setPrice(float Price) {
        this.Price = Price;
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

    public void setTotalCost(float TotalCost) {
        this.TotalCost = TotalCost;
    }

    @Override
    public String toString() {
        return "DummyCost{" + "MaterialName=" + MaterialName + ", Price=" + Price + ", Vat=" + Vat + ", Quantity=" + Quantity + ", TotalVat=" + TotalVat + ", TotalCost=" + TotalCost + '}';
    }
    
}
    