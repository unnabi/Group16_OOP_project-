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
public class Return {
    private int ClientId;
    private String TransactionId;
    private int  ProductId;
    private LocalDate Date;

    public Return(int ClientId, String TransactionId, int ProductId, LocalDate Date) {
        this.ClientId = ClientId;
        this.TransactionId = TransactionId;
        this.ProductId = ProductId;
        this.Date = Date;
    }

    public int getClientId() {
        return ClientId;
    }

    public String getTransactionId() {
        return TransactionId;
    }

    public int getProductId() {
        return ProductId;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setClientId(int ClientId) {
        this.ClientId = ClientId;
    }

    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    public void setProductId(int ProductId) {
        this.ProductId = ProductId;
    }

    public void setDate(LocalDate Date) {
        this.Date = Date;
    }

    @Override
    public String toString() {
        return "Return{" + "ClientId=" + ClientId + ", TransactionId=" + TransactionId + ", ProductId=" + ProductId + ", Date=" + Date + '}';
    }
    
}
