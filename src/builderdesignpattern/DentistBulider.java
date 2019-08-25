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
public interface DentistBulider {
    

    public abstract void BuildPersonalInf(Personal personal);
    public abstract  void BuildBiosection(Biography biography);
    public abstract void BulidEduction(Education education);
    public abstract void BulidAdderss(Address address);
    public abstract void  BulidSpecility( Speciality speciality);



    
}
