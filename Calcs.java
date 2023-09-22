package RomainCalcs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calcs {
    public static String IntToRoman(int num) {
        var keys = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        var vals = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder ret = new StringBuilder();
        int ind = 0;

        while (ind < keys.length) {
            while (num >= vals[ind]) {
                var d = num / vals[ind];
                num = num % vals[ind];
                for (int i = 0; i < d; i++)
                    ret.append(keys[ind]);
            }
            ind++;
        }

        return ret.toString();
    }

    public static String Calculator(String first, String znak, String second) {
//        Scanner sc = new Scanner(System.in);
//        String[] answer = sc.nextLine().split(" ");
        List<String> answer = new ArrayList<>();
        answer.add(first);
        answer.add(znak);
        answer.add(second);
        int result = 0;
        switch (answer.get(0)) {
            case ("I"):
                answer.set(0, "1");
                break;
            case ("II"):
                answer.set(0, "2");
                break;
            case ("III"):
                answer.set(0, "3");
                break;
            case ("IV"):
                answer.set(0, "4");
                break;
            case ("V"):
                answer.set(0, "5");
                break;
            case ("VI"):
                answer.set(0, "6");
                break;
            case ("VII"):
                answer.set(0, "7");
                break;
            case ("VIII"):
                answer.set(0, "8");
                break;
            case ("IX"):
                answer.set(0, "9");
                break;
            case ("X"):
                answer.set(0, "10");
                break;
        }
        switch (answer.get(2)) {
            case ("I"):
                answer.set(2, "1");
                break;
            case ("II"):
                answer.set(2, "2");
                break;
            case ("III"):
                answer.set(2, "3");
                break;
            case ("IV"):
                answer.set(2, "4");
                break;
            case ("V"):
                answer.set(2, "5");
                break;
            case ("VI"):
                answer.set(2, "6");
                break;
            case ("VII"):
                answer.set(2, "7");
                break;
            case ("VIII"):
                answer.set(2, "8");
                break;
            case ("IX"):
                answer.set(2, "9");
                break;
            case ("X"):
                answer.set(2, "10");
                break;
        }
        switch (answer.get(1)) {
            case ("+"):
                result = (Integer.parseInt(answer.get(0)) + Integer.parseInt(answer.get(2)));
                break;
            case ("-"):
                result = (Integer.parseInt(answer.get(0)) - Integer.parseInt(answer.get(2)));
                break;
            case ("*"):
                result = (Integer.parseInt(answer.get(0)) * Integer.parseInt(answer.get(2)));
                break;
            case ("/"):
                result = (Integer.parseInt(answer.get(0)) / Integer.parseInt(answer.get(2)));
                break;
        }
        return Calcs.IntToRoman(result);
    }
}
