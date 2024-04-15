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
public class Invoice {
    private String ProductId;
    private String ProductName;
    private String InstituteName;
    private LocalDate DateInvoice;

    public Invoice(String ProductId, String ProductName, String InstituteName, LocalDate DateInvoice) {
        this.ProductId = ProductId;
        this.ProductName = ProductName;
        this.InstituteName = InstituteName;
        this.DateInvoice = DateInvoice;
    }

    public String getProductId() {
        return ProductId;
    }

    public String getProductName() {
        return ProductName;
    }

    public String getInstituteName() {
        return InstituteName;
    }

    public LocalDate getDateInvoice() {
        return DateInvoice;
    }

    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public void setInstituteName(String InstituteName) {
        this.InstituteName = InstituteName;
    }

    public void setDateInvoice(LocalDate DateInvoice) {
        this.DateInvoice = DateInvoice;
    }

    @Override
    public String toString() {
        return "Invoice{" + "ProductId=" + ProductId + ", ProductName=" + ProductName + ", InstituteName=" + InstituteName + ", DateInvoice=" + DateInvoice + '}';
    }

    
}