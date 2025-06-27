package Polyporphism;

public class MathMaiinn {
    public static void main(String[] args) {
        Mathunit unit = new Mathunit();

        int number = unit.substraction(12, 8);
        int number2 = unit.division(10, 2);

        System.out.println(number);
        System.out.println(number2);
    }
}

class Mathunit{
     int substraction(int x, int y){
        int  substraction = x - y;
        return substraction;
    }

     int division(int a, int b){
        int division = a / b;
        return division;
    }
}
