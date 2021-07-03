/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamestore_classes;

import gamestore_classes.ListOfItems;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad Haikal Aiman Bin Mohd Puat S59419
 */
public class Merchandise extends ListOfItems{
    
    private boolean MERCH_BOUGHT;
    
    public Merchandise() {
       super();
       MERCH_BOUGHT = false;
    }
    
    public Merchandise(String itemName, String itemAttribute ,String itemDeveloper, 
                       int itemRating, int itemPrice, boolean MERCH_BOUGHT) {
        super(itemName, itemAttribute, itemDeveloper, itemRating, itemPrice);
        this.MERCH_BOUGHT = MERCH_BOUGHT;
    }

    public void setMERCH_BOUGHT(boolean MERCH_BOUGHT) {
        this.MERCH_BOUGHT = MERCH_BOUGHT;
    }
    
    public boolean getMERCH_BOUGHT() {
        return this.MERCH_BOUGHT;
    }
    
    @Override
    public void itemDescription() {

        JOptionPane pane = new JOptionPane();
        pane.setSize(new Dimension(360,150));
        pane.showMessageDialog(null, "\nMerchandise       : " + getItemName()
                                   + "\nManufacturer      : " + getItemDeveloper()
                                   + "\nSpecialty              : " + getItemAttribute()
                                   + "\nRating of 100       : " + getItemRating()
                                   + "\nPrice of 1 unit     : " + getItemPrice(),
                                     "Merchandise Description", JOptionPane.INFORMATION_MESSAGE);
    }
}


