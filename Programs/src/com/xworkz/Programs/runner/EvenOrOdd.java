package com.xworkz.Programs.runner;

public class EvenOrOdd {
//    public static void main(String[] args) {
//        int num=4;
//        if(num%2==0){
//            System.out.println("Even number");
//        }else {
//            System.out.println("Odd number");
//        }
//    }
    public  EvenOrOdd(int n){
        if(n%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        EvenOrOdd evenOrOdd=new EvenOrOdd(11);

    }

//    public static void main(String[] args) {
//        int[] array={1,2,3,4,5,6,7,8,9,10};
//        System.out.println("Even Numbers : ");
//        for(int num:array){
//            if(num%2==0){
//                System.out.println("Even Numbers : " + num);
//            }
//        }
//        System.out.println("Odd Numbers : ");
//        for (int num:array){
//            if(num%2!=0){
//                System.out.println("Odd Numbers are : " + num);
//            }
//        }
//    }
}
