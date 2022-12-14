/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package brands;

import java.util.ArrayList;

/**
 *
 * @author Firas
 */
public class Brands {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //CREATED BRAND OBJECT 
        Brand GeneralMotors = new Brand("General Motors", "Michigan");
        GeneralMotors.setNumberOfProducts(30); // number of products is being set prior to creating a new product which will add the products number dynamically 
        //CREATED BRAND OBJECT 
        Brand Apple = new Brand("Apple", "California");
        Apple.setNumberOfProducts(500); // number of products is being set prior to creating a new product which will add the products number dynamically 
   
        //CREATED ARRAY LIST OF PRODUCTS
        ArrayList<Product> products = new ArrayList<>();
        
        //CREATED PRODUCT OBJECTS & ADDED THEM TO THE ARRAY LIST
        products.add(new Product("Chevrolet trax 2022", "Veihcle", GeneralMotors));
        products.add(new Product("Iphone 14", "smartphonr", Apple));
        //SETTING PRODUCT'S QUALITY
        products.get(0).setQuality("Fast");
        products.get(1).setQuality("reliable");
        
        //DISPLAYING DATA
        for(int i = 0; i < products.size(); i++){
            System.out.println(products.get(i).toString());
        }
        
    }
    
}
