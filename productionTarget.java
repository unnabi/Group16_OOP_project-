/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author NUSRAT JAHAN
 */
public class productionTarget {
    private string name;
    private int quantity;
    private int deadline;

    public productionTarget(string name, int quantity, int deadline) {
        this.name = name;
        this.quantity = quantity;
        this.deadline = deadline;
    }

    public string getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setName(string name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "productionTarget{" + "name=" + name + ", quantity=" + quantity + ", deadline=" + deadline + '}';
    }
    
    
    
}
