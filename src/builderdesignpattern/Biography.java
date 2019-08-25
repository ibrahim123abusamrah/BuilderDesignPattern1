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
public class Biography {
     private  int  LicenseCountryNumebr; 
    private int LicenseNumber; 
    private  int yearPractice; 
    private String Gender; 
    
    public Biography(int LicenseCountryNumebr, int LicenseNumber, int yearPractice, String Gender) {
        this.LicenseCountryNumebr = LicenseCountryNumebr;
        this.LicenseNumber = LicenseNumber;
        this.yearPractice = yearPractice;
        this.Gender = Gender;
    }

    public void setLicenseCountryNumebr(int LicenseCountryNumebr) {
        this.LicenseCountryNumebr = LicenseCountryNumebr;
    }

    public void setLicenseNumber(int LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    public void setYearPractice(int yearPractice) {
        this.yearPractice = yearPractice;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public int getLicenseCountryNumebr() {
        return LicenseCountryNumebr;
    }

    public int getLicenseNumber() {
        return LicenseNumber;
    }

    public int getYearPractice() {
        return yearPractice;
    }

    public String getGender() {
        return Gender;
    }
    
}
