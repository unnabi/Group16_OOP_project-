/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author NUSRAT JAHAN
 */
public class rawMaterial {
    String rawMaterial,date;
    int quantity,price;

    public rawMaterial(String rawMaterial, String date, int quantity, int price) {
        this.rawMaterial = rawMaterial;
        this.date = date;
        this.quantity = quantity;
        this.price = price;
    }

    public String getRawMaterial() {
        return rawMaterial;
    }

    public String getDate() {
        return date;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setRawMaterial(String rawMaterial) {
        this.rawMaterial = rawMaterial;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
}
