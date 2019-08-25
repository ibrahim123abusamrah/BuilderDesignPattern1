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
public class Personal {
    
  private String FirstName;
     private String LastName; 
     private String EmailAddress; 
     private String WebSite; 
     private int PhoneNumber;    
    
      public Personal(String FirstName, String LastName, String EmailAddress, String WebSite, int PhoneNumber) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.EmailAddress = EmailAddress;
        this.WebSite = WebSite;
        this.PhoneNumber = PhoneNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
 
}
