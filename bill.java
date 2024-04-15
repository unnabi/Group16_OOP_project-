/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author NUSRAT JAHAN
 */
public class bill {
    string productname;
    int code,price,quantity;

    public bill(string productname, int code, int price, int quantity) {
        this.productname = productname;
        this.code = code;
        this.price = price;
        this.quantity = quantity;
    }

    public string getProductname() {
        return productname;
    }

    public int getCode() {
        return code;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setProductname(string productname) {
        this.productname = productname;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "bill{" + "productname=" + productname + ", code=" + code + ", price=" + price + ", quantity=" + quantity + '}';
    }
    
    
    
}
