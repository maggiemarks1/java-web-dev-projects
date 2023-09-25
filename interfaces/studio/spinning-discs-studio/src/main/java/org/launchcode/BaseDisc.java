package org.launchcode;

public abstract class BaseDisc {
    private String loadName;
    private Double loadCapacity;
    private String loadContents;
    private String loadDiscType;

    public BaseDisc(String loadName, Double loadCapacity, String loadContents, String loadDiscType) {
        this.loadName = loadName;
        this.loadCapacity = loadCapacity;
        this.loadContents = loadContents;
        this.loadDiscType = loadDiscType;

    }
}
}
