package ru.sbrf.example.client;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getPhoneNumber() {
        User user = new User("+8","1");
        assertEquals("+7",user.getPhoneNumber());
    }
}