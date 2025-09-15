class LeapYear
{
public static void main(String[] args){
int start=1995;
int end=2025;
for(int year=start;year<=end;year++){
if(year%400==0){
System.out.println("LeapYear : " + year);
}else if(year%100==0){
System.out.println(" Not a Leap Year : " + year);
}else if(year%4==0){
System.out.println(" Leap Year : " + year);
}else{
System.out.println("Not a Leap Year : " +year);
}
}
}
}