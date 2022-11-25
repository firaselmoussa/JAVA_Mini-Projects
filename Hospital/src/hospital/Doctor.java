/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Firas
 */
public class Doctor {
    private String name;
    private int id;
    private Vaccine vaccine;
    private boolean isVaccinated;
    private static int numberOfDoctors;
    
    public Doctor(String name, int id, Vaccine vaccine, boolean isVaccinated){
        this.name = name;
        if(id < 0)
            this.id = id*(-1);
        else
            this.id = id;
        this.vaccine = vaccine;
        this.isVaccinated = isVaccinated;
        numberOfDoctors++;
    }
    
    public String getName(){
        return name;
    }
    
    public int getId(){
        return id;
    }
    
    public Vaccine getVaccine(){
        return vaccine;
    }
    
    public boolean getisIsVaccinated(){
        return isVaccinated;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setVaccine(Vaccine vaccine){
        this.vaccine = vaccine;
    }
    
    public void setIsVaccinated(boolean isVaccinated){
        this.isVaccinated = isVaccinated;
    }
}
