package ru.sbrf.example.common;

public enum Currency {
    RUB(643),
    RUR(810),  // old code 1998
    USD(840);

    //для примера. должен быть приватным
    private int code;

    Currency(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }
}
