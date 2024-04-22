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
    private int SalesForecast;
    private int TotalSale;

    public Forecast(String ProductName, String Month, int SalesForecast, int TotalSale) {
        this.ProductName = ProductName;
        this.Month = Month;
        this.SalesForecast = SalesForecast;
        this.TotalSale = TotalSale;
    }

    public String getProductName() {
        return ProductName;
    }

    public String getMonth() {
        return Month;
    }

    public int getSalesForecast() {
        return SalesForecast;
    }

    public int getTotalSale() {
        return TotalSale;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public void setMonth(String Month) {
        this.Month = Month;
    }

    public void setSalesForecast(int SalesForecast) {
        this.SalesForecast = SalesForecast;
    }

    public void setTotalSale(int TotalSale) {
        this.TotalSale = TotalSale;
    }

    @Override
    public String toString() {
        return "Forecast{" + "ProductName=" + ProductName + ", Month=" + Month + ", SalesForecast=" + SalesForecast + ", TotalSale=" + TotalSale + '}';
    }
    
}
   