/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamestore_classes;

/**
 *
 * @author Muhammad Haikal Aiman Bin Mohd Puat S59419
 */

abstract class ListOfItems {
    
    //Define instance variables for games
    protected String itemName;
    protected String itemAttribute;
    protected String itemDeveloper;
    protected int itemRating;
    protected int itemPrice;
    
    public ListOfItems () {}
    
    //Constructor for BuyDigitalGames class and Rent Games Class   
    public ListOfItems(String itemName, String itemAttribute ,String itemDeveloper, 
                       int itemRating, int itemPrice) {
        this.itemName = itemName;
        this.itemDeveloper = itemDeveloper;
        this.itemRating = itemRating;
        this.itemPrice = itemPrice;
        this.itemAttribute = itemAttribute;
    }

    public String getItemName() {
        return this.itemName;
    }

    public String getItemDeveloper() {
        return this.itemDeveloper;
    }

    public int getItemPrice() {
        return this.itemPrice;
    }

    public int getItemRating() {
        return this.itemRating;
    }

    public String getItemAttribute() {
        return this.itemAttribute;
    }
    
    protected abstract void itemDescription(); //method to display item details
}

