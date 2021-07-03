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
public interface Verification {
    
    //declare a method to verify password ---> Use by : Password and Payment class
    public boolean verifyPassword(String var) throws InvalidPasswordException;
    public String generateVerification();
}
