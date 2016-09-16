package vsu.ru;

public class Main {

    public static void main(String[] args) {
        double a = -1.42;
        double b = 3.15;
        double eps = 0.0001;


        System.out.println(chord_method(a,b,eps));



	// write your code here
    }
    public static double chord_method (double a, double b, double eps ) {


        double result = 0;
        while (Math.abs(b - a) >= eps) {
            result = a + (function(b) * (b - a)) / (function(b) - function(a));
            if (function(a) * function(result) < 0) {
                b = result;
            } else if (function(result) * function(b) < 0) {
                a = result;
            } else {
                return result;
            }
            return result;
        }
        return result;


    }






    public static double function(double x) {
        return Math.pow(x, 2) + Math.sin(x)-1;
    }
}
