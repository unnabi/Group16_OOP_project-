/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Asus
 */
public class Application {
    private String ProductId;
    private String ProductName;
    private String Instraction;

    public Application(String ProductId, String ProductName, String Instraction) {
        this.ProductId = ProductId;
        this.ProductName = ProductName;
        this.Instraction = Instraction;
    }

    public String getProductId() {
        return ProductId;
    }

    public String getProductName() {
        return ProductName;
    }

    public String getInstraction() {
        return Instraction;
    }

    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public void setInstraction(String Instraction) {
        this.Instraction = Instraction;
    }

    @Override
    public String toString() {
        return "Application{" + "ProductId=" + ProductId + ", ProductName=" + ProductName + ", Instraction=" + Instraction + '}';
    }
  
 }

   
    