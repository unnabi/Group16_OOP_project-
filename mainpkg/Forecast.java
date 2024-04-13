/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Asus
 */
public class Forecast {
    private String ProductName;
    private String Month;
    private String SalesForecast;
    private String TotalSaleProduct;

    public Forecast() {
    }

    public Forecast(String ProductName, String Month, String SalesForecast, String TotalSaleProduct) {
        this.ProductName = ProductName;
        this.Month = Month;
        this.SalesForecast = SalesForecast;
        this.TotalSaleProduct = TotalSaleProduct;
    }

    public String getProductName() {
        return ProductName;
    }

    public String getMonth() {
        return Month;
    }

    public String getSalesForecast() {
        return SalesForecast;
    }

    public String getTotalSaleProduct() {
        return TotalSaleProduct;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public void setMonth(String Month) {
        this.Month = Month;
    }

    public void setSalesForecast(String SalesForecast) {
        this.SalesForecast = SalesForecast;
    }

    public void setTotalSaleProduct(String TotalSaleProduct) {
        this.TotalSaleProduct = TotalSaleProduct;
    }

    @Override
    public String toString() {
        return "Forecast{" + "ProductName=" + ProductName + ", Month=" + Month + ", SalesForecast=" + SalesForecast + ", TotalSaleProduct=" + TotalSaleProduct + '}';
    }
    
    
}
