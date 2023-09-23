package RomainCalcs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calcs {
    public String сalculator(String primer) {
        String[] str = separator(primer);
        int result = 0;
        try {
            int firstEl = Integer.parseInt(str[0]);
            int secondEl = Integer.parseInt(str[2]);
            if ((firstEl > 10 || firstEl < 1) || (secondEl > 10 || secondEl < 1)) {
                throw new RuntimeException("Невверный ввод");
            }
            switch (str[1]) {
                case ("+"):
                    result = firstEl + secondEl;
                    break;
                case ("-"):
                    result = firstEl - secondEl;
                    break;
                case ("*"):
                    result = firstEl * secondEl;
                    break;
                case ("/"):
                    result = firstEl / secondEl;
                    break;
                default:
                    throw new RuntimeException("Неверный знак");
            }
            return String.valueOf(result);
        } catch (NumberFormatException e) {
            switch (str[0]) {
                case ("I"):
                    str[0] = "1";
                    break;
                case ("II"):
                    str[0] = "2";
                    break;
                case ("III"):
                    str[0] = "3";
                    break;
                case ("IV"):
                    str[0] = "4";
                    break;
                case ("V"):
                    str[0] = "5";
                    break;
                case ("VI"):
                    str[0] = "6";
                    break;
                case ("VII"):
                    str[0] = "7";
                    break;
                case ("VIII"):
                    str[0] = "8";
                    break;
                case ("IX"):
                    str[0] = "9";
                    break;
                case ("X"):
                    str[0] = "10";
                    break;
            }
            switch (str[2]) {
                case ("I"):
                    str[2] = "1";
                    break;
                case ("II"):
                    str[2] = "2";
                    break;
                case ("III"):
                    str[2] = "3";
                    break;
                case ("IV"):
                    str[2] = "4";
                    break;
                case ("V"):
                    str[2] = "5";
                    break;
                case ("VI"):
                    str[2] = "6";
                    break;
                case ("VII"):
                    str[2] = "7";
                    break;
                case ("VIII"):
                    str[2] = "8";
                    break;
                case ("IX"):
                    str[2] = "9";
                    break;
                case ("X"):
                    str[2] = "10";
                    break;
            }

            switch (str[1]) {
                case ("+"):
                    result = (Integer.parseInt(str[0]) + Integer.parseInt(str[2]));
                    break;
                case ("-"):
                    result = (Integer.parseInt(str[0]) - Integer.parseInt(str[2]));
                    break;
                case ("*"):
                    result = (Integer.parseInt(str[0]) * Integer.parseInt(str[2]));
                    break;
                case ("/"):
                    result = (Integer.parseInt(str[0]) / Integer.parseInt(str[2]));
                    break;
                default:
                    throw new RuntimeException("Неверный знак");
            }
            if(result < 1){
                throw new RuntimeException("Отрицательное римское число");
            }
            return UtilNumber.IntToRoman(result);
        }
    }

    private String[] separator(String primer2) {
        String[] massive = primer2.split(" ");
        boolean flag1;
        boolean flag2;
        if(massive.length>3){
            throw new RuntimeException("Много чисел");
        }
        try {
            Integer.parseInt(massive[0]);
            flag1 = true;
        } catch (Exception e) {
            flag1 = false;
        }
        try {
            Integer.parseInt(massive[2]);
            flag2 = true;
        } catch (Exception e) {
            flag2 = false;
        }
        if (flag1 == flag2) {
            return massive;
        } else {
            throw new RuntimeException("Невверный ввод");
        }
    }
}
