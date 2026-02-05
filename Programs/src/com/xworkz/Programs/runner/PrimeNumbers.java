package com.xworkz.Programs.runner;

public class PrimeNumbers {

    //if-else
    //    public static void main(String[] args) {
//        int num=4;
//        if(num<=1){
//            System.out.println("Not a prime NUmber");
//        } else if (num==2||num==3) {
//            System.out.println("Prime Number");
//        } else if (num%2==0|| num%3==0) {
//            System.out.println("Not a Prime NUmber");
//        }else {
//            System.out.println("Prime Number");
//        }
//    }




    //while-loop
//    public static void main(String[] args) {
//
//        int num = 7;
//        int count = 0;
//        int i = 1;
//
//        while (i <= num) {
//            if (num % i == 0) {
//                count++;
//            }
//            i++;
//        }
//
//        if (count == 2) {
//            System.out.println("Prime number");
//        } else {
//            System.out.println("Not a prime number");
//        }
//    }



    //Through constructor
//    public PrimeNumbers(int n) {
//        int count = 0;
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0)
//                count++;
//        }
//        if (count == 2) {
//            System.out.println("Prime");
//        } else {
//            System.out.println("Not Prime");
//        }
//    }
//
//    public static void main(String[] args) {
//        PrimeNumbers pm=new PrimeNumbers(3);
//    }





    //Through Array
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9,10,11};
        System.out.println("Prime NUmber are : ");
        for(int num:array){
            int count=0;
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(num);
            }
        }
    }
}