package javaclasslabs.domain.test;

import javaclasslabs.domain.Bounce;

import java.util.Scanner;

public class BounceTest01 {
    public static void main(String[] args) {
        Bounce bounceTest01 = new Bounce();
        Thread thread1 = new Thread(bounceTest01);
        Scanner input = new Scanner(System.in);

        System.out.print("How many bounces? ");
        input.nextLine();
        bounceTest01.setMax_value(input.nextInt());

        thread1.start();
    }
}
