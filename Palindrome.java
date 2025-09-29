class Palindrome
{
public static void main(String[] args)
{
int num=121;
int number=num;
int reverse=0;
while(num>0){
int n=num%10;
reverse=reverse*10+n;
num=num/10;
}
if(number==reverse){  
    System.out.println("Palindrome :" + number);
    }else{
	System.out.println("Not palindrome :"+number);
}
} 
}
