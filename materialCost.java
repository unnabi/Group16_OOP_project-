/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author NUSRAT JAHAN
 */
public class materialCost {
    
    string matrialname,vat;
    int price,quantity;

    public materialCost(string matrialname, string vat, int price, int quantity) {
        this.matrialname = matrialname;
        this.vat = vat;
        this.price = price;
        this.quantity = quantity;
    }

    public string getMatrialname() {
        return matrialname;
    }

    public string getVat() {
        return vat;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setMatrialname(string matrialname) {
        this.matrialname = matrialname;
    }

    public void setVat(string vat) {
        this.vat = vat;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "materialCost{" + "matrialname=" + matrialname + ", vat=" + vat + ", price=" + price + ", quantity=" + quantity + '}';
    }
    
    
    
}
