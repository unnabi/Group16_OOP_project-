/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Asus
 */
public class Dummy {
     private String productname;
    private String month;
    private int salesforecast;
    private int totalsale;
    private float salesDiff;

    public Dummy() {
    }

    public Dummy(String productname, String month, int salesforecast, int totalsale, float salesDiff) {
        this.productname = productname;
        this.month = month;
        this.salesforecast = salesforecast;
        this.totalsale = totalsale;
        this.salesDiff = salesDiff;
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

    public float getSalesDiff() {
        return salesDiff;
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

    public void setSalesDiff(float salesDiff) {
        this.salesDiff = salesDiff;
    }

    @Override
    public String toString() {
        return "Dummy{" + "productname=" + productname + ", month=" + month + ", salesforecast=" + salesforecast + ", totalsale=" + totalsale + ", salesDiff=" + salesDiff + '}';
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
