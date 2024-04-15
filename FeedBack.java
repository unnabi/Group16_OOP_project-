/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Asus
 */
public class FeedBack {
    private String ClientId;
    private String ClientComment;
    private String ProductName;

    public FeedBack(String ClientId, String ClientComment, String ProductName) {
        this.ClientId = ClientId;
        this.ClientComment = ClientComment;
        this.ProductName = ProductName;
    }

    public String getClientId() {
        return ClientId;
    }

    public String getClientComment() {
        return ClientComment;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    public void setClientComment(String ClientComment) {
        this.ClientComment = ClientComment;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    @Override
    public String toString() {
        return "FeedBack{" + "ClientId=" + ClientId + ", ClientComment=" + ClientComment + ", ProductName=" + ProductName + '}';
    }

}  