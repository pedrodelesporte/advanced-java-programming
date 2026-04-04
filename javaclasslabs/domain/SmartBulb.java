package javaclasslabs.domain;

public class SmartBulb {
    public String location;
    public boolean active;
    public int dimIntensity;

    public SmartBulb(String location) {
        this.location = location;
    }

    public void turnOn(){
        this.active = true;
        dimIntensity = 50;
    }

    public void turnOff(){
        this.active = false;
        dimIntensity = 0;
    }

    public int setDimIntensity(int dimIntensity){
        if(dimIntensity >= 0 && dimIntensity <= 100){
            this.dimIntensity = dimIntensity;
        } else System.out.println("Invalid dimIntensity");
        return dimIntensity;
    }

    public void getLightSummary(){
        System.out.println(" ");
        System.out.println(this.location + " intensity of " + this.dimIntensity);
        System.out.println(this.location + " is " + this.active);
    }
}


