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
public class InvalidPasswordException extends Exception {
  
    int invalidPassword = 0;
  
    public InvalidPasswordException(int invalidPassword)
    {
        super("Invalid Password: ");
        this.invalidPassword = invalidPassword;
    }
  
    public String printMessage()
    {
        // Call constructor of parent Exception
        // according to the condition violated
      switch (invalidPassword) {
        
        // Password length should be
        // between 8 to 15 characters
        case 1:
            return ("Password length should be"
                    + " between 8 to 15 characters");
  
        // Password should not contain any space
        case 2:
            return ("Password should not"
                    + " contain any space");
  
        // Password should contain// at least one digit(0-9)
        case 3:
            return ("Password should contain"
                    + " at least one digit(0-9)");
  
        // Password should contain at least
        // one letter(A-Z)/(a-z)  
        case 4:
            return ("Password should contain at"
                    + " least one letter(A-Z) & (a-z)");
            
        case 0:
            return ("Mismatch Password! Please try again");                   
        }
  
        return ("");
    }
}
