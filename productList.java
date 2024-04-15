/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author NUSRAT JAHAN
 */
public class productList {
   private string productname;
   private int code;
   private int date;

    public productList(string productname, int code, int date) {
        this.productname = productname;
        this.code = code;
        this.date = date;
    }

    public string getProductname() {
        return productname;
    }

    public int getCode() {
        return code;
    }

    public int getDate() {
        return date;
    }

    public void setProductname(string productname) {
        this.productname = productname;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "productList{" + "productname=" + productname + ", code=" + code + ", date=" + date + '}';
    }
   
   
    
}
