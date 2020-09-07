package ru.sbrf.example.common.exeptions.app;

public class PhoneValidationException extends RuntimeException{

    private String phone;

    public PhoneValidationException(String message, String phone) {
        super(message);
        this.phone = phone;
    }

    public String getPhone(){
        return phone;
    }

    public PhoneValidationException() {
    }

    public PhoneValidationException(String message) {
        super(message);
    }

    public PhoneValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    public PhoneValidationException(Throwable cause) {
        super(cause);
    }

    public PhoneValidationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
