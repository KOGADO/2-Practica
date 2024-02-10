package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите значение a: ");
            double a = scanner.nextDouble();
            System.out.print("Введите значение b: ");
            double b = scanner.nextDouble();
            System.out.print("Введите значение c: ");
            double c = scanner.nextDouble();

            if (a + b > c && b + c > a && c + a > b) {
                if (a == b && b == c) {
                    System.out.println("a, b и c являются сторонами равностороннего треугольника");
                } else if (a == b || b == c || c == a) {
                    System.out.println("a, b и c являются сторонами равнобедренного треугольника");
                } else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) || Math.pow(c, 2) + Math.pow(a, 2) == Math.pow(b, 2)) {
                    System.out.println("a, b и c являются сторонами прямоугольного треугольника");
                } else {
                    System.out.println("a, b и c являются сторонами обычного треугольника");
                }
            } else {
                System.out.println("такого тругольника не существует");
            }
        }while(true);
    }
}
