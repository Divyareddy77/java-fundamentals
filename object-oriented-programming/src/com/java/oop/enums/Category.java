package com.java.oop.enums;

public enum Category {
    ELECTRONICS,
    CLOTHING,
    ACCESSORIES,
    HOME_APPLIANCES;
    public int getDefaultDiscount(){
        return switch (this){
            case CLOTHING, HOME_APPLIANCES -> 10;
            case ELECTRONICS -> 5;
            case ACCESSORIES -> 6;

        };
    }
}
