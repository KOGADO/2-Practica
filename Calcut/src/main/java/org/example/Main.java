package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        class DistanceCalculator {
            private static final double EARTH_RADIUS = 6371; // в километрах
            final Scanner scanner = new Scanner(System.in);
            public double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
                System.out.print("Введите широту первой точки: ");
                lat1 = scanner.nextDouble();
                System.out.print("Введите долготу первой точки: ");
                lon1 = scanner.nextDouble();
                System.out.print("Введите широту второй точки: ");
                lat2 = scanner.nextDouble();
                System.out.print("Введите долготу второй точки: ");
                lon2 = scanner.nextDouble();


                double lat1Rad = Math.toRadians(lat1);
                double lat2Rad = Math.toRadians(lat2);
                double lon1Rad = Math.toRadians(lon1);
                double lon2Rad = Math.toRadians(lon2);

                double dlon = lon2Rad - lon1Rad;
                double dlat = lat2Rad - lat1Rad;

                double a = Math.pow(Math.sin(dlat / 2), 2) + Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.pow(Math.sin(dlon / 2), 2);
                double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
                double distance = EARTH_RADIUS * c;

                return distance;
            }
        }
        DistanceCalculator calculator = new DistanceCalculator();
        double distance = calculator.calculateDistance(55, 37, 51, 45);
        System.out.println("Расстояние между первой и второй точками: " + distance + " км");
    }
}
