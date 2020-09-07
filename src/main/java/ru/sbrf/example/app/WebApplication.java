package ru.sbrf.example.app;

import ru.sbrf.example.app.validation.PhoneValidation;
import ru.sbrf.example.common.exeptions.app.PhoneValidationException;

public class WebApplication implements Application{
    @Override
    public void makePhonePayment() {

        String phone = "+71231234567";
        PhoneValidation phoneValidation = new PhoneValidation(phone);

        try {
            phoneValidation.checkLength().checkPrefix();
        }catch (PhoneValidationException ex){
           //for example
            System.out.println(ex);
            System.out.println(ex.getPhone());
            throw ex;
        }

    }
}
