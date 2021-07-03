/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamestore_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class Cart {
    
    private int quantity;
    private int price;
    private String name;
    private String type;
    
    Scanner scan = new Scanner(System.in);
    
    public static List<Integer> itemPriceList = new ArrayList<>();
    public static List<Integer> itemQuantity  = new ArrayList<>();
    public static List<String>  itemNameList  = new ArrayList<>();
    public static List<String>  itemType      = new ArrayList<>();
    
    public static int totalPrice;
    
    //default constructor
    public Cart() {}
    
    //2nd Constructor for DigitalGames
    public Cart(String name, int price) {
        
        this.name = formatString(name);
        this.price = price;
        addToCart(name, price);
    }
    
    //3rd Constructor for Merchandise
    public Cart(String name, int price, int quantity) {
        this.name = formatString(name);
        this.price = price;
        this.quantity = quantity;
        
        int newPrice = getPrice() * getQuantity();
        addToCart(name, newPrice, quantity);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }
    
    //Overload method 1 for Merchandise
    private static void addToCart(String name, int price, int quantity) {
        itemNameList.add(name);
        itemPriceList.add(price);
        itemQuantity.add(quantity);
        itemType.add("Merchandise");
    }
    
    //Overload Method 2 for DigitalGames
    private static void addToCart(String name, int price) {
        
        itemNameList.add(name);
        itemPriceList.add(price);
        itemQuantity.add(1);
        itemType.add("Digital Game");
    }
    
    //Method to edit the cart
    private void editCart() {
       
        System.out.print("\nInput the name of the item you wish to remove\nName : ");
        scan.next();
        String removeItemName = scan.nextLine();
            
            if(itemNameList.contains(removeItemName)) {
                 int index = itemNameList.indexOf(removeItemName);
            
                 itemNameList.remove(index);
                 itemPriceList.remove(index);
                 itemQuantity.remove(index);
                 itemType.remove(index);           
            } else {
                System.out.println("The item does not exist! Please try again\n");
            }
    }
    
    private String formatString(String itemName) {
        if(!itemName.equals("FIFA")) {
            itemName = getName();
            return String.format("%-10s", itemName);
        }
        return "FIFA";
    }
    
}