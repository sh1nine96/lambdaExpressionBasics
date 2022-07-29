package com.mywork.lambda;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lets get started...");

//        separate impl class and method calling
        MyInterface myInterface = new MyInterfaceImpl();
        myInterface.sayHI();

//        anonymous class for calling functional interface

        MyInterface i = new MyInterface() {
            @Override
            public void sayHI() {
                System.out.println("Say Hi using Anonymous class");
            }
        };
        i.sayHI();

        MyInterface i2 = new MyInterface() {
            @Override
            public void sayHI() {
                System.out.println("My second anonymous class");
            }
        };
        i2.sayHI();

//        Using our functional Interface with help of lambda expression

        MyInterface l = () -> {
            System.out.println("Say Hi with lambda expression");
        };
        l.sayHI();

//        We can even remove curly braces from lambda expression bcz it contanins only 1 statement

        MyInterface l2 = () -> System.out.println("Say Hi without curly braces");
        l2.sayHI();

//        Calling method from SumInter Interface

        SumInter sumInter = (int a, int  b)->{
            return a + b;
        };
        System.out.println(sumInter.sum(4, 8));
        System.out.println(sumInter.sum(11, 48));

//        We can even remove the "int" type and "curly braces" and even "return" here too & it will work

        SumInter sumInter1 = (a, b)-> a + b;
        System.out.println(sumInter1.sum(10, 25));
        System.out.println(sumInter1.sum(39, 31));

//        Here we will be calling our getStringLength method with lambda expression

        LengthInterface lengthInterface = str -> str.length();
        System.out.println("The length of the given string is: "+lengthInterface.getStringLength("Shubham"));

    }
    }

