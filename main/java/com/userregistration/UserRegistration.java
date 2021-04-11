package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface UserValidation
{
    public abstract void userValidation(String var);
}

public class UserRegistration
{
    public static void main(String[] args) {

        //first name using lambda expression
        UserValidation validation = (firstName) ->{
            Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{3,}$");
            Matcher matcher = pattern.matcher(firstName);
            boolean check = matcher.find();
            if(check)
                System.out.println("valid first name");
            else
                System.out.println("invalid name");
        };
        validation.userValidation("Devendra");

        //last name using lambda expression
        UserValidation validation1 = (lastName) ->{
            Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{3,}$");
            Matcher matcher = pattern.matcher(lastName);
            boolean check1 = matcher.find();
            if (check1)
                System.out.println("valid last name");
            else
                System.out.println("invalid last name");
        };
        validation1.userValidation("Kumar");

        //email using lambda expression
        UserValidation validation2 = (email) ->{
            Pattern pattern = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
            Matcher matcher = pattern.matcher(email);
            boolean check2 = matcher.find();
            if(check2)
                System.out.println("valid email");
            else
                System.out.println("invalid email");
        };
        validation2.userValidation("devendra.raj.sdm@gmail.com");

        //mobile number using lambda expression
        UserValidation validation3 = (mobileNumber) ->{
            Pattern pattern = Pattern.compile("(0|91)?\\s{1}[6-9][0-9]{9}");
            Matcher matcher = pattern.matcher(mobileNumber);
            boolean check3 = matcher.find();
            if(check3)
                System.out.println("valid mobile number");
            else
                System.out.println("invalid mobile number");
        };
        validation3.userValidation("91 8123273639");

        //password using lambda expression
        UserValidation userValidation4 = (password) ->{
            Pattern pattern = Pattern.compile("(\"[A-Z0-9a-z$%&*@!#]{8,}\", password) && (\".*[A-Z].*\", password) && (\".*[0-9].*\", password) && (\".*[\\W]{1}.*\", password)");
            Matcher matcher = pattern.matcher(password);
            boolean check4 = matcher.find();

            if(check4)
                System.out.println("valid password");
            else
                System.out.println("invalid password");
        };
        userValidation4.userValidation("Deva@88242");
    }
}