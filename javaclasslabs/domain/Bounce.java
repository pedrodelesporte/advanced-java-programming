package javaclasslabs.domain;

public class Bounce implements Runnable {

    public int max_value;

    public int getMax_value() {
        return max_value;
    }

    public void setMax_value(int max_value) {
        this.max_value = max_value;
    }

    @Override
    public void run() {

        for (int i = 0; i <= max_value; i++) {
            System.out.println("Bounce: " + i);


            for(int b = max_value; b >= 0; --b){
                System.out.println("Bounce B: " + b);
            }
        }



    }
}
