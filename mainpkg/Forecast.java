/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Asus
 */
public class Forecast {
    private String productname;
    private String month;
    private int salesforecast;
    private int totalsale;

    public Forecast() {
    }

    public Forecast(String productname, String month, int salesforecast, int totalsale) {
        this.productname = productname;
        this.month = month;
        this.salesforecast = salesforecast;
        this.totalsale = totalsale;
    }

    public String getProductname() {
        return productname;
    }

    public String getMonth() {
        return month;
    }

    public int getSalesforecast() {
        return salesforecast;
    }

    public int getTotalsale() {
        return totalsale;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setSalesforecast(int salesforecast) {
        this.salesforecast = salesforecast;
    }

    public void setTotalsale(int totalsale) {
        this.totalsale = totalsale;
    }
public float getDifferenceSale(){
     float salesDiff=((this.salesforecast)-(this.totalsale));
      return salesDiff;
}
    @Override
    public String toString() {
        return "Forecast{" + "productname=" + productname + ", month=" + month + ", salesforecast=" + salesforecast + ", totalsale=" + totalsale + '}';
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    float getSalesDiff() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void submitReport() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
