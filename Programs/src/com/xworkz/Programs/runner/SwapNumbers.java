package com.xworkz.Programs.runner;

public class SwapNumbers {
//    public static void main(String[] args) {
//        int a=5;int b=10;
//        System.out.println("Before Swapping : " + a + " " + b + " ");
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("After Swapping : " + a + " " + b + " ");
//    }



//    //Using Methods
//
//    public void swap(int a,int b){
//         a=a+b;
//         b=a-b;
//         a=a-b;
//        System.out.println("a = " + a + " b = " + b);
//    }
//
//    public static void main(String[] args) {
//        SwapNumbers sw=new SwapNumbers();
//        sw.swap(4,5);
//    }
//}




//Constructor
public SwapNumbers(int a,int b){
a=a+b;
b=a-b;
a=a-b;
    System.out.println(" a = " + a + " b = " + b);
}

    public static void main(String[] args) {
        SwapNumbers sw=new SwapNumbers(10,20);
    }
}
