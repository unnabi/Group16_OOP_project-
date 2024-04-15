/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Asus
 */
public class Delivery {
     private int ProductId;
    private String ProductName;
    private int Quantity;

    public Delivery(int ProductId, String ProductName, int Quantity) {
        this.ProductId = ProductId;
        this.ProductName = ProductName;
        this.Quantity = Quantity;
    }

    public int getProductId() {
        return ProductId;
    }

    public String getProductName() {
        return ProductName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setProductId(int ProductId) {
        this.ProductId = ProductId;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    @Override
    public String toString() {
        return "Delivery{" + "ProductId=" + ProductId + ", ProductName=" + ProductName + ", Quantity=" + Quantity + '}';
    }
    
}
    