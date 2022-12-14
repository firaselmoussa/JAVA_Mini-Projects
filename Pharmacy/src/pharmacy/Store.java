/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacy;

import java.util.ArrayList;
import java.util.LinkedList;
import pharmacy.OverCounter;
/**
 *
 * @author Firas
 */
public class Store {
    
    private String name, location;
    LinkedList<Medicine> medicines = new LinkedList<Medicine>();
    private int number_of_medicines;

    public Store(String name, String location, int number_of_medicines) {
        this.name = name;
        this.location = location;
        this.number_of_medicines = number_of_medicines;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public LinkedList<Medicine> getMedicines() {
        return medicines;
    }

    public int getNumber_of_medicines() {
        return number_of_medicines;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setMedicines(LinkedList<Medicine> medicines) {
        this.medicines = medicines;
    }

    public void setNumber_of_medicines(int number_of_medicines) {
        this.number_of_medicines = number_of_medicines;
    }
    
    
    public void addMedicine(Medicine m){
        medicines.add(m);
    }
    
    public double buyMedicine(String name){
        double price = 0;
        Medicine m;
        
        for(int i = 0; i < medicines.size(); i++){
            m = medicines.get(i);
            if(m.equals(name)){
                if (m instanceof OverCounter)
                    price = ((OverCounter) m).findPriceAfterTax();
                else if(m instanceof Prescription)
                    price = m.getPrice();
            }    
        }
        
        return price;
    }

    
    public ArrayList<Medicine> getOverCounterMeds(){
        ArrayList<Medicine> overCounterMeds = new ArrayList<>();
        Medicine m;
        
        for(int i = 0; i < medicines.size(); i++){
            m = medicines.get(i);
            
            if(m instanceof OverCounter)
                overCounterMeds.add(m);
        }
        
        return overCounterMeds;
    }
    
    
    
    @Override
    public String toString() {
        return "Store{" + "name=" + name + ", location=" + location + ", medicines=" + medicines + ", number_of_medicines=" + number_of_medicines + '}';
    }
    
    
    
}
