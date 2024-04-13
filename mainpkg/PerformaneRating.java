/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Asus
 */
public class PerformaneRating {
     private String ProductId;
    private String ProductName;
    private String ProductRating;

    public PerformaneRating(String ProductId, String ProductName, String ProductRating) {
        this.ProductId = ProductId;
        this.ProductName = ProductName;
        this.ProductRating = ProductRating;
    }

    public String getProductId() {
        return ProductId;
    }

    public String getProductName() {
        return ProductName;
    }

    public String getProductRating() {
        return ProductRating;
    }

    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public void setProductRating(String ProductRating) {
        this.ProductRating = ProductRating;
    }

    @Override
    public String toString() {
        return "PerformaneRating{" + "ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductRating=" + ProductRating + '}';
    }
    
}
