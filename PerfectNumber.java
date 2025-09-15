class PerfectNumber
{
public static void main(String[] args){
int num=6;
int sum=0;
   
for(int i=1;i<=num/2;i++){
if(num%i==0){
sum=sum+i;
System.out.print(" The divisible of " + num + " is : " + i ); 
}
}

if(sum==num){
System.out.println("Perfect Number : " + num);
}else{
System.out.println("Not a Perfect Number : " + num);
}
}
}