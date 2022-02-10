package day_2;

public class Calculator {
    public static void main(String[] args) {
        //Task 1. Implement a simple calculator with 4 operations.
        // Each operation - different method.
        // Use it in the main method.

        double a= -5.66;
        double b= 10;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println();

        System.out.println("a+b="+add(a,b));
        System.out.println("a-b="+minus(a,b));
        System.out.println("a*b="+mult(a,b));
        System.out.println("a/b="+divide(a,b));
    }

    private static double divide(double a, double b) {
        return a/b;
    }

    private static double mult(double a, double b) {
        return a*b;
    }

    private static double minus(double a, double b) {
        return a-b;
    }

    private static double add(double a, double b){
        return a+b;

    }
}
