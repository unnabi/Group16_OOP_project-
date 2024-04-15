/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author NUSRAT JAHAN
 */
public class dailyReport {
    int id,solditem,left,quantity;
    string date;

    public dailyReport() {
    }

    public int getId() {
        return id;
    }

    public int getSolditem() {
        return solditem;
    }

    public int getLeft() {
        return left;
    }

    public int getQuantity() {
        return quantity;
    }

    public string getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSolditem(int solditem) {
        this.solditem = solditem;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDate(string date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "dailyReport{" + "id=" + id + ", solditem=" + solditem + ", left=" + left + ", quantity=" + quantity + ", date=" + date + '}';
    }
    
    
    
}
