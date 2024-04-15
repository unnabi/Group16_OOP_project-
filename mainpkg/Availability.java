/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Asus
 */
public class Availability {
    private String MaterialName;
    private String MaterialId;
    private String Quantity;

    public Availability(String MaterialName, String MaterialId, String Quantity) {
        this.MaterialName = MaterialName;
        this.MaterialId = MaterialId;
        this.Quantity = Quantity;
    }

    public String getMaterialName() {
        return MaterialName;
    }

    public String getMaterialId() {
        return MaterialId;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setMaterialName(String MaterialName) {
        this.MaterialName = MaterialName;
    }

    public void setMaterialId(String MaterialId) {
        this.MaterialId = MaterialId;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    @Override
    public String toString() {
        return "Availability{" + "MaterialName=" + MaterialName + ", MaterialId=" + MaterialId + ", Quantity=" + Quantity + '}';
    }
    
}
