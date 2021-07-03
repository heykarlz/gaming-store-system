/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamestore_classes;

import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad Haikal Aiman Bin Mohd Puat S59419
 */
public class DigitalGames extends ListOfItems{
    
    private boolean GAMES_BOUGHT;
    
    public DigitalGames() {
       super();
       GAMES_BOUGHT = false;
    }
    
    public DigitalGames(String itemName, String itemAttribute ,String itemDeveloper, 
                       int itemRating, int itemPrice, boolean GAMES_BOUGHT) {
        
        super(itemName, itemAttribute, itemDeveloper, itemRating, itemPrice);
        setGAMES_BOUGHT(GAMES_BOUGHT);
    }

    public void setGAMES_BOUGHT(boolean GAMES_BOUGHT) {
        this.GAMES_BOUGHT = GAMES_BOUGHT;
    }

    public boolean getGamesBought() {
        return this.GAMES_BOUGHT;
    }
    
    //Override the method in superclass to display item's details
    @Override
    public void itemDescription() {
        JOptionPane pane = new JOptionPane();
        pane.setSize(new Dimension(360,150));
        pane.showMessageDialog(null, "\nTitle of the Game        : " + getItemName()
                                          + "\nDeveloper's name       : " + getItemDeveloper()
                                          + "\nGame's genre              : " + getItemAttribute()
                                          + "\nRating out of 100         : " + getItemRating()
                                          + "\nPrice of the game       : " + getItemPrice(),
                                          "Game Description", JOptionPane.INFORMATION_MESSAGE);
    }
}
