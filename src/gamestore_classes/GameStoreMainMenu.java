/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamestore_classes;

import gamestore_gui_classes.MainMenuGUI;
import javax.swing.JFrame;

/**
 *
 * @author Muhammad Haikal Aiman Bin Mohd Puat S59419
 */
public class GameStoreMainMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainMenuGUI menu = new MainMenuGUI();
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setVisible(true);
    }
    
}
