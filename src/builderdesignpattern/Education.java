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
public class Education {
    
      private String Degree ; 
    private String Major; 
    private String school; 
    private int  year; 
    
      public Education(String Degree, String Major, String school, int year) {
        this.Degree = Degree;
        this.Major = Major;
        this.school = school;
        this.year = year;
}

    public String getDegree() {
        return Degree;
    }

    public String getMajor() {
        return Major;
    }

    public String getSchool() {
        return school;
    }

    public int getYear() {
        return year;
    }

    public void setDegree(String Degree) {
        this.Degree = Degree;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setYear(int year) {
        this.year = year;
    }
      
      
}