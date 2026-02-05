package com.xworkz.Programs.runner;

public class Factorial {
//    public static void main(String[] args) {
//        int num=5;
//        int fact=1;
//        for (int i=1;i<=num;i++){
//            fact=fact*i;
//        }
//        System.out.println("Factorial is : " + fact);
//    }




//    //Using Methods
//    public void factorial(int num){
//        int fact=1;
//        for (int i=1;i<=num;i++){
//            fact=fact*i;
//        }
//        System.out.println("Factorial is : " + fact);
//    }
//public static void main(String[] args) {
//    Factorial factorial=new Factorial();
//    factorial.factorial(9);
//}
//}






//Constructor
public Factorial(int num) {
    int fact = 1;
    int i = 1;
    while (i <= num) {
        fact = fact * i;
        i++;
    }
    System.out.println("Factorial is : " + fact);
}
    public static void main(String[] args) {
   Factorial factorial=new Factorial(6);
}
}