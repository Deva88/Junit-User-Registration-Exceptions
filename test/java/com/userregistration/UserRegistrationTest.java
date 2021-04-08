package com.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration ur= new UserRegistration();

    @Test
    public void fNValidation() {
        Assertions.assertTrue(ur.firstName("Devendra"));
    }
    @Test
    public void lNValidation() {
        Assertions.assertTrue(ur.lastName("Kumar"));
    }
    @Test
    public void emailValidation() {
        Assertions.assertTrue(ur.email("devendra.raj.sdm@gmail.com"));
    }
    @Test
    public void mobileValidation() {
        Assertions.assertTrue(ur.mobile("91 8123273639"));
    }
    @Test
    public void passwordValidation() {
        Assertions.assertTrue(ur.password("Bridgelabz@007"));
    }
    @Test
    public void givenString_whenEntered_shouldReturnSad() {
        Assertions.assertEquals("Sad",ur.happySad("Sad"));
    }

}