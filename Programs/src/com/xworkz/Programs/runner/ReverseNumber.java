package com.xworkz.Programs.runner;

public class ReverseNumber {
//    public static void main(String[] args) {
//        int num=1234;
//        int reverse=0;
//        while (num!=0){
//            int digit=num%10;
//            reverse=reverse*10+digit;
//            num=num/10;
//        }
//        System.out.println("Reverse Number is : " + reverse);
//    }





////Constructor
//    public ReverseNumber(int num){
//        int reverse=0;
//        while(num>0){
//            int digit=num%10;
//            reverse=reverse*10+digit;
//            num=num/10;
//        }
//        System.out.println("Reverse Number is : " + reverse);
//    }
//
//    public static void main(String[] args) {
//        ReverseNumber rs=new ReverseNumber(7173);
//
//    }
//}
//






//// Static Methods
//public static void reverse(int num){
//int reverse=0;
//while(num!=0){
//    int digit=num%10;
//    reverse=reverse*10+digit;
//    num=num/10;
//}
//    System.out.println("Reverse number is : " + reverse);
//}
//
//    public static void main(String[] args) {
//        //ReverseNumber reverseNumber=new ReverseNumber();
//        ReverseNumber.reverse(8916);
//    }
//}







//Instance method
public  void reverse(int num){
int reverse=0;
while(num!=0){
    int digit=num%10;
    reverse=reverse*10+digit;
    num=num/10;
}
    System.out.println("Reverse number is : " + reverse);
}

    public static void main(String[] args) {
        ReverseNumber reverseNumber=new ReverseNumber();
        reverseNumber.reverse(8901);
    }
    }