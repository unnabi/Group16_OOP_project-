/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author NUSRAT JAHAN
 */
public class orderList {
    string name,code;
    int quantity,orderdate;

    public orderList(string name, string code, int quantity, int orderdate) {
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.orderdate = orderdate;
    }

    public string getName() {
        return name;
    }

    public string getCode() {
        return code;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getOrderdate() {
        return orderdate;
    }

    public void setName(string name) {
        this.name = name;
    }

    public void setCode(string code) {
        this.code = code;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setOrderdate(int orderdate) {
        this.orderdate = orderdate;
    }

    @Override
    public String toString() {
        return "orderList{" + "name=" + name + ", code=" + code + ", quantity=" + quantity + ", orderdate=" + orderdate + '}';
    }
    
    
    
    
    
    
}
