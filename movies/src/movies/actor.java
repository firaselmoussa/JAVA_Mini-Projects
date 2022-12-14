/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movies;

/**
 *
 * @author Firas
 */
public class Actor {
    //DATA FIELDS
    private String name;
    private String nationality;
    private int age;
    private String gender;
    private boolean isRetired;
    private boolean isMainCharacter;
    
    //CONSTRUCTOR
    public Actor(String name, String nationality, int age, String gender, boolean isRetired, boolean isMainCharacter){
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.gender = gender;
        this.isRetired = isRetired;
        this.isMainCharacter = isMainCharacter;
    }
    
    //GETTER METHODS
    public String getName(){
        return name;
    }
    
    public String getNationality(){
        return nationality;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getGender(){
        return gender;
    }
    
    public boolean isRetired(){
        return isRetired;
    }
    
    public boolean isMainCharacter(){
        return isMainCharacter;
    }
    
    //SETTER METHODS
    public void setName(String name){
        this.name = name;
    }
    
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    
    public void setAge(int age){
        this.age= age;
        if (age >= 70)
                isRetired = true;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public void setisRetired(boolean isRetired){
        this.isRetired = isRetired;
    }
    
    public void setisMainCharacter(boolean isMainCharacter){
        this.isMainCharacter = isMainCharacter;
    }
    
    //DESCRIPTION
    public String toString(){
        return "Ator: "+name+"\nNationality: "+nationality+"\nAge: "+age+"\nGender: "+gender+"\nRetired: "+isRetired+"\nMain Character: "+isMainCharacter;
    }
}
