package Polyporphism;

public class MainMath {
    public static void main(String[] args) {
        MathUnits mathUnits = new MathUnits();

        int my_number = mathUnits.add(5, 10);
        int my_number2 = mathUnits.add(2, 100);
        int sum_myNums = my_number + my_number2;

        mathUnits.multpl(10, 5);

        System.out.println(my_number);
        System.out.println(my_number2);
        System.out.println(sum_myNums);
    }
}


class MathUnits{
    int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    void multpl(int x,int y){
        int product = x * y;
        System.out.println(product);
    }
}