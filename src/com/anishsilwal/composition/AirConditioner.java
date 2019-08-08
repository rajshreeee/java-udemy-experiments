package com.anishsilwal.composition;

public class AirConditioner {

    private float temperature;

    public AirConditioner() {
        this(26.0f);
    }

    public  AirConditioner(float temperature) {
        this.temperature = temperature;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
}
