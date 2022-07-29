package com.mywork.lambda;

public class ThreadDemo {
    public static void main(String[] args) {

//      Creating threads using lambda expression

      /*  Runnable thread1 = ()-> {
//            This is the body of the thread
//            Lets print 1 to 10 each after 1 sec

            for(int i =1; i<= 10; i++){
                System.out.println("The value of i is: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(thread1);
        t1.setName("Shubham");
        t1.start();*/

//        Now we will be creating table of 5 using lambda
        Runnable thread2 = ()->{
          for(int i = 1; i<=10; i++){
              System.out.println("5 X "+i+" = "+ i*5);
              try {
                  Thread.sleep(2000);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
        };

        Thread t2 = new Thread(thread2);
        t2.setName("Suhas");
        t2.start();

    }
}
