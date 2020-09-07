package ru.sbrf.example.common;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhonePaymentTest {
    
    private PhonePayment phonePayment;
    

    @BeforeEach
    public  void init(){
        phonePayment = new PhonePayment("+71234567890",1,Currency.RUB);
    }

    @Test
    void test() {
        //Currency.RUB.code = 1;
        System.out.println(Currency.RUB.getCode());
    }
}