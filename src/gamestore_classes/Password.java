/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamestore_classes;

import gamestore_classes.Verification;

/**
 *
 * @author Muhammad Haikal Aiman Bin Mohd Puat S59419
 */
public class Password implements Verification{
    
    private static String userPassword;
   
    public Password(String userPassword) {
        Password.userPassword = userPassword;
    }

    public static String getUserPassword() {
        return Password.userPassword;
    }
    
    @Override
    //validate password so that passsword contains at least 1 letter and 1 digit
    public boolean verifyPassword(String password) throws InvalidPasswordException {
        
        boolean flag = false;
        
        // for checking if password length
        // is between 8 and 15
        if (!((password.length() >= 7)
              && (password.length() <= 15))) {
            
            throw new InvalidPasswordException(1);
        }
  
        // to check space
        if (password.contains(" ")) {
            throw new InvalidPasswordException(2);
        }
        
        
        // to check digit exist or not
        if (true) {
            int count = 0;
  
            // check digits from 0 to 9
            for (int i = 0; i <= 9; i++) {
  
                // to convert int to string
                String str1 = Integer.toString(i);
  
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(3);
            }
        }
        
        //check if string contains atleast a digit and a letter
        for(int i = 0; i < password.length(); i++) {
            if(Character.isAlphabetic(password.charAt(i))) {
                flag = true;
            }  
        }  
        
        if(flag == false) {
            throw new InvalidPasswordException(4);
        }
        
        return true;
    }

    @Override
    public String generateVerification() {
        return "Successful Auhthorisation";
    }

    @Override
    public String toString() {
        return String.format("%s", getUserPassword());
    }   
}

 