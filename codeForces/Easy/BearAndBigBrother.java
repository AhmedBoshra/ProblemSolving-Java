package codeForces.Easy;

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        int counter = 0;

        while(value1 < value2){
            value1 *= 3;
            value2 *= 2;
            counter++;
        }
        System.out.println(counter);
    }
}
