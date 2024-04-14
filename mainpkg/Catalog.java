/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.time.LocalDate;

/**
 *
 * @author Asus
 */
public class Catalog {
    private int ProductId;
    private LocalDate ManufactureDate;
    private LocalDate  ExpireDate;

    public Catalog(int ProductId, LocalDate ManufactureDate, LocalDate ExpireDate) {
        this.ProductId = ProductId;
        this.ManufactureDate = ManufactureDate;
        this.ExpireDate = ExpireDate;
    }

    public int getProductId() {
        return ProductId;
    }

    public LocalDate getManufactureDate() {
        return ManufactureDate;
    }

    public LocalDate getExpireDate() {
        return ExpireDate;
    }

    public void setProductId(int ProductId) {
        this.ProductId = ProductId;
    }

    public void setManufactureDate(LocalDate ManufactureDate) {
        this.ManufactureDate = ManufactureDate;
    }

    public void setExpireDate(LocalDate ExpireDate) {
        this.ExpireDate = ExpireDate;
    }

    @Override
    public String toString() {
        return "Catalog{" + "ProductId=" + ProductId + ", ManufactureDate=" + ManufactureDate + ", ExpireDate=" + ExpireDate + '}';
    }
    
}
