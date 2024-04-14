/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Asus
 */
public class OrderProduct {
    private String ProductName;
    private int ProductId;
    private int Quantity;

    public OrderProduct(String ProductName, int ProductId, int Quantity) {
        this.ProductName = ProductName;
        this.ProductId = ProductId;
        this.Quantity = Quantity;
    }
  public void submitTarget(){}
  public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }
    public String getProductName() {
        return ProductName;
    }

    public int getProductId() {
        return ProductId;
    }

    public int getQuantity() {
        return Quantity;
    }

    //public void setProductName(String ProductName) {
       // this.ProductName = ProductName;
   // }

    public void setProductId(int ProductId) {
        this.ProductId = ProductId;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    @Override
    public String toString() {
        return "OrderProduct{" + "ProductName=" + ProductName + ", ProductId=" + ProductId + ", Quantity=" + Quantity + '}';
    }

    void submitReport() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
