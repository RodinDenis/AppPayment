package ru.sbrf.example.app.validation;

import ru.sbrf.example.common.exeptions.app.PhoneValidationException;

import java.io.IOError;

import static org.junit.jupiter.api.Assertions.*;

class PhoneValidationTest {

//    PhoneValidation phoneValidation;

//    @org.junit.jupiter.api.BeforeEach
//    void setUp() {
//        phoneValidation = new PhoneValidation("+71234567890");
//    }
//
//    @org.junit.jupiter.api.AfterEach
//    void tearDown() {
//    }

    @org.junit.jupiter.api.Test
    void checkPrefixNotAPlus() {
        PhoneValidation phoneValidation = new PhoneValidation("-71234567890");
//        assertThrows(PhoneValidationException.class,() -> phoneValidation.checkPrefix());
        assertThrows(IOError.class,() -> phoneValidation.checkPrefix());

    }

    @org.junit.jupiter.api.Test
    void checkLength() {
    }
}