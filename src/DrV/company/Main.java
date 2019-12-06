package DrV.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите проверяемый год");
        Scanner scanner = new Scanner (System.in);
        int year = scanner.nextInt();
         if (year % 400 == 0){
            System.out.println("ВВеденный год високосный");
         } else
            if (year % 100 == 0) {
            System.out.println("ВВеденный год не високосный");
           } else
            if (year % 4 == 0) {
            System.out.println("ВВеденный год високосный");
         } else {
            System.out.println("ВВеденный год не високосный");
        }
    }

}
