package org.example;

public class Converter {
    public String toPounds(int userInputOunces) {
        float numPounds = ((float) userInputOunces) / 16;
        return String.format("%.4f lbs", numPounds);
    }
    public String toPoundsAndOunces(int userInputOunces) {
        int numPounds = userInputOunces / 16;
        int numOunces = userInputOunces % 16;
        return (numPounds + " lbs " + numOunces + " oz");
    }
}
