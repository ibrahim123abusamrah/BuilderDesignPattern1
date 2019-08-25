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
public class GeneralBuilder implements DentistBulider {

   
      private Personal personal;
    private Address address;
    private Education education ; 
    private Biography biography ;  
    private  Speciality speciality ;

    public GeneralBuilder(Personal personal, Address address, Education education, Biography biography, Speciality speciality) {
        this.personal = personal;
        this.address = address;
        this.education = education;
        this.biography = biography;
        this.speciality = speciality;
    }

  
   
    
    public void BuildPersonalInf(Personal personal) {
        this.personal = personal; 
    }

    public void BuildBiosection(Biography biography) {
this.biography = biography;
        }

    public void BulidEduction(Education education) {
this.education =education;
    }

    public void BulidAdderss(Address address) {
this.address =address;   }

    public void  BulidSpecility(  Speciality speciality) {
this.speciality =speciality ; 
    
    }
    
    
           public GeneralBuilder getResult() {
       
        return new GeneralBuilder(personal, address, education, biography,null);
    }
    
    
}
