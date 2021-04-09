package com.userregistration;
import java.util.Scanner;
import java.util.regex.Pattern;

/*@Description- class checks the entries for a user registration whether
 * a name is valid or not */

public class UserRegistration {
    // UC1 - First name starts with Cap and has minimum 3 characters
    public boolean firstName(String fN) {
        return (Pattern.matches("[A-Z]{1}[a-z]{3,}", fN) == true);
    }

    // UC2 - Last name starts with Cap and has minimum 3 characters
    public boolean lastName(String lN) {
        return (Pattern.matches("[A-Z]{1}[a-z]{3,}", lN) == true);
    }

    /*
     * UC 3 - enter a valid email UC 9 - Cleared All Sample Provided
     */
    public boolean email(String emailId) {
        return (Pattern.matches("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", emailId) == true);
    }

    // UC4 - Mobile Format
    public boolean mobile(String mobileNum) {
        return(Pattern.matches("(0|91)?\\s{1}[6-9][0-9]{9}", mobileNum) == true);
    }

    // UC 5 to 8 - Password
    public boolean password(String pass) {
        return ((Pattern.matches("[A-Z0-9a-z$%&*@!#]{8,}", pass) && Pattern.matches(".*[A-Z].*", pass) && Pattern.matches(".*[0-9].*", pass) && Pattern.matches(".*[\\W]{1}.*", pass)) == true);
    }

    public String happySad(String word) {
        if (word.contains("Sad"))
            return "Sad";
        else
            return "Happy";
    }

}
