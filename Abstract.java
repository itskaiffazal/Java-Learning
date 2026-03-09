//Payment Class ---> amt,process(),print(

// Credit Card ,UPI  both will have different process

/*
Properties of Abstract Method :
    It is declared using abstract keyword
    It does not have a body
    It can't be private,static,final
    It should be overwritten in the child class


*/

/*

Properties of Abstract Class :
    It is declared using abstract keyword
    It can have both abstract and non-abstract methods
    It can't be instantiated
    It can have instance variables and all types of constructors
    (i.e default, parameterized, copy constructor) and concrete methods,static final members.
    Can't create object class 



*/


abstract class Payment{
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }
    abstract void process();
}

class Creditcard extends Payment{


    Creditcard(double amount) {
        super(amount);
    }

     void process() {
        System.out.println("Processing credit card payment of amount: " + amount);
    }

}


class UPI extends Payment{

    UPI(double amount) {
        super(amount);
    }

    void process() {
        System.out.println("Processing UPI payment of amount: " + amount);
    }
}

public class Abstract {
    public static void main(String[] args) {
        Payment payment1 = new Creditcard(1000);
        Payment payment2 = new UPI(500);

        payment1.process(); // Through Credit card
        payment2.process(); // Through UPI 
    }
}