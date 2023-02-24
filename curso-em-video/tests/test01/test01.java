package test01;

/**
 * test01
 */
public class test01 {

    public static void main(String[] args) {
        String name = "test01";
        System.out.println(name);
    }

    // increase a number by 1
    public static int increase(int num) {
        return num++;
    }

    // decrease a number by 1
    public static int decrease(int num) {
        return num--;
    }

    // add two numbers
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // subtract two numbers
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // multiply two numbers
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // divide two numbers
    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    // get the remainder of two numbers
    public static int remainder(int num1, int num2) {
        return num1 % num2;
    }

    // get the absolute value of a number
    public static int absolute(int num) {
        return Math.abs(num);
    }

}