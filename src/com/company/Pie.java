package com.company;

public class Pie {
    double pieLength;
    String pieType;

    public Pie(double pieLength, String pieType) {
        this.pieLength = pieLength;
        this.pieType = pieType;
    }

    public double getPieLength() {
        return pieLength;
    }

    public void setPieLength(double pieLength) {
        this.pieLength = pieLength;
    }

    public String getPieType() {
        return pieType;
    }

    public void setPieType(String pieType) {
        this.pieType = pieType;
    }
}
