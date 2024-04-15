/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author NUSRAT JAHAN
 */
public class progressReport {
    string name,report;
    string id,date;

    public progressReport(string name, string report, string id, string date) {
        this.name = name;
        this.report = report;
        this.id = id;
        this.date = date;
    }

    public string getName() {
        return name;
    }

    public string getReport() {
        return report;
    }

    public string getId() {
        return id;
    }

    public string getDate() {
        return date;
    }

    public void setName(string name) {
        this.name = name;
    }

    public void setReport(string report) {
        this.report = report;
    }

    public void setId(string id) {
        this.id = id;
    }

    public void setDate(string date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "progressReport{" + "name=" + name + ", report=" + report + ", id=" + id + ", date=" + date + '}';
    }
    
    
    
}
