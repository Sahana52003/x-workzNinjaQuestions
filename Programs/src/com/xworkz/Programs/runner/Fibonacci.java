package com.xworkz.Programs.runner;

public class Fibonacci {
//    public static void main(String[] args) {
//        int num=10;
//        int first=0,second=1;
//        System.out.print(first+" "+second+" ");
//        for (int i=2;i<num;i++){
//            int third=first+second;
//            System.out.print(third+" ");
//            first=second;
//            second=third;
//        }
//    }



    //Using Constructor

    public Fibonacci(int num){
        int first=0,second=1;
        System.out.println(first);
        System.out.println(second);
        for (int i=2;i<num;i++){
            int third=first+second;
            System.out.println(third);
            first=second;
            second=third;
        }
    }

    public static void main(String[] args) {
        Fibonacci fibonacci=new Fibonacci(5);
    }
}
