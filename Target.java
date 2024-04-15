/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Asus
 */
public class Target {
    private String ProductName;
    private String Month;
    private String TargetSold;
    private String SoldProduct;

    public Target() {
    }

    public Target(String ProductName, String Month, String TargetSold, String SoldProduct) {
        this.ProductName = ProductName;
        this.Month = Month;
        this.TargetSold = TargetSold;
        this.SoldProduct = SoldProduct;
    }
    public void submitTarget(){}
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getProductName() {
        return ProductName;
    }

    public String getMonth() {
        return Month;
    }

    public String getTargetSold() {
        return TargetSold;
    }

    public String getSoldProduct() {
        return SoldProduct;
    }

    //public void setProductName(String ProductName) {
      //  this.ProductName = ProductName;
    //}

    public void setMonth(String Month) {
        this.Month = Month;
    }

    public void setTargetSold(String TargetSold) {
        this.TargetSold = TargetSold;
    }

    public void setSoldProduct(String SoldProduct) {
        this.SoldProduct = SoldProduct;
    }

    @Override
    public String toString() {
        return "Target{" + "ProductName=" + ProductName + ", Month=" + Month + ", TargetSold=" + TargetSold + ", SoldProduct=" + SoldProduct + '}';
    }
    
}
