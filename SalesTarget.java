/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author NUSRAT JAHAN
 */
public class SalesTarget {
    private String productName;
    private int     quantity;
    private String target;

    public SalesTarget(String productName, int quantity, String target) {
        this.productName = productName;
        this.quantity = quantity;
        this.target = target;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getTarget() {
        return target;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return "SalesTarget{" + "productName=" + productName + ", quantity=" + quantity + ", target=" + target + '}';
    }
    
}
