package by.andervyd.temp.scanner;

import java.util.Scanner;

public class CharScanner {
    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        System.out.println("Введіть ваш зріст:");
        double rost = info.nextDouble();
        System.out.println("Ваша стать чоловіча?Введіть y або n");
        char sex = info.next().charAt(0);
        System.out.println(sex);
        System.out.println("Введіть ваш вік:");
        int age = info.nextInt();
        System.out.println("Введіть вашу масу тіла:");
        int massa = info.nextInt();

        if (age < 19) {
            System.out.println("Ваш вік менше 19.");
        } else {
            double imt = massa / Math.pow(rost, 2);
            if (sex == 'y') {
                if (imt < 20) {
                    System.out.println("Нестача маси");
                } else if (imt > 20 && imt < 25) {
                    System.out.println("Нормальна масса");
                } else if (imt > 25 && imt < 30) {
                    System.out.println("надмірна маса");
                } else if (imt > 30 && imt < 40) {
                    System.out.println("Ожиріння");
                } else if (imt > 40) {
                    System.out.println("Тяжке ожиріння");
                }
            } else if (sex == 'n') {
                if (imt < 19) {
                    System.out.println("Нестача маси");
                } else if (imt > 19 && imt < 24) {
                    System.out.println("нормальна маса");
                } else if (imt > 25 && imt < 30) {
                    System.out.println("надмірна маса");
                } else if (imt > 30 && imt < 40) {
                    System.out.println("Ожиріння");
                } else if (imt > 40) {
                    System.out.println("Тяжке ожиріння");
                }
            } else {
                System.out.println("Невірно введена стать.");
            }
        }
    }
}

