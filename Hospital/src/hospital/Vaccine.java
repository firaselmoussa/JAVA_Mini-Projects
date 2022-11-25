/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Firas
 */
public class Vaccine {
    private String name;
    private String expiryDate;
    private int dose;
    
    public Vaccine(String name, String expiryDate, int dose){
        this.name = name;
        this.expiryDate = expiryDate;
        this.dose = dose;
    }
    
    public String getName(){
        return name;
    }
    
    public String getExpiryDate(){
        return expiryDate;
    }
    
    public int getDose(){
        return dose;
    }
    
}