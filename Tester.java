package RomainCalcs;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calcs start = new Calcs();
        System.out.println(start.сalculator(sc.nextLine()));
    }
}
