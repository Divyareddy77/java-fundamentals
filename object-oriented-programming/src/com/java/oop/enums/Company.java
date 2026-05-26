package com.java.oop.enums;

public enum Company{
    APPLE("Apple"),
    SAMSUNG("Samsung"),
    LG("LG"),
    DELL("Dell");
    final String displayName;

    Company(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
