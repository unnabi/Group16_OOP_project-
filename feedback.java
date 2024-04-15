/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author NUSRAT JAHAN
 */
public class feedback {
    string email,feedback;
    int id;

    public feedback() {
    }

    public string getEmail() {
        return email;
    }

    public string getFeedback() {
        return feedback;
    }

    public int getId() {
        return id;
    }

    public void setEmail(string email) {
        this.email = email;
    }

    public void setFeedback(string feedback) {
        this.feedback = feedback;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "feedback{" + "email=" + email + ", feedback=" + feedback + ", id=" + id + '}';
    }
    
}
