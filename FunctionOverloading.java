/* Function Overloading: Same method name but different parameters in the same class.

Think of a calculator -
You might add:
two numbers
three numbers
decimal numbers
But the operation is still add.
So we keep the same method name add().

*/

public class FunctionOverloading {

/*    Calculator System

       Overload method add()
       i) int add(int a, int b)
       ii) double add(double a, double b)
       iii) int add(int a, int b, int c)
 */

    int add(int a,int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }


    /*
    Area Calculation
      Overload method area()
      i) double area(double radius)
      ii) double area(double l, double b)
      iii) double area(int side)
    */

    double area(double radius) {
        return 3.14*radius*radius; // Circle
    }

    double area(double l, double b) {
        return l*b; // Rectangle
    }

    double area(int side) {
        return side*side; // Square
    }

    // In the above example the method i.e area is same but the parameters are changing
    // from circle to rectangle to square.. This is called Overloading

    public static void main(String[] args) {

        FunctionOverloading calc = new FunctionOverloading(); // Object Creation

        // Class(blueprint) reference variable = new allocates memory and calls the constructor.

        // ADD METHODS
        System.out.println("Add two integers: " + calc.add(5,6));
        System.out.println("Add two decimals: " + calc.add(4.5,5.3));
        System.out.println("Add three integers: " + calc.add(5,4,5));

        // AREA METHODS
        double first = calc.area(6.3);
        double second = calc.area(20.4, 10.6);
        double third = calc.area(45);

        System.out.println("Circle Area: " + first);
        System.out.println("Rectangle Area: " + second);
        System.out.println("Square Area: " + third);
    }

}