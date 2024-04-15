/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Asus
 */
public class Cost {
    private String MaterialName;
    private float Price;
    private int Vat;
    private int Quantity;

    public Cost(String MaterialName, float Price, int Vat, int Quantity) {
        this.MaterialName = MaterialName;
        this.Price = Price;
        this.Vat = Vat;
        this.Quantity = Quantity;
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
public float getTotalVat(){
    float totalvat=(this.Price*this.Vat)/100f;
    return totalvat*Quantity;
}
    
 public float getTotalCost(){
     float totalAmount=(Price*Quantity) +  getTotalVat();
     return totalAmount;
 }   
    @Override
    public String toString() {
        return "Cost{" + "MaterialName=" + MaterialName + ", Price=" + Price + ", Vat=" + Vat + ", Quantity=" + Quantity + '}';
    }

}