/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author NUSRAT JAHAN
 */
public class donation {
    string projectname;
    int fundamaount,date;

    public donation(string projectname, int fundamaount, int date) {
        this.projectname = projectname;
        this.fundamaount = fundamaount;
        this.date = date;
    }

    public string getProjectname() {
        return projectname;
    }

    public int getFundamaount() {
        return fundamaount;
    }

    public int getDate() {
        return date;
    }

    public void setProjectname(string projectname) {
        this.projectname = projectname;
    }

    public void setFundamaount(int fundamaount) {
        this.fundamaount = fundamaount;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "donation{" + "projectname=" + projectname + ", fundamaount=" + fundamaount + ", date=" + date + '}';
    }
    
    
    
}
