package javaclasslabs.domain.test;

import javaclasslabs.domain.SmartBulb;

public class Control {
    public static void main(String[] args) {
        SmartBulb SmartBulb = new SmartBulb("Living room");

        SmartBulb.getLightSummary();

        SmartBulb.turnOn();

        SmartBulb.setDimIntensity(60);

        SmartBulb.getLightSummary();

        SmartBulb.turnOff();

        SmartBulb.getLightSummary();


    }
}
