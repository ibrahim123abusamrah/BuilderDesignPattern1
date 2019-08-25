/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdesignpattern;

/**
 *
 * @author IBRAHIM
 */
public class Speciality {
 private String  AreaOfSpcialization;  
     private int StartYear;     

    public Speciality(String AreaOfSpcialization, int StartYear) {
        this.AreaOfSpcialization = AreaOfSpcialization;
        this.StartYear = StartYear;
    }

    public String getAreaOfSpcialization() {
        return AreaOfSpcialization;
    }

    public int getStartYear() {
        return StartYear;
    }

    public void setAreaOfSpcialization(String AreaOfSpcialization) {
        this.AreaOfSpcialization = AreaOfSpcialization;
    }

    public void setStartYear(int StartYear) {
        this.StartYear = StartYear;
    }
     
     
}
